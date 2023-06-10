package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		CreateTableEntity createTableEntity = new CreateTableEntity(1, "Madhu", 7654321098l);
		
		CreateTableEntity createTableEntity1 = new CreateTableEntity();
		createTableEntity1.setId(2);
		createTableEntity1.setName("Sneha");
		createTableEntity1.setPhone(7890123456l);
		
		entityTransaction.begin();
		entityManager.persist(createTableEntity);
		entityManager.persist(createTableEntity1);
		entityTransaction.commit();
		
		System.out.println("data is inserted");

	}

}
