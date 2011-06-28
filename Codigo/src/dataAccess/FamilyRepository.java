package dataAccess;

import domainModel.Family;

import java.util.List;

import javax.persistence.*;

public class FamilyRepository {
	
	
	private EntityManager manager;
	private EntityManagerFactory factory;
	private EntityTransaction transaction;
	
	public FamilyRepository() {
		factory = Persistence.createEntityManagerFactory("Prontuario"); 
		manager = factory.createEntityManager();
		
	}
	
	public void Save(Family obj) throws Exception {
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
	
	public void Delete(Family obj) throws Exception {
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
	
	public Family Open(int id) throws Exception {
		try {
			return manager.find(Family.class, id);
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
