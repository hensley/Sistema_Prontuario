package presentation;

import dataAccess.UsuarioRepository;
import domainModel.Usuario;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UsuarioController extends HttpServlet{
    private static final long serialVersionUID = 1L;
	
UsuarioRepository repositorio;
	
	
    public UsuarioController() {    	
        super();        
        repositorio = new UsuarioRepository();        
    }
    
    

    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	System.out.println("TesteUsariocontroller doget");
	
        request.getRequestDispatcher("index.jsp").forward(request, response);

        //meu RequestDispatcher listagem = request.getRequestDispatcher("userLogin.jsp");
	//meu	listagem.forward(request, response);
}



protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
                        System.out.println("TesteUsariodopost");
			String usuario = request.getParameter("usuario");
			String senha = request.getParameter("senha");


			Usuario user = repositorio.OpenByLogin(usuario);

			if(user == null){
				request.setAttribute("erro", "O login nao existe!");
				request.getRequestDispatcher("index.jsp").forward(request, response);
				return;
			}
			else {
				if(user.getSenha().equals(senha)){
					int id = user.getidAutenticacao();
					HttpSession session = request.getSession();
					session.setAttribute("usuario", Integer.toString(id));
					request.getRequestDispatcher("principal.jsp").forward(request, response);
					return;
				}
				else {
					request.setAttribute("erro", "Senha Invalida!");
					request.getRequestDispatcher("index.jsp").forward(request, response);
					return;
				}
			}
        }
        catch (Exception ex){

            ex.printStackTrace();

	}
                        
                        /*
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
 * 
 */
    
}
}
