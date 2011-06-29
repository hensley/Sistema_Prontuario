package dataAccess;

import domainModel.Usuario;

import java.util.List;

import javax.persistence.*;

public class UsuarioRepository {
	
	
	private EntityManager manager;
	private EntityManagerFactory factory;
	private EntityTransaction transaction;
	
	public UsuarioRepository() {
		factory = Persistence.createEntityManagerFactory("Prontuario"); 
		manager = factory.createEntityManager();
		
	}
	
	public void Save(Usuario obj) throws Exception {
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
	
	public void Delete(Usuario obj) throws Exception {
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
	
	public Usuario Open(int id) throws Exception {
		try {
			return manager.find(Usuario.class, id);
		}
		catch(Exception ex){
			throw ex;
		}
	}	
}
