package manytoone.unidirection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GooglePayApp {

	@Id
	private int gPayId;
	private String name;
	private String upiId;

	public GooglePayApp() {
		super();
	}

	public GooglePayApp(int gPayId, String name, String upiId) {
		super();
		this.gPayId = gPayId;
		this.name = name;
		this.upiId = upiId;
	}

	public int getgPayId() {
		return gPayId;
	}

	public String getName() {
		return name;
	}

	public String getUpiId() {
		return upiId;
	}

}
