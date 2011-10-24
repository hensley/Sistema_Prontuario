package presentation;

import domainModel.Exame;
import dataAccess.VacinaRepository;
import domainModel.Vacina;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class VacinaController extends HttpServlet{
	
VacinaRepository repositorio;
	
    public VacinaController() {    	
        super();        
        repositorio = new VacinaRepository();        
    }
    
    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String edit = request.getParameter("edit");
		
		if(edit != null){
			if(!edit.equalsIgnoreCase("new")){
				try {
					// Carrega o exame do BD 
					Vacina vacina = repositorio.Open(Integer.parseInt(edit));
					
					// Passa o exame para a pagina JSP 
					request.setAttribute("vacina", vacina);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					request.setAttribute("erro", e.getMessage());
				}
			}
			
		}
                 
                
		
		RequestDispatcher listagem = request.getRequestDispatcher("principal.jsp");
		listagem.forward(request, response);
                
	}


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	try {	
                System.out.println("TESTEVACINACONTROLER");
		Vacina vacina=new Vacina();
                
		
		String data_aplicacao = request.getParameter("data_aplicacao");
                String tipo_vacina = request.getParameter("tipo_vacina");
		String funcionario_responsavel = request.getParameter("funcionario_responsavel");
		String filho = request.getParameter("filho");
                String responsavel = request.getParameter("responsavel"); 
		
		vacina.setData_aplicacao(data_aplicacao);
                vacina.setTipo_vacina(tipo_vacina);
		vacina.setFuncionario_responsavel(funcionario_responsavel);
		vacina.setFilho(filho);
                vacina.setResponsavel(responsavel);
		
		
		repositorio.Save(vacina);
                System.out.println("TESTEVACINACONTROLER");
				
		RequestDispatcher listagem = request.getRequestDispatcher("principal.jsp");
		listagem.forward(request, response);
                
	}
	
	catch(Exception ex){
		ex.printStackTrace();
	}
}


}

