package dataAccess;

import domainModel.Consulta;

import java.util.List;

import javax.persistence.*;

public class ConsultaRepository {
 
	
	private EntityManager manager;
	private EntityManagerFactory factory;
	private EntityTransaction transaction;
	
	public ConsultaRepository() {
		factory = Persistence.createEntityManagerFactory("Prontuario"); 
		manager = factory.createEntityManager();
		
	}
        
        //salvar
	
	public void Save(Consulta obj) throws Exception {
		try {
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(obj);
			transaction.commit();
		}
		catch(Exception ex){
			transaction.rollback();
			throw ex;
		}
	}
	//apagar
        
	public void Delete(Consulta obj) throws Exception {
		try {
			transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(obj);
			transaction.commit();
		}
		catch(Exception ex){
			transaction.rollback();
			throw ex;
		}
	}
         
         
	
	public Consulta Open(int id) throws Exception {
		try {
			return manager.find(Consulta.class, id);
		}
		catch(Exception ex){
			throw ex;
		}
	}
	
	public List getTop10ByName() {
		return manager.createQuery("select c from consulta c order by c.idconsulta")
		.setMaxResults(10).getResultList();
	}

}

