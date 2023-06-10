package onetomany.unidirection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankAccounts {
	
	@Id
	private int accId;
	private String accName;
	private String branch;
	
	public BankAccounts() {
		super();
	}

	public BankAccounts(int accId, String accName, String branch) {
		super();
		this.accId = accId;
		this.accName = accName;
		this.branch = branch;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	

}
