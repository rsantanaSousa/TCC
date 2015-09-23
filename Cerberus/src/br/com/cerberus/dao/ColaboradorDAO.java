package br.com.cerberus.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.cerberus.model.Colaborador;

public class ColaboradorDAO {
	private final Session session;
	
	
	public ColaboradorDAO() {
		
		this.session = CriadorDeSession.getSession();
	}


	public void salvarColaborador(Colaborador colaborador) {
	
			Transaction tx = session.beginTransaction();
			session.save(colaborador);        
			tx.commit();
			 
	}


	public  void updateColaborador(Colaborador colaborador) {
		
		 colaborador.setNome("Rsantana");
		 session.update(colaborador);
	}


	public void deleteColaborador(long id) {
		
		 Colaborador colaborador = (Colaborador) session.load(Colaborador.class,id);
		 Transaction tx = session.beginTransaction();
		 session.delete(colaborador);
		 tx.commit();
		 
	}
	
	

}