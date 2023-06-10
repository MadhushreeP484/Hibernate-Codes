package onetomany.unidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PanBankTester {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		PanCard pan = new PanCard(4444, "Madhu", 7654321098l);
		
		BankAccounts acc1 = new BankAccounts(43215, "HDFC", "Gadag");
		BankAccounts acc2 = new BankAccounts(51234, "SBI", "Hubli");
		BankAccounts acc3 = new BankAccounts(67890, "AXIS", "Haveri");
		BankAccounts acc4 = new BankAccounts(90876, "IDFC", "Hasan");
		
		List<BankAccounts> accounts = new ArrayList<BankAccounts>();
		accounts.add(acc1);
		accounts.add(acc2);
		accounts.add(acc3);
		accounts.add(acc4);
		
		pan.setAccDetails(accounts);
		
		transaction.begin();
		entityManager.persist(acc1);
		entityManager.persist(acc2);
		entityManager.persist(acc3);
		entityManager.persist(acc4);
		entityManager.persist(pan);
		transaction.commit();
		
		System.out.println("OneTo Many Unidirection is done");

	}

}
