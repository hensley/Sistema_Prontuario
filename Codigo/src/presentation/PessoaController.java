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

//@WebServlet("/register")
public class PessoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    // Declaração do repositório
	PessoaRepository repositorio;
	
	// Construtor do servlet
    public PessoaController() {    	
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
			/*
			// Chamar página JSP
			RequestDispatcher editar = request.getRequestDispatcher("clientesEditar.jsp");
			editar.forward(request, response);
			return;*/
		}
		
		// Gera uma listagem de clientes
		List<Pessoa> pessoa = repositorio.getTop10ByName();
		
		// Passa a listagem para a página JSP
		request.setAttribute("pessoa", pessoa);
		
		// Chamar a página JSP
		RequestDispatcher listagem = request.getRequestDispatcher("cadastroFuncionario.jsp");
		listagem.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			// Recebe os parâmetros do formulário			
			Pessoa pessoa = new Pessoa();
			
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
			
			RequestDispatcher listagem = request.getRequestDispatcher("cadastroFuncionario.jsp");
			listagem.forward(request, response);			
			
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
