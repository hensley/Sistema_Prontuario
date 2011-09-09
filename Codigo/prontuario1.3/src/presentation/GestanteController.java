package presentation;

import dataAccess.GestanteRepository;
import domainModel.Gestante;
import domainModel.Pessoa;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.util.List;

//@WebServlet("/register")
public class GestanteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
// Declaracao do repositorio
	GestanteRepository repositorio;
	
// Construtor do servlet
    public GestanteController() {    	
        super();        

// Inicializacao do repositorio
        repositorio = new GestanteRepository();        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//Verifica se o parametro edit foi passado
		String edit = request.getParameter("edit");
		
	//Codigo que executa quando o parametro edit e passado
		if(edit != null){
			if(!edit.equalsIgnoreCase("new")){
				try {
				// Carrega p o BD 
					Gestante gestante = repositorio.Open(Integer.parseInt(edit));
					
				// Passa para a pagina JSP 
					request.setAttribute("gestante", gestante);
					
				} catch (Exception e) {
				
                                // TODO Auto-generated catch block
					request.setAttribute("erro", e.getMessage());
				}
			}
			
			// Chamar pagina JSP
			//RequestDispatcher editar = request.getRequestDispatcher("cadastroPaciente.jsp");
			//editar.forward(request, response);
			//return;
		}
		
		// Gera uma listagem de clientes
		List<Gestante> gestante = repositorio.getTop10ByName();
		
		// Passa a listagem para a pagina JSP
		request.setAttribute("gestante", gestante);
		
		// Chamar a pagina JSP
		RequestDispatcher listagem = request.getRequestDispatcher("cadastro_gestante.jsp");
		listagem.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
                    // Recebe os parametros do formulario			
			Gestante gestante = new Gestante();
			
			String recen = request.getParameter("recen");
			String aborto = request.getParameter("aborto");
			String estadocivil = request.getParameter("estadocivil");
			String gestacaoant = request.getParameter("gestacaoant");
			String dum = request.getParameter("dum");
			//String idgestante = request.getParameter("idgestante");
			String paciente = request.getParameter("paciente");
                        String dpp = request.getParameter("dpp");
			
                        gestante.setdpp(dpp);
                        gestante.setpaciente(paciente);
                        gestante.setaborto(aborto);
                        gestante.setestadocivil(estadocivil);
                        gestante.setgestacaoant(gestacaoant);
                        gestante.setrecen(recen);
                        gestante.setdum(dum);
                      //  gestante.setidgestante(idgestante);
                                
		
			
			repositorio.Save(gestante);
			
			RequestDispatcher listagem = request.getRequestDispatcher("cadastro_gestante.jsp");
			listagem.forward(request, response);			
			
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
