package presentation;

import dataAccess.PessoaRepository;
import domainModel.Pessoa;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	PessoaRepository repositorio;
	
	public CadastroController() {    	
        super();        
        // Inicialização do repositório
        repositorio = new PessoaRepository();        
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher listagem = request.getRequestDispatcher("cadastro.jsp");
		listagem.forward(request, response);	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String aux = request.getParameter("cadastro");
			
			RequestDispatcher listagem = request.getRequestDispatcher(aux);
			listagem.forward(request, response);
		}
		
		catch(Exception ex){
			ex.printStackTrace();
	
		}
	}
}