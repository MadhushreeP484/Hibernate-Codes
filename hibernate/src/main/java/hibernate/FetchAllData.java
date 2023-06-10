package hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FetchAllData {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select st from student st", CreateTableEntity.class);
		List<CreateTableEntity> list = query.getResultList();
		for (CreateTableEntity st : list) {
			System.out.println("id:"+st.getId()+" "+"name:"+st.getName()+" "+"phone:"+st.getPhone());
		}
	}

}
