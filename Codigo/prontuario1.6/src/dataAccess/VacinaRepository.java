package dataAccess;

import domainModel.Vacina;

import java.util.List;

import javax.persistence.*;

public class VacinaRepository {
 
	
	private EntityManager manager;
	private EntityManagerFactory factory;
	private EntityTransaction transaction;
	
	public VacinaRepository() {
		factory = Persistence.createEntityManagerFactory("Prontuario"); 
		manager = factory.createEntityManager();
		
	}
        
        //salvar
	
	public void Save(Vacina obj) throws Exception {
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
        
	public void Delete(Vacina obj) throws Exception {
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
         
         
	
	public Vacina Open(int id) throws Exception {
		try {
			return manager.find(Vacina.class, id);
		}
		catch(Exception ex){
			throw ex;
		}
	}
	
	public List getTop10ByName() {
		return manager.createQuery("select v from vacina v order by e.idvacina")
		.setMaxResults(10).getResultList();
	}
        

}

  

