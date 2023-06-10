package com.jsp.onetomanyuni.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "agency")
public class AgencyEntity {
	@Id
	private String agency;
	@Column(nullable = false, unique = true)
	private String place;
	@Column(nullable = false, unique = true)
	private long phone;

	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
	private List<ActorEntity> actorEntity;

	public AgencyEntity() {
		System.out.println("Invoked " + this.getClass().getSimpleName());
	}

	public AgencyEntity(String agency, String place, long phone) {
		super();
		System.out.println("Invoked " + this.getClass().getSimpleName());
		this.agency = agency;
		this.place = place;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "AgencyEntity [agency=" + agency + ", place=" + place + ", phone=" + phone + "]";
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<ActorEntity> getActorEntity() {
		return actorEntity;
	}

	public void setActorEntity(List<ActorEntity> actorEntity) {
		this.actorEntity = actorEntity;
	}

}
