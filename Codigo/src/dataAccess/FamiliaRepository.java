package dataAccess;

import domainModel.Familia;

import java.util.List;

import javax.persistence.*;

public class FamiliaRepository {
	
	
	private EntityManager manager;
	private EntityManagerFactory factory;
	private EntityTransaction transaction;
	
	public FamiliaRepository() {
		factory = Persistence.createEntityManagerFactory("Prontuario"); 
		manager = factory.createEntityManager();
		
	}
	
	public void Save(Familia obj) throws Exception {
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
	
	public void Delete(Familia obj) throws Exception {
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
	
	public Familia Open(int id) throws Exception {
		try {
			return manager.find(Familia.class, id);
		}
		catch(Exception ex){
			throw ex;
		}
	}
	
	public List getTop10ByName() {
		return manager.createQuery("select c from familia c order by c.idfamilia")
		.setMaxResults(10).getResultList();
	}

}
