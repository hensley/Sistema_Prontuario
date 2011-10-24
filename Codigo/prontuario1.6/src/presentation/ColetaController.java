package presentation;

import domainModel.Coleta;
import dataAccess.ColetaRepository;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ColetaController extends HttpServlet{
	
ColetaRepository repositorio;
	
    public ColetaController() {    	
        super();        
        repositorio = new ColetaRepository(); 
        
    }
    
    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String edit = request.getParameter("edit");
		
		if(edit != null){
			if(!edit.equalsIgnoreCase("new")){
				try {
					// Carrega o exame do BD 
					Coleta coleta = repositorio.Open(Integer.parseInt(edit));
					
					// Passa o exame para a pagina JSP 
					request.setAttribute("coleta", coleta);
					
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
                System.out.println("TESTECOLETA CONTROLLER");
		Coleta coleta=new Coleta();
                
		
		
		String funcionario_responsavel_coleta = request.getParameter("funcionario_responsavel_coleta");
                String psf = request.getParameter("psf");
		String data_coleta = request.getParameter("data_coleta");
                String paciente = request.getParameter ("paciente");
		
		coleta.setPaciente (paciente);
		coleta.setFuncionario_responsavel_coleta (funcionario_responsavel_coleta);
                coleta.setPsf(psf);
		coleta.setData_coleta(data_coleta);
		
		repositorio.Save(coleta);
                System.out.println("TESTECOleta CONTROLER");
				
		RequestDispatcher listagem = request.getRequestDispatcher("principal.jsp");
		listagem.forward(request, response);
                
	}
	
	catch(Exception ex){
		ex.printStackTrace();
	}
        

}

public void Voltar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			RequestDispatcher listagem = request.getRequestDispatcher("principal.jsp");
                        listagem.forward(request, response);
		}
		catch(Exception ex){
			throw ex;
		}
}


}

