package com.iit.univdhaka.iis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Bazlur Rahman Rokon
 * 
 */
@Entity
@Table(name = "plan")
public class Plan extends DomainObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = -914297950952228595L;
	@Column(name = "academic_plan")
	private String academicPlan;
	@Column(name = "academic_program")
	private String academicProgram;
	@Column(name = "plan_name")
	private String planName;
	@Column(name = "plan_type")
	private String planType;
	@Column(name = "active")
	private boolean active;
	@Column(name = "degree")
	private String degree;
	@Column(name = "transcript_description")
	private String transcriptDescription;
	@Column(name = "last_admit_term")
	private String lastAdmitTerm;
	@Column(name = "owner")
	private String owner;
	@Column(name = "owner_description")
	private String ownerDescription;
	@Column(name = "prcent_owned")
	private float prcentOwned;

	public String getAcademicPlan() {
		return academicPlan;
	}

	public void setAcademicPlan(String academicPlan) {
		this.academicPlan = academicPlan;
	}

	public String getAcademicProgram() {
		return academicProgram;
	}

	public void setAcademicProgram(String academicProgram) {
		this.academicProgram = academicProgram;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getTranscriptDescription() {
		return transcriptDescription;
	}

	public void setTranscriptDescription(String transcriptDescription) {
		this.transcriptDescription = transcriptDescription;
	}

	public String getLastAdmitTerm() {
		return lastAdmitTerm;
	}

	public void setLastAdmitTerm(String lastAdmitTerm) {
		this.lastAdmitTerm = lastAdmitTerm;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwnerDescription() {
		return ownerDescription;
	}

	public void setOwnerDescription(String ownerDescription) {
		this.ownerDescription = ownerDescription;
	}

	public float getPrcentOwned() {
		return prcentOwned;
	}

	public void setPrcentOwned(float prcentOwned) {
		this.prcentOwned = prcentOwned;
	}
}
