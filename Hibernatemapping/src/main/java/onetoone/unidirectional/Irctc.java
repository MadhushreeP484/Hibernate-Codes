package onetoone.unidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Irctc {
	
	@Id
	private int trainNum;
	private String trainName;
	private String trainDeparture;
	private String trainAparture;
	@OneToOne
	private PersonDetails personDetails;
	
	public Irctc() {
		super();
	}

	public Irctc(int trainNum, String trainName, String trainDeparture, String trainAparture,
			PersonDetails personDetails) {
		super();
		this.trainNum = trainNum;
		this.trainName = trainName;
		this.trainDeparture = trainDeparture;
		this.trainAparture = trainAparture;
		this.personDetails = personDetails;
	}

	public int getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(int trainNum) {
		this.trainNum = trainNum;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getTrainDeparture() {
		return trainDeparture;
	}

	public void setTrainDeparture(String trainDeparture) {
		this.trainDeparture = trainDeparture;
	}

	public String getTrainAparture() {
		return trainAparture;
	}

	public void setTrainAparture(String trainAparture) {
		this.trainAparture = trainAparture;
	}

	public PersonDetails getPersonDetails() {
		return personDetails;
	}

	public void setPersonDetails(PersonDetails personDetails) {
		this.personDetails = personDetails;
	}
	
}
