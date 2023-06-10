package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDataInTheTable {

	public static void main(String[] args) {
		//using merge()
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager  = entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		
		CreateTableEntity cEntity = new CreateTableEntity();
		cEntity.setId(1);
		cEntity.setName("Sampatti");
		cEntity.setPhone(98765432190l);
		
		transaction.begin();
		entityManager.merge(cEntity);
		transaction.commit();
		System.out.println("data is updated");

	}

}
