package onetomany.unidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PanCard {
	
	@Id
	private int pan_id;
	private String name;
	private long phone;
	
	@OneToMany
	List<BankAccounts> accDetails;

	public PanCard() {
		super();
	}

	public PanCard(int pan_id, String name, long phone) {
		super();
		this.pan_id = pan_id;
		this.name = name;
		this.phone = phone;
		//this.accDetails = accDetails;
	}

	public int getPan_id() {
		return pan_id;
	}

	public void setPan_id(int pan_id) {
		this.pan_id = pan_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<BankAccounts> getAccDetails() {
		return accDetails;
	}

	public void setAccDetails(List<BankAccounts> accDetails) {
		this.accDetails = accDetails;
	}
	
	

}
