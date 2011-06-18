package presentation;

import domainModel.*;

import dataAccess.PeopleRepository;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Servlet implementation class clienteController
 */
//@WebServlet("/login")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    // Declara��o do reposit�rio
	PeopleRepository repositorio;
	
	
	// Construtor do servlet
    public loginController() {
        super();        
        // Inicializa��o do reposit�rio
        repositorio = new PeopleRepository();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Verifica se o par�metro edit foi passado
		String edit = request.getParameter("edit");
		
		//C�digo que executa quando o par�metro edit � passado
		if(edit != null){
			if(!edit.equalsIgnoreCase("new")){
				try {
										// Carrega o cliente do BD 
					People pessoa = repositorio.Open(Integer.parseInt(edit));
					
					// Passa o cliente para a p�gina JSP 
					request.setAttribute("pessoa", pessoa);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					request.setAttribute("erro", e.getMessage());
				}
			}
			/*
			// Chamar p�gina JSP
			RequestDispatcher editar = request.getRequestDispatcher("clientesEditar.jsp");
			editar.forward(request, response);
			return;*/
		}
		
		// Gera uma listagem de clientes
		List<People> pessoa = repositorio.getTop10ByName();
		
		// Passa a listagem para a p�gina JSP
		request.setAttribute("pessoa", pessoa);
		
		// Chamar a p�gina JSP
		RequestDispatcher listagem = request.getRequestDispatcher("userLogin.jsp");
		listagem.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			User usuario=new User();
			
			String user=request.getParameter("usuario");
			String password=request.getParameter("senha");
			
			usuario.setUsuario(user);
			usuario.setSenha(password);
			
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
