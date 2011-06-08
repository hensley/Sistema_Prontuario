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

public class PessoaController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	PessoaRepository pessoaRepositorio;
	
	public PessoaController() {
        super();        
        pessoaRepositorio = new PessoaRepository();        
    }
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			//Recebe os parâmetros do formulário
			
			String cod = request.getParameter("codigo_pessoa");
			String nome = request.getParameter("nome_paciente");
			Pessoa pessoa=new Pessoa();
			// Carrega o objeto do banco de dados
			//Pessoa pessoa = pessoaRepositorio.Open(Integer.parseInt(cod));
			
			pessoa.setNome(nome);
			
			pessoaRepositorio.Save(pessoa);
			
			// Gera uma listagem de clientes
			List<Pessoa> clientes = pessoaRepositorio.getTop10ByName();
			
			// Passa a listagem para a página JSP
			request.setAttribute("pessoa", pessoa);
			
			// Chamar a página JSP
			RequestDispatcher listagem = request.getRequestDispatcher("cadastroPessoa.jsp");
			listagem.forward(request, response);
		}
		
		catch(Exception ex){
			
		}
	}
	
	
	
}
