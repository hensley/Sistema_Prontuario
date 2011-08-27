package presentation;

import dataAccess.*;
import domainModel.*;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BuscaController extends HttpServlet{
	
	PessoaRepository pessoaRepositorio;
	FamiliaRepository familiaRepositorio;
	
	public BuscaController() {    	
        super();        
        familiaRepositorio = new FamiliaRepository();
        pessoaRepositorio = new PessoaRepository();        
    }
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher listagem = request.getRequestDispatcher("busca.jsp");
		listagem.forward(request, response);	
	
	}
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String aux = request.getParameter("busca");
			String id = request.getParameter("codigo");
			
			if(aux.contentEquals("cadastroFuncionario")){				
				Pessoa pessoa=pessoaRepositorio.Open(Integer.parseInt(id));
				
				request.setAttribute("pessoas", pessoa);
				
				RequestDispatcher listagem = request.getRequestDispatcher("cadastroFuncionario.jsp");
				listagem.forward(request, response);
			}
			
			if(aux.contentEquals("cadastroFamilia")){	
				
				Familia familia= familiaRepositorio.Open(Integer.parseInt(id));
				
				request.setAttribute("familias", familia);
				
				RequestDispatcher listagem = request.getRequestDispatcher("cadastroFamilia.jsp");
				listagem.forward(request, response);
			}
			
			
		}
		
		catch(Exception ex){
			ex.printStackTrace();
	
		}
	}

}
