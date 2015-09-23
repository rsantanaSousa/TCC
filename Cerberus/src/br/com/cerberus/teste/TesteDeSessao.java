

package br.com.cerberus.teste;
import br.com.cerberus.dao.LoginDAO;
import br.com.cerberus.model.Login;

public class TesteDeSessao {

	  
	public static void main(String[] args) {
		   
		   
		 // Colaborador colaborador = criaColaborador(); 
		 // new ColaboradorDAO().salvarColaborador(colaborador);
		  // new ColaboradorDao().updateColaborador(colaborador);
		   //new ColaboradorDAO().deleteColaborador(14);
		
			Login login = new Login();
			login.setUser("rsantana");
			login.setPwd("ricardo13");
			boolean auten = new LoginDAO().validate(login.getUser(),login.getPwd());
			System.out.println("\nUsuario autenticado ? : " + auten);
			

			
			
			
			//new LoginDAO().salvarLogin(login);
	 }	

//		private static Colaborador criaColaborador() {
//			
//		   Colaborador colaborador = new Colaborador();
//		   colaborador.setNome("RicarwwwdoSssantana1");
//		   colaborador.setFuncao("Analista");
//		   colaborador.setSalario(811170.00);
//		   return colaborador;
//	
//	   
//}
//		
}