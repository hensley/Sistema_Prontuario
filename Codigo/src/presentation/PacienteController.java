package presentation;

import domainModel.Paciente;
import dataAccess.PacienteRepository;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

public class PacienteController extends HttpServlet{
	
PacienteRepository repositorio;
	
	
    public PacienteController() {    	
        super();        
        repositorio = new PacienteRepository();        
    }

    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	System.out.println("Teste1");
	RequestDispatcher listagem = request.getRequestDispatcher("cadastroPaciente.jsp");
		listagem.forward(request, response);
	}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	try {
		
		Paciente paciente = new Paciente();
		
		String idfamilia =request.getParameter("idfamilia");
		String nome =request.getParameter("nome");
		String data_nascimento =request.getParameter("dataNascimento");
		String idade =request.getParameter("idade");
		String ocupacao =request.getParameter("ocupacao");
		String sexo =request.getParameter("sexo");
		
		paciente.setNome(nome);
		paciente.setData_nascimento(data_nascimento);
		paciente.setIdade(idade);
		paciente.setProfissao(ocupacao);
		paciente.setSexo(sexo);
		paciente.setIdfamilia(idfamilia);		
		
		repositorio.Save(paciente);
		
		RequestDispatcher listagem = request.getRequestDispatcher("cadastroPaciente.jsp");
		listagem.forward(request, response);
	}
	
	catch(Exception ex){
		ex.printStackTrace();
	}
}
    
}
