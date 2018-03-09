package com.example.actorsdirectory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACTOR")
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long actorId;
	private String actorName;
	private String actorGender;
	private int actorAge;
	private Long contactNumber;
	private String filmoGraphy;
	@Column(columnDefinition="varchar(255) default 'resources/images/actor'")
	private String profilePhoto;
	
	public Long getActorId() {
		return actorId;
	}
	public void setActorId(Long actorId) {
		this.actorId = actorId;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getActorGender() {
		return actorGender;
	}
	public void setActorGender(String actorGender) {
		this.actorGender = actorGender;
	}
	public int getActorAge() {
		return actorAge;
	}
	public void setActorAge(int actorAge) {
		this.actorAge = actorAge;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getFilmoGraphy() {
		return filmoGraphy;
	}
	public void setFilmoGraphy(String filmoGraphy) {
		this.filmoGraphy = filmoGraphy;
	}
	
	
}
