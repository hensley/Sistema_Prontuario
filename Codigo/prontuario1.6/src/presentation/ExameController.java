package presentation;

import domainModel.Exame;
import dataAccess.ExameRepository;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

public class ExameController extends HttpServlet{
	
ExameRepository repositorio;
	
    public ExameController() {    	
        super();        
        repositorio = new ExameRepository();        
    }
    
    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String edit = request.getParameter("edit");
		
		if(edit != null){
			if(!edit.equalsIgnoreCase("new")){
				try {
					// Carrega o exame do BD 
					Exame exame = repositorio.Open(Integer.parseInt(edit));
					
					// Passa o exame para a pagina JSP 
					request.setAttribute("exame", exame);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					request.setAttribute("erro", e.getMessage());
				}
			}
			
		}
                 
                
		
		RequestDispatcher listagem = request.getRequestDispatcher("principal.jsp");
		listagem.forward(request, response);
                
	}


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	try {	
                System.out.println("TESTECONSULTACONTROLER");
		Exame exame=new Exame();
                
		//int paciente = Integer.parseInt(request.getParameter ("paciente").toString());
		
		String tipo_exame = request.getParameter("tipo_exame");
                String laboratorio = request.getParameter("laboratorio");
               // int pessoa = Integer.parseInt(request.getParameter ("pessoa").toString());
		String data_exame = request.getParameter("data_exame");
		
		//exame.setPaciente(paciente);
		exame.setTipo_exame(tipo_exame);
                exame.setLaboratorio(laboratorio);
		//exame.setPessoa(pessoa);
		exame.setData_exame(data_exame);
		
		repositorio.Save(exame);
                System.out.println("TESTECONSULTACONTROLER");
				
		RequestDispatcher listagem = request.getRequestDispatcher("principal.jsp");
		listagem.forward(request, response);
                
	}
	
	catch(Exception ex){
		ex.printStackTrace();
	}
}


}

