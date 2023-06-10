package manytoone.unidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GooglePayAppUserTester {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		GooglePayApp payApp = new GooglePayApp(4554, "HDFC", "madhuokhdfc@hdfc");
		
		GooglePayUsers users1 = new GooglePayUsers(7845, "Madhu", 7654321098l, payApp);
		GooglePayUsers users2 = new GooglePayUsers(4578, "Sneha", 7890123456l, payApp);
		GooglePayUsers users3 = new GooglePayUsers(5748, "Sampatti", 8765432109l, payApp);
		GooglePayUsers users4 = new GooglePayUsers(8754, "Neha", 8901234567l, payApp);
		
		transaction.begin();
		entityManager.persist(users1);
		entityManager.persist(users2);
		entityManager.persist(users3);
		entityManager.persist(users4);
		entityManager.persist(payApp);
		transaction.commit();
		
		System.out.println("ManyToOne Unidirection is done");

	}

}
