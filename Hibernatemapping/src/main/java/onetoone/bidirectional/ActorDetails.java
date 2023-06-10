package onetoone.bidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ActorDetails {
	
	@Id
	private int id;
	private String actorName;
	
	@OneToOne
	private Agency agencyD;

	public ActorDetails() {
		super();
	}

	public ActorDetails(int id, String actorName, Agency agencyD) {
		super();
		this.id = id;
		this.actorName = actorName;
		this.agencyD = agencyD;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public Agency getAgencyD() {
		return agencyD;
	}

	public void setAgencyD(Agency agencyD) {
		this.agencyD = agencyD;
	}
	
	

}
