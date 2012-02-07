package com.iit.univdhaka.iis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Bazlur Rahman Rokon
 * 
 */
@Entity
@Table(name = "program")
public class Program extends DomainObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8113993434362745916L;
	@Column(name = "program_Name")
	private String programName;
	@Column(name = "description")
	private String description;
	@Column(name = "short_Description")
	private String shortDescription;
	@Column(name = "academic_career")
	private String academicCareer;
	@Column(name = "academic_group")
	private String academicGroup;
	@Column(name = "colleage_code")
	private String colleageCode;
	@Column(name = "colleage_description")
	private String colleageDescription;
	@Column(name = "last_admin_term")
	private String lastAdminTerm;

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getAcademicCareer() {
		return academicCareer;
	}

	public void setAcademicCareer(String academicCareer) {
		this.academicCareer = academicCareer;
	}

	public String getAcademicGroup() {
		return academicGroup;
	}

	public void setAcademicGroup(String academicGroup) {
		this.academicGroup = academicGroup;
	}

	public String getColleageCode() {
		return colleageCode;
	}

	public void setColleageCode(String colleageCode) {
		this.colleageCode = colleageCode;
	}

	public String getColleageDescription() {
		return colleageDescription;
	}

	public void setColleageDescription(String colleageDescription) {
		this.colleageDescription = colleageDescription;
	}

	public String getLastAdminTerm() {
		return lastAdminTerm;
	}

	public void setLastAdminTerm(String lastAdminTerm) {
		this.lastAdminTerm = lastAdminTerm;
	}
}
