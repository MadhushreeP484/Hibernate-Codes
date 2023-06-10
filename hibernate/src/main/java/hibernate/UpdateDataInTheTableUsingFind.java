package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDataInTheTableUsingFind {

	public static void main(String[] args) {
		//using find()

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		CreateTableEntity cEntity = entityManager.find(CreateTableEntity.class, 2);
		cEntity.setName("Madhu");
		cEntity.setPhone(8901234567l);
		
		transaction.begin();
		entityManager.merge(cEntity);
		transaction.commit();
		
		System.out.println("data is updated");

	}

}
