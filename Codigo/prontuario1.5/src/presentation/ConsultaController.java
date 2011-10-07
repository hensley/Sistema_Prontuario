package presentation;

import domainModel.Consulta;
import domainModel.Familia;
import dataAccess.ConsultaRepository;
import dataAccess.FamiliaRepository;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

public class ConsultaController extends HttpServlet{
	
ConsultaRepository repositorio;
	
    public ConsultaController() {    	
        super();        
        repositorio = new ConsultaRepository();        
    }
    
    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String edit = request.getParameter("edit");
		
		if(edit != null){
			if(!edit.equalsIgnoreCase("new")){
				try {
					// Carrega a consulta do BD 
					Consulta consulta = repositorio.Open(Integer.parseInt(edit));
					
					// Passa a consulta para a pagina JSP 
					request.setAttribute("consulta", consulta);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					request.setAttribute("erro", e.getMessage());
				}
			}
			
		}
                 
                
		System.out.println("TESTECONSULTACONTROLER");
		RequestDispatcher listagem = request.getRequestDispatcher("gestacao.jsp");
		listagem.forward(request, response);
               
	}


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	try {
            
            if(request.getParameter("cpf") != null){
                
                FamiliaRepository repositoriofamilia = new FamiliaRepository();
                Familia familia = repositoriofamilia.getByCpf(request.getParameter("cpf").toString());
                
                request.setAttribute("familia", familia);
                
                RequestDispatcher listagem = request.getRequestDispatcher("gestacao.jsp");
		listagem.forward(request, response);
                return;
                
            }
		
		
	
                System.out.println("TESTECONSULTACONTROLER");
                Consulta consulta=new Consulta();
               // int paciente = Integer.parseInt(request.getParameter ("paciente").toString());
		String tipo_consulta = request.getParameter("tipo_consulta");
                String pessoa_f = request.getParameter("pessoa_f");
		//int pessoa = Integer.parseInt(request.getParameter ("pessoa").toString());
		String data_consulta = request.getParameter("data_consulta");
		
		//consulta.setPaciente(paciente);
		consulta.setTipo_consulta(tipo_consulta);
		//consulta.setPessoa(pessoa);
		consulta.setData_consulta(data_consulta);
                consulta.setPessoa_f(pessoa_f);
		 
		repositorio.Save(consulta);
                System.out.println("TESTECONSULTACONTROLER");
				
		RequestDispatcher listagem = request.getRequestDispatcher("gestacao.jsp");
		listagem.forward(request, response);
              
	}
	
	catch(Exception ex){
            System.out.println("TESTECONSULTACONTROLER");
		ex.printStackTrace();
	}
}


}

