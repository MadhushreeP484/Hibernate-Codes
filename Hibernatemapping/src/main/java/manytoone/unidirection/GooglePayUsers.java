package manytoone.unidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class GooglePayUsers {

	@Id
	private int gPayPin;
	private String name;
	private long phone;
	
	@ManyToOne
	GooglePayApp payApp;
	
	public GooglePayUsers() {
		super();
	}

	public GooglePayUsers(int gPayPin, String name, long phone, GooglePayApp payApp) {
		super();
		this.gPayPin = gPayPin;
		this.name = name;
		this.phone = phone;
		this.payApp = payApp;
	}

	public int getgPayPin() {
		return gPayPin;
	}

	public String getName() {
		return name;
	}

	public long getPhone() {
		return phone;
	}

	public GooglePayApp getPayApp() {
		return payApp;
	}
	
	
	
}
