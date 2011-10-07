package dataAccess;

import domainModel.Usuario;


import java.util.List;
import javax.persistence.*;

public class UsuarioRepository {
	
	
	private EntityManager maneger;
	private EntityManagerFactory factory;
	private EntityTransaction transaction;
	
	public UsuarioRepository() {
		factory = Persistence.createEntityManagerFactory("Prontuario"); 
		maneger = factory.createEntityManager();
		
	}
	
	public void Save(Usuario obj) throws Exception {
		try {
			transaction = maneger.getTransaction();
			transaction.begin();
			maneger.persist(obj);
			transaction.commit();
		}
		catch(Exception ex){
			transaction.rollback();
			throw ex;
		}
	}
	
	public void Delete(Usuario obj) throws Exception {
		try {
			transaction = maneger.getTransaction();
			transaction.begin();
			maneger.remove(obj);
			transaction.commit();
		}
		catch(Exception ex){
			transaction.rollback();
			throw ex;
		}
	}
	
	public Usuario Open(int id) throws Exception {
		try {
			return maneger.find(Usuario.class, id);
		}
		catch(Exception ex){
			throw ex;
		}
	}
        
        
       public List getTop10ByName(){
		return maneger.createQuery("select u from Usuario u order by u.nome")
		.setMaxResults(10).getResultList();
	}
       
       
        
        public List getTop10ByName(String busca){
		try{
			return maneger.createQuery("select a from autenticacao a where a.usuario = :b")
			.setParameter("b", busca)
			.setMaxResults(10).getResultList();
		}catch(Exception ex){
			ex.printStackTrace();

		}
		return null;
	}
        
        
        public Usuario OpenByLogin (String usuario){
		try{
			return (Usuario) maneger.createQuery("select a from Usuario  a where a.usuario =:log")
			.setParameter("log", usuario)
			.getSingleResult();		 
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}
          
         

        
}
