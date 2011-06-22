package presentation;

import domainModel.Family;
import dataAccess.FamilyRepository;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

public class FamilyController extends HttpServlet{
	
FamilyRepository repositorio;
	
    public FamilyController() {    	
        super();        
        repositorio = new FamilyRepository();        
    }
    
    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String edit = request.getParameter("edit");
		
		if(edit != null){
			if(!edit.equalsIgnoreCase("new")){
				try {
										// Carrega o cliente do BD 
					Family familia = repositorio.Open(Integer.parseInt(edit));
					
					// Passa o cliente para a página JSP 
					request.setAttribute("familia", familia);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					request.setAttribute("erro", e.getMessage());
				}
			}
			
		}
		
		RequestDispatcher listagem = request.getRequestDispatcher("familyRegistry.jsp");
		listagem.forward(request, response);
	}


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	try {	
		Family familia=new Family();
		
		String logradouro = request.getParameter("logradouro");
		String bairro = request.getParameter("bairro");
		String numero = request.getParameter("numero");
		String complemento = request.getParameter("complemento");
		String cidade = request.getParameter("cidade");
		String cep = request.getParameter("cep");
		String data_cadastro = request.getParameter("data_cadastro");
		
		familia.setLogradouro(logradouro);
		familia.setBairro(bairro);
		familia.setNumero(numero);
		familia.setComeplemento(complemento);
		familia.setCidade(cidade);
		familia.setCep(cep);
		familia.setData_cadastro(data_cadastro);
		
		repositorio.Save(familia);		
				
		RequestDispatcher listagem = request.getRequestDispatcher("familyRegistry.jsp");
		listagem.forward(request, response);
	}
	
	catch(Exception ex){
		ex.printStackTrace();
	}
}


}
