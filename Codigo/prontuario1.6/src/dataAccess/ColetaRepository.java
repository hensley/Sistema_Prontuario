

package dataAccess;

import domainModel.Coleta;

import java.util.List;

import javax.persistence.*;
/**
 *
 * @author JORDANA
 */
public class ColetaRepository {
    private EntityManager manager;
    private EntityManagerFactory factory;
    private EntityTransaction transaction;
    
    public ColetaRepository() {
	factory = Persistence.createEntityManagerFactory("Prontuario"); 
	manager = factory.createEntityManager();	
    }
    
    public void Save(Coleta obj) throws Exception {
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
        
	public void Delete(Coleta obj) throws Exception {
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
        
        public Coleta Open(int id) throws Exception {
		try {
			return manager.find(Coleta.class, id);
		}
		catch(Exception ex){
			throw ex;
		}
	}
	
        
	public List getTop10ByName() {
		return manager.createQuery("select c from coleta c order by c.idcoleta")
		.setMaxResults(10).getResultList();
	}
         
    
}

