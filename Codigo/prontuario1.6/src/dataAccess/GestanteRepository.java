
package dataAccess;

import domainModel.Gestante;

import java.util.List;

import javax.persistence.*;

public class GestanteRepository {
        private EntityManager manager;
	private EntityManagerFactory factory;
	private EntityTransaction transaction;
    
        public GestanteRepository() {
		factory = Persistence.createEntityManagerFactory("Prontuario"); 
		manager = factory.createEntityManager();
		
	}
	
	public void Save(Gestante obj) throws Exception {
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
	
	public void Delete(Gestante obj) throws Exception {
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
	
	public Gestante Open(int id) throws Exception {
		try {

                    return manager.find(Gestante.class, id);
		}
		catch(Exception ex){
			throw ex;
		}
	}
	
	public List getTop10ByName() {
		return manager.createQuery("select c from gestante c order by c.nome")
		.setMaxResults(10).getResultList();
	}
        
}
