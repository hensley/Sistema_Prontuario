package presentation;

import dataAccess.CriancaRepository;
import domainModel.Crianca;
import domainModel.Gestante;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.util.List;

//@WebServlet("/register")
public class CriancaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
// Declaracao do repositorio
	CriancaRepository repositorio;
	
// Construtor do servlet
    public CriancaController() {    	
        super();        

// Inicializacao do repositorio
        repositorio = new CriancaRepository();        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//Verifica se o parametro edit foi passado
		String edit = request.getParameter("edit");
		
	//Codigo que executa quando o parametro edit e passado
		if(edit != null){
			if(!edit.equalsIgnoreCase("new")){
				try {
				// Carrega p o BD 
					Crianca crianca = repositorio.Open(Integer.parseInt(edit));
					
				// Passa para a pagina JSP 
					request.setAttribute("crianca", crianca);
					
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
		List<Crianca> crianca = repositorio.getTop10ByName();
		
		// Passa a listagem para a pagina JSP
		request.setAttribute("crianca", crianca);
		
		// Chamar a pagina JSP
		RequestDispatcher listagem = request.getRequestDispatcher("vacinacao.jsp");
		listagem.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
                    // Recebe os parametros do formulario			
			Crianca crianca = new Crianca();
			
			String responsavel = request.getParameter("responsavel");
			String data_nascimento_crianca = request.getParameter("data_nascimento_crianca");
			String peso = request.getParameter("peso");
			String altura = request.getParameter("altura");
			String nome_crianca = request.getParameter("nome_crianca");
			String sexo_crianca = request.getParameter("sexo_crianca");
			String data_cadastro = request.getParameter("data_cadastro");
                       
			
                        crianca.setResponsavel(responsavel);
                        crianca.setData_nascimento_crianca(data_nascimento_crianca);
                        crianca.setPeso(peso);
                        crianca.setAltura(altura);
                        crianca.setNome_crianca(nome_crianca);
                        crianca.setSexo_crianca(sexo_crianca);
                        crianca.setData_cadastro(data_cadastro);
                        
			
			repositorio.Save(crianca);
			
			RequestDispatcher listagem = request.getRequestDispatcher("vacinacao.jsp");
			listagem.forward(request, response);			
			
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
