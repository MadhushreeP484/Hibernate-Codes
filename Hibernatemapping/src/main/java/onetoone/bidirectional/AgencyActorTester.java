package onetoone.bidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AgencyActorTester {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction= entityManager.getTransaction();
		
		Agency agency =new Agency(2, "GMMTV");
		ActorDetails actorDetails = new ActorDetails(4, "Win MetaWin", agency);
		agency.setActorDetails(actorDetails);
		
		transaction.begin();
		entityManager.persist(actorDetails);
		entityManager.persist(agency);
		transaction.commit();
		System.out.println("OneToOne Bidirectional Mapping is done");

	}

}
