package presentation;

import domainModel.Paciente;
import dataAccess.UsuarioRepository;
import domainModel.Usuario;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UsuarioController extends HttpServlet{
	
UsuarioRepository repositorio;
	
	
    public UsuarioController() {    	
        super();        
        repositorio = new UsuarioRepository();        
    }

    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	System.out.println("TesteUsario");
	RequestDispatcher listagem = request.getRequestDispatcher("userLogin.jsp");
		listagem.forward(request, response);
	}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	try {
		
		Usuario usuario = new Usuario();
		
		String idAutenticacao =request.getParameter("idAutenticacao");
		String Usuario =request.getParameter("usuario");
		String senha =request.getParameter("senha");
		
		usuario.setUsuario(Usuario);
                usuario.setSenha(senha);
                usuario.setidAutenticacao(idAutenticacao);
                
		
		repositorio.Save(usuario);
		
		RequestDispatcher listagem = request.getRequestDispatcher("userLogin");
		listagem.forward(request, response);
	}
	
	catch(Exception ex){
		ex.printStackTrace();
	}
}
    
}
