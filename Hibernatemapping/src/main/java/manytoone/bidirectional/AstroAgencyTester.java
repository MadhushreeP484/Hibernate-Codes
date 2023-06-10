package manytoone.bidirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AstroAgencyTester {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		SpaceAgency agency = new SpaceAgency("NASA", "America");
		
		AstronautsDetails details1 = new AstronautsDetails(44, "Kalpana Chawala", "India");
		AstronautsDetails details2 = new AstronautsDetails(48, "Satish Dhawan", "India");
		AstronautsDetails details3 = new AstronautsDetails(84, "Sunitha Wiliams", "India");
		AstronautsDetails details4 = new AstronautsDetails(88, "James", "America");
		
		List<AstronautsDetails> astros =new ArrayList<AstronautsDetails>();
		astros.add(details1);
		astros.add(details2);
		astros.add(details3);
		astros.add(details4);
		
		agency.setAstros(astros);
		
		details1.setAgency(agency);
		details2.setAgency(agency);
		details3.setAgency(agency);
		details4.setAgency(agency);
		
		transaction.begin();
		entityManager.persist(details1);
		entityManager.persist(details2);
		entityManager.persist(details3);
		entityManager.persist(details4);
		entityManager.persist(agency);
		transaction.commit();
		
		System.out.println("ManyToOne Bidirection is done");

	}

}
