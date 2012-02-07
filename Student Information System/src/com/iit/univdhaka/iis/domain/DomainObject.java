package com.iit.univdhaka.iis.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Type;

/**
 * @author Bazlur Rahman Rokon
 * 
 */
@MappedSuperclass
public abstract class DomainObject implements Serializable {

	private static final long serialVersionUID = -2961576130337742071L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name = "date_created")
	private Date dateCreated;
	@Column(name = "date_last_updated")
	private Date dateLastUpdated;
	@Column(name = "deleted")
	@Type(type = "yes_no")
	private boolean deleted;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateLastUpdated() {
		return dateLastUpdated;
	}

	public void setDateLastUpdated(Date dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
}
