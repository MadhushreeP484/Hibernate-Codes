package onetoone.bidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Agency {
	@Id
	private int id;
	private String agencyName;
	@OneToOne
	private ActorDetails actorDetails;
	
	public Agency() {
		super();
	}

	public Agency(int id, String agencyName) {
		super();
		this.id = id;
		this.agencyName = agencyName;
		//this.actorDetails = actorDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public ActorDetails getActorDetails() {
		return actorDetails;
	}

	public void setActorDetails(ActorDetails actorDetails) {
		this.actorDetails = actorDetails;
	}
	
	

}
