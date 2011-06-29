package presentation;

import domainModel.Familia;
import dataAccess.FamiliaRepository;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

public class FamiliaController extends HttpServlet{
	
FamiliaRepository repositorio;
	
    public FamiliaController() {    	
        super();        
        repositorio = new FamiliaRepository();        
    }
    
    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String edit = request.getParameter("edit");
		
		if(edit != null){
			if(!edit.equalsIgnoreCase("new")){
				try {
										// Carrega o cliente do BD 
					Familia familia = repositorio.Open(Integer.parseInt(edit));
					
					// Passa o cliente para a página JSP 
					request.setAttribute("familia", familia);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					request.setAttribute("erro", e.getMessage());
				}
			}
			
		}
		
		RequestDispatcher listagem = request.getRequestDispatcher("cadastroFamilia.jsp");
		listagem.forward(request, response);
	}


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	try {	
		Familia familia=new Familia();
		
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
				
		RequestDispatcher listagem = request.getRequestDispatcher("cadastroFamilia.jsp");
		listagem.forward(request, response);
	}
	
	catch(Exception ex){
		ex.printStackTrace();
	}
}


}
