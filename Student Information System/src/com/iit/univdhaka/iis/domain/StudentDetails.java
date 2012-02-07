package com.iit.univdhaka.iis.domain;

import java.util.Date;
/**
 * @author Bazlur Rahman Rokon
 *
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Details")
public class StudentDetails extends DomainObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1337081118108928689L;
	@Column(name = "name_prefix")
	private String namePrefix;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "formal_name")
	private String formalName;
	@Column(name = "display_name")
	private String displayName;
	@Column(name = "gender")
	private String gender;
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	@Column(name = "disability_code")
	private String disabilityCode;
	@Column(name = "disability_description")
	private String disabilityDescription;
	@Column(name = "ethnicity_code")
	private String ethnicityCode;
	@Column(name = "ethinicity_description")
	private String ethinicityDescription;
	@Column(name = "nationality_description")
	private String nationalityDescription;
	@Column(name = "area_of_permanent")
	private String areaOfPermanent;
	@Column(name = "residence")
	private String residence;
	@Column(name = "residence_description")
	private String residenceDescription;
	@Column(name = "date_of_death")
	private String dateOfDeath;
	@Column(name = "dependency_code")
	private String dependencyCode;
	@Column(name = "dependency_description")
	private String dependencyDescription;

	
	public String getNamePrefix() {
		return namePrefix;
	}

	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFormalName() {
		return formalName;
	}

	public void setFormalName(String formalName) {
		this.formalName = formalName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDisabilityCode() {
		return disabilityCode;
	}

	public void setDisabilityCode(String disabilityCode) {
		this.disabilityCode = disabilityCode;
	}

	public String getDisabilityDescription() {
		return disabilityDescription;
	}

	public void setDisabilityDescription(String disabilityDescription) {
		this.disabilityDescription = disabilityDescription;
	}

	public String getEthnicityCode() {
		return ethnicityCode;
	}

	public void setEthnicityCode(String ethnicityCode) {
		this.ethnicityCode = ethnicityCode;
	}

	public String getEthinicityDescription() {
		return ethinicityDescription;
	}

	public void setEthinicityDescription(String ethinicityDescription) {
		this.ethinicityDescription = ethinicityDescription;
	}

	public String getNationalityDescription() {
		return nationalityDescription;
	}

	public void setNationalityDescription(String nationalityDescription) {
		this.nationalityDescription = nationalityDescription;
	}

	public String getAreaOfPermanent() {
		return areaOfPermanent;
	}

	public void setAreaOfPermanent(String areaOfPermanent) {
		this.areaOfPermanent = areaOfPermanent;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getResidenceDescription() {
		return residenceDescription;
	}

	public void setResidenceDescription(String residenceDescription) {
		this.residenceDescription = residenceDescription;
	}

	public String getDateOfDeath() {
		return dateOfDeath;
	}

	public void setDateOfDeath(String dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	public String getDependencyCode() {
		return dependencyCode;
	}

	public void setDependencyCode(String dependencyCode) {
		this.dependencyCode = dependencyCode;
	}

	public String getDependencyDescription() {
		return dependencyDescription;
	}

	public void setDependencyDescription(String dependencyDescription) {
		this.dependencyDescription = dependencyDescription;
	}

}
