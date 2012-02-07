package com.iit.univdhaka.iis.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Bazlur Rahman Rokon
 * 
 */
@Entity
@Table(name = "degree")
public class Degree extends DomainObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7519823849604571526L;
	@Column(name = "degree_name")
	private String degreeName;
	@Column(name = "academic_career")
	private String academicCareer;
	@Column(name = "degree_code")
	private String degreeCode;
	@Column(name = "completion_term")
	private String completionTerm;
	@Column(name = "degree_date")
	private Date degreeDate;
	@Column(name = "academic_plan")
	private String academicPlan;
	@Column(name = "honours_code")
	private String honoursCode;
	@Column(name = "honours_description")
	private String honoursDescription;
	@Column(name = "endorsement")
	private String endorsement;

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public String getAcademicCareer() {
		return academicCareer;
	}

	public void setAcademicCareer(String academicCareer) {
		this.academicCareer = academicCareer;
	}

	public String getDegreeCode() {
		return degreeCode;
	}

	public void setDegreeCode(String degreeCode) {
		this.degreeCode = degreeCode;
	}

	public String getCompletionTerm() {
		return completionTerm;
	}

	public void setCompletionTerm(String completionTerm) {
		this.completionTerm = completionTerm;
	}

	public Date getDegreeDate() {
		return degreeDate;
	}

	public void setDegreeDate(Date degreeDate) {
		this.degreeDate = degreeDate;
	}

	public String getAcademicPlan() {
		return academicPlan;
	}

	public void setAcademicPlan(String academicPlan) {
		this.academicPlan = academicPlan;
	}

	public String getHonoursCode() {
		return honoursCode;
	}

	public void setHonoursCode(String honoursCode) {
		this.honoursCode = honoursCode;
	}

	public String getHonoursDescription() {
		return honoursDescription;
	}

	public void setHonoursDescription(String honoursDescription) {
		this.honoursDescription = honoursDescription;
	}

	public String getEndorsement() {
		return endorsement;
	}

	public void setEndorsement(String endorsement) {
		this.endorsement = endorsement;
	}

}
