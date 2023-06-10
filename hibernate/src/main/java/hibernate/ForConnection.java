package hibernate;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ForConnection {       
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("dev");
		System.out.println("connection is established");
		System.out.println("table is created");
		
		
		  
	}

}
