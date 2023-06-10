package manytomany.unidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentTrainerTester {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		TrainersInfo trainersInfo1 = new TrainersInfo(100, "Preetham", "JDBC & Hibernate");
		TrainersInfo trainersInfo2 = new TrainersInfo(101, "Shridhar", "JDBC & Hibernate");
		TrainersInfo trainersInfo3 = new TrainersInfo(102, "Kiran", "Servlet");
		TrainersInfo trainersInfo4 = new TrainersInfo(103, "Saish", "Servlet");
		TrainersInfo trainersInfo5 = new TrainersInfo(104, "Laxman", "WebTech");
		TrainersInfo trainersInfo6 = new TrainersInfo(105, "Darshan", "WebTech");
		
		List<TrainersInfo> infos1 = new ArrayList<TrainersInfo>();
		infos1.add(trainersInfo1);
		infos1.add(trainersInfo2);
		infos1.add(trainersInfo3);
		infos1.add(trainersInfo4);
		infos1.add(trainersInfo5);
		infos1.add(trainersInfo6);
		
		List<TrainersInfo> infos2 = new ArrayList<TrainersInfo>();
		infos2.add(trainersInfo2);
		infos2.add(trainersInfo4);
		infos2.add(trainersInfo6);
		
		List<TrainersInfo> infos3 = new ArrayList<TrainersInfo>();
		infos3.add(trainersInfo1);
		infos3.add(trainersInfo3);
		infos3.add(trainersInfo5);
		
		StudentsInfo studentsInfo1 = new StudentsInfo(1, "Madhu", "Java Fullstack", infos2);
		StudentsInfo studentsInfo2 = new StudentsInfo(2, "Sneha", "Java Fullstack", infos3);
		StudentsInfo studentsInfo3 = new StudentsInfo(3, "Sham", "Java Fullstack", infos1);
		StudentsInfo studentsInfo4 = new StudentsInfo(4, "Javeriya", "Java Fullstack", infos2);
		
		transaction.begin();
		entityManager.persist(studentsInfo1);
		entityManager.persist(studentsInfo2);
		entityManager.persist(studentsInfo3);
		entityManager.persist(studentsInfo4);
		entityManager.persist(trainersInfo1);
		entityManager.persist(trainersInfo2);
		entityManager.persist(trainersInfo3);
		entityManager.persist(trainersInfo4);
		entityManager.persist(trainersInfo5);
		entityManager.persist(trainersInfo6);
		transaction.commit();
		
		System.out.println("ManyToMany Undirection is done");
		

	}

}
