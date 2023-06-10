package com.jsp.onetomanyuni.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "actor")
public class ActorEntity {
	@Id
	@GeneratedValue(generator = "actorId")
	@SequenceGenerator(initialValue = 1400,allocationSize = 1, name = "actorId", sequenceName = "actorId")
	private int actorId;
	@Column(nullable = false, unique = true)
	private String actor;
	@Column(nullable = false, unique = true)
	private long phone;
	
	public ActorEntity() {
		System.out.println("Invoked "+this.getClass().getSimpleName());
	}

	public ActorEntity(String actor, long phone) {
		super();
		System.out.println("Invoked "+this.getClass().getSimpleName());
		this.actor = actor;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "ActorEntity [actorId=" + actorId + ", actor=" + actor + ", phone=" + phone + "]";
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	

}
