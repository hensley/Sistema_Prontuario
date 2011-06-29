package presentation;

import domainModel.Pessoa;
import dataAccess.PessoaRepository;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

public class EditarController extends HttpServlet{

	PessoaRepository repositorio;
	
	// Construtor do servlet
    public EditarController() {    	
        super();        
        // Inicialização do repositório
        repositorio = new PessoaRepository();        
    }
    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Verifica se o parâmetro edit foi passado
		String edit = request.getParameter("edit");
		
		//Código que executa quando o parâmetro edit é passado
		if(edit != null){
			if(!edit.equalsIgnoreCase("new")){
				try {
					// Carrega o cliente do BD 
					Pessoa pessoa = repositorio.Open(Integer.parseInt(edit));
					
					// Passa o cliente para a página JSP 
					request.setAttribute("pessoa", pessoa);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					request.setAttribute("erro", e.getMessage());
				}
			}
		}
		
		// Gera uma listagem de clientes
		List<Pessoa> pessoa = repositorio.getTop10ByName();
		
		// Passa a listagem para a página JSP
		request.setAttribute("pessoa", pessoa);
		
		// Chamar a página JSP
		RequestDispatcher listagem = request.getRequestDispatcher("editarCadastro.jsp");
		listagem.forward(request, response);
	}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	try {
		
		String id =request.getParameter("idPessoa");
		
		Pessoa pessoa=repositorio.Open(Integer.parseInt(id));
				
		request.setAttribute("pessoas", pessoa);
		
		RequestDispatcher listagem = request.getRequestDispatcher("editarCadastro.jsp");
		listagem.forward(request, response);
	}
	
	catch(Exception ex){
		ex.printStackTrace();
	}
}
}
