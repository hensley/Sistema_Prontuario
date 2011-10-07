
package dataAccess;

import domainModel.Crianca;

import java.util.List;

import javax.persistence.*;
/**
 *
 * @author JORDANA
 */
public class CriancaRepository {
    private EntityManager manager;
    private EntityManagerFactory factory;
    private EntityTransaction transaction;
    
    public CriancaRepository() {
	factory = Persistence.createEntityManagerFactory("Prontuario"); 
	manager = factory.createEntityManager();	
    }
    
    public void Save(Crianca obj) throws Exception {
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
        
	public void Delete(Crianca obj) throws Exception {
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
        
        public Crianca Open(int id) throws Exception {
		try {
			return manager.find(Crianca.class, id);
		}
		catch(Exception ex){
			throw ex;
		}
	}
	
        
	public List getTop10ByName() {
		return manager.createQuery("select c from crianca c order by c.idcrianca")
		.setMaxResults(10).getResultList();
	}
         
    
}
