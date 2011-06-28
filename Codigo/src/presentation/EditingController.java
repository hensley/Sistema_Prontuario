package presentation;

import domainModel.People;
import dataAccess.PeopleRepository;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

public class EditingController extends HttpServlet{

	PeopleRepository repositorio;
	
	// Construtor do servlet
    public EditingController() {    	
        super();        
        // Inicialização do repositório
        repositorio = new PeopleRepository();        
    }
    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Verifica se o parâmetro edit foi passado
		String edit = request.getParameter("edit");
		
		//Código que executa quando o parâmetro edit é passado
		if(edit != null){
			if(!edit.equalsIgnoreCase("new")){
				try {
					// Carrega o cliente do BD 
					People pessoa = repositorio.Open(Integer.parseInt(edit));
					
					// Passa o cliente para a página JSP 
					request.setAttribute("pessoa", pessoa);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					request.setAttribute("erro", e.getMessage());
				}
			}
		}
		
		// Gera uma listagem de clientes
		List<People> pessoa = repositorio.getTop10ByName();
		
		// Passa a listagem para a página JSP
		request.setAttribute("pessoa", pessoa);
		
		// Chamar a página JSP
		RequestDispatcher listagem = request.getRequestDispatcher("editingRegistry.jsp");
		listagem.forward(request, response);
	}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	try {
		
		
		String id =request.getParameter("idPessoa");		
		People pessoa=repositorio.Open(Integer.parseInt(id));
		
		request.setAttribute("pessoa", pessoa);
		
		RequestDispatcher listagem = request.getRequestDispatcher("registry.jsp");
		listagem.forward(request, response);
	}
	
	catch(Exception ex){
		ex.printStackTrace();
	}
}
}
