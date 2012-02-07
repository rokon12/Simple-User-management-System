package com.iit.univdhaka.iis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Bazlur Rahman Rokon
 * 
 */
@Entity
@Table(name = "academy")
public class Academy extends DomainObject {

	private static final long serialVersionUID = 1513104029318147944L;
	@Column(name = "academy_name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "short_description")
	private String shortDescription;
	@Column(name = "long_description")
	private String longDescription;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

}
