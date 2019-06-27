package Controlador;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Modelo.Conector;
import Modelo.Usuarios;

public class Main {
private static Session session;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Controlador.operaciones.altaUsuario(clie);
	
		//Controlador.operaciones.confirmarInicioSesion("asd", "asd");
		session = Conector.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Usuarios user= new Usuarios("123456ja", "Juan", "71470036V");
		
		
		tx.commit();
		session.close();
		
		System.exit(0);
		

	}
	
	public static void crearUsuario(Usuarios user){
		session.save(user);
	}

}
