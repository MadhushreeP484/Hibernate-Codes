package onetoone.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrainPersonController {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		PersonDetails details =new PersonDetails(123456789012l, "Madhu", "Madhu@yahoo.com", 7654321098l);
		
		//Mapping
		Irctc irctc =new Irctc(1, "Varanasi Express", "Mysuru", "Varanasi", details);
		
		transaction.begin();
		entityManager.persist(irctc);
		entityManager.persist(details);
		transaction.commit();
		
		System.out.println("OneToOne Unidirectional Mapping is done");

	}

}
