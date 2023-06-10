package manytomany.unidirection;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class StudentsInfo {
	
	private int sId;
	@Id
	private String sName;
	private String courses;
	@ManyToMany
	List<TrainersInfo> trainersInfos;

	public StudentsInfo() {
		super();
	}

	public StudentsInfo(int sId, String sName, String courses, List<TrainersInfo> trainersInfos) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.courses = courses;
		this.trainersInfos = trainersInfos;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public List<TrainersInfo> getTrainersInfos() {
		return trainersInfos;
	}

	public void setTrainersInfos(List<TrainersInfo> trainersInfos) {
		this.trainersInfos = trainersInfos;
	}

}
