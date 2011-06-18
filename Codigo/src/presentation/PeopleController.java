package presentation;

import domainModel.People;
import dataAccess.PeopleRepository;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.java.swing.plaf.windows.resources.windows;

import java.util.List;

/**
 * Servlet implementation class PeopleController
 */
//@WebServlet("/register")
public class PeopleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    // Declara��o do reposit�rio
	PeopleRepository repositorio;
	
	// Construtor do servlet
    public PeopleController() {    	
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
		RequestDispatcher listagem = request.getRequestDispatcher("register.jsp");
		listagem.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			// Recebe os par�metros do formul�rio			
			People pessoa = new People();
			
			String nome = request.getParameter("nome");
			String rg = request.getParameter("rg");
			String cpf = request.getParameter("cpf");
			String conselho_classe = request.getParameter("conselho_classe");
			String data_nascimento = request.getParameter("data_nascimento");
			String tel_fixo = request.getParameter("telefone_fixo");
			String tel_celular = request.getParameter("telefone_celular");
			String sexo = request.getParameter("sexo");
			String logradouro = request.getParameter("logradouro");
			String bairro = request.getParameter("bairro");
			String numero = request.getParameter("numero");
			String complemento = request.getParameter("complemento");
			String cidade = request.getParameter("cidade");
			String estado = request.getParameter("estado");
			String profissao = request.getParameter("profissao");
			
		
			pessoa.setNome(nome);
			pessoa.setRg(rg);
			pessoa.setCpf(cpf);
			pessoa.setConselho_classe(conselho_classe);
			pessoa.setData_nascimento(data_nascimento);
			pessoa.setTelefone_fixo(tel_fixo);
			pessoa.setTelefone_celular(tel_celular);
			pessoa.setSexo(sexo);
			pessoa.setLogradouro(logradouro);
			pessoa.setBairro(bairro);
			pessoa.setNumero(numero);
			pessoa.setComeplemento(complemento);
			pessoa.setCidade(cidade);
			pessoa.setEstado(estado);
			pessoa.setProfissao(profissao);
			
			repositorio.Save(pessoa);
			
			RequestDispatcher listagem = request.getRequestDispatcher("register.jsp");
			listagem.forward(request, response);			
			
			
			/*// Gera uma listagem de clientes
			List<Pessoa> clientes = repositorio.getTop10ByName();
			
			// Passa a listagem para a p�gina JSP
			request.setAttribute("clientes", clientes);
			
			// Chamar a p�gina JSP
			RequestDispatcher listagem = request.getRequestDispatcher("clientesListagem.jsp");
			listagem.forward(request, response);*/
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
