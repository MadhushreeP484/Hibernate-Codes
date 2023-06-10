package manytoone.bidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AstronautsDetails {
	
	@Id
	private int AstroCode;
	private String AstroName;
	private String OriginCountry;
	
	@ManyToOne
	SpaceAgency agency;

	public AstronautsDetails() {
		super();
	}

	public AstronautsDetails(int astroCode, String astroName, String originCountry) {
		super();
		AstroCode = astroCode;
		AstroName = astroName;
		OriginCountry = originCountry;
		
	}

	public int getAstroCode() {
		return AstroCode;
	}

	public void setAstroCode(int astroCode) {
		AstroCode = astroCode;
	}

	public String getAstroName() {
		return AstroName;
	}

	public void setAstroName(String astroName) {
		AstroName = astroName;
	}

	public String getOriginCountry() {
		return OriginCountry;
	}

	public void setOriginCountry(String originCountry) {
		OriginCountry = originCountry;
	}

	public SpaceAgency getAgency() {
		return agency;
	}

	public void setAgency(SpaceAgency agency) {
		this.agency = agency;
	}
	
	

}
