package manytomany.unidirection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TrainersInfo {

	
	private int tId;
	@Id
	private String tName;
	private String Subject;

	public TrainersInfo() {
		super();
	}

	public TrainersInfo(int tId, String tName, String subject) {
		super();
		this.tId = tId;
		this.tName = tName;
		Subject = subject;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

}
