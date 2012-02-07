/**
 * 
 */
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
@Table(name = "Course_Coordintor")
public class CourseCoordintor extends DomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9113927271364590875L;
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

	public String getCoordinatorName() {
		String name = "";
		if (!namePrefix.equals("") && namePrefix != null) {
			name += namePrefix;
		}
		if (!firstName.equals("") && firstName != null) {
			name += " " + firstName;
		}
		if (!lastName.equals("") && lastName != null) {
			name += " " + lastName;
		}
		return name;
	}
}
