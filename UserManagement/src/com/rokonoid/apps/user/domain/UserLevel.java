package com.rokonoid.apps.user.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userLevel")
public class UserLevel implements Serializable {

	private static final long serialVersionUID = -300959618828188096L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "levelId")
	private Long levelId;
	@Column(name = "description")
	private String description;
	@Column(name = "statusCode")
	private Integer statusCode;
	@Column(name = "startTime")
	private Date startTime;
	@Column(name = "updateTime")
	private Date updateTime;
	@Column(name = "deleted")
	private String deleted;

	public Long getLevelId() {
		return levelId;
	}

	public void setLevelId(Long levelId) {
		this.levelId = levelId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
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

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
