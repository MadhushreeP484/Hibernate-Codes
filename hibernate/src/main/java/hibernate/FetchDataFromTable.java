package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDataFromTable {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		
		CreateTableEntity cEntity = entityManager.find(CreateTableEntity.class, 1);
		System.out.println("id:"+cEntity.getId()+" "+"Name:"+cEntity.getName()+" "+"Phone:"+cEntity.getPhone());

	}

}
