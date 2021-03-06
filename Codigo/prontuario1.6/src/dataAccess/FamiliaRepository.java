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
        
        //salvar
	
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
	//apagar
        
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
        
        public Familia getByCpf(String cpf){
            try{
                return (Familia) manager.createQuery("select c from Familia c where c.cpf =:f")
                .setParameter("f", cpf)
                .getSingleResult();
            }catch(Exception e){
                e.printStackTrace();
            }
            return null;
        }

}
