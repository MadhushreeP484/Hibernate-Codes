package manytoone.bidirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SpaceAgency {
	
	@Id
	private String agency;
	private String country;

	@OneToMany
    List<AstronautsDetails> astros;

	public SpaceAgency() {
		super();
	}

	public SpaceAgency(String agency, String country) {
		super();
		this.agency = agency;
		this.country = country;
		
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<AstronautsDetails> getAstros() {
		return astros;
	}

	public void setAstros(List<AstronautsDetails> astros) {
		this.astros = astros;
	}
	
	
	
}
