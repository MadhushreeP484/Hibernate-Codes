package onetoone.unidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonDetails {
	
	@Id
	private long aadharNum;
	private String name;
	private String emailId;
	private long phone;
	
	public PersonDetails() {
		super();
	}
	public PersonDetails(long aadharNum, String name, String emailId, long phone) {
		super();
		this.aadharNum = aadharNum;
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
	}
	
	public long getAadharNum() {
		return aadharNum;
	}
	public void setAadharNum(int aadharNum) {
		this.aadharNum = aadharNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	

}
