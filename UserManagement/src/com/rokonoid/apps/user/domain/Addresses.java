package com.rokonoid.apps.user.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "addresses")
public class Addresses implements Serializable {

	private static final long serialVersionUID = -743210842440874098L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "addressesId")
	private Long addressesId;
	@Column(name = "additionalname")
	private String additionalName;
	@Column(name = "comment_field")
	private String comment;
	@Column(name = "fax")
	private String fax;
	@Column(name = "starttime")
	private Date startTime;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "stateId")
	private States states;
	@Column(name = "street")
	private String street;
	@Column(name = "town")
	private String town;
	@Column(name = "updateTime")
	private Date updateTime;
	@Column(name = "zip")
	private String zip;
	@Column(name = "deleted")
	private boolean deleted;
	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String phone;

	public Long getAddressesId() {
		return addressesId;
	}

	public void setAddressesId(Long addressesId) {
		this.addressesId = addressesId;
	}

	public String getAdditionalName() {
		return additionalName;
	}

	public void setAdditionalName(String additionalName) {
		this.additionalName = additionalName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public States getStates() {
		return states;
	}

	public void setStates(States states) {
		this.states = states;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
