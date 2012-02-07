package com.iit.univdhaka.iis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Valid values are=: EXTN- External Student, LLL- Lifelong learning UG-
 * Undergraduate, BIT- Bachelor in Information Technology, MIT- Masters in
 * Information Technology, PGDIT- Post graduate diploma in Information
 * Technology
 * 
 * and more can be added later
 * **/
/**
 * @author Bazlur Rahman Rokon
 * 
 */
@Entity
@Table(name = "academic_career")
public class AcademicCareer extends DomainObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = -521960474936991108L;
	@Column(name = "name")
	private String name;
	@Column(name = "short_name")
	private String shortName;
	@Column(name = "description")
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
