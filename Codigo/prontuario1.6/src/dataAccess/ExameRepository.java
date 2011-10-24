package dataAccess;

import domainModel.Exame;

import java.util.List;

import javax.persistence.*;

public class ExameRepository {
 
	
	private EntityManager manager;
	private EntityManagerFactory factory;
	private EntityTransaction transaction;
	
	public ExameRepository() {
		factory = Persistence.createEntityManagerFactory("Prontuario"); 
		manager = factory.createEntityManager();
		
	}
        
        //salvar
	
	public void Save(Exame obj) throws Exception {
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
        
	public void Delete(Exame obj) throws Exception {
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
         
         
	
	public Exame Open(int id) throws Exception {
		try {
			return manager.find(Exame.class, id);
		}
		catch(Exception ex){
			throw ex;
		}
	}
	
	public List getTop10ByName() {
		return manager.createQuery("select e from exame e order by e.idexame")
		.setMaxResults(10).getResultList();
	}
        

}

