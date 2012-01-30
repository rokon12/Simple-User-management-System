package com.rokonoid.apps.user.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATE")
public class States implements Serializable {

	private static final long serialVersionUID = 8496854969087298806L;
	@Id
	@GeneratedValue
	@Column(name = "state_id")
	private Long stateId;
	@Column(name = "name")
	private String name;
	@Column(name = "start_time")
	private Date startTime;
	@Column(name = "update_time")
	private Date updateTime;
	@Column(name = "deleted")
	private boolean deleted;

	public States() {
		super();
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
