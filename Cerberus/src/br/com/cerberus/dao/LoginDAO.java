package br.com.cerberus.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.cerberus.model.Login;

public class LoginDAO {
private final Session session;
	
	
	public LoginDAO() {
		
		this.session = CriadorDeSession.getSession();
	}


	public void salvarLogin(Login login) {
	
			Transaction tx = session.beginTransaction();
			session.save(login);        
			tx.commit();
			 
	}


	public  void updateLogin(Login login) {
		
		 login.setUser("Rsantana");
		 session.update(login);
	}

	public boolean validate(String user, String pwd){
		List<?> query = session.createQuery("FROM Login c WHERE c.user = :username AND c.pwd =:key")  
		        .setParameter("username", user)  
		        .setParameter("key",pwd).list();  
		  
		if (query.size()==1){ 
			return true; 
		}
		else{
			return false;
		} 

		
	}
	
	
}
