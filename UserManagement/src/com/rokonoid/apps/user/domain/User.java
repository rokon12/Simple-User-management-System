package com.rokonoid.apps.user.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = -1662783070608204291L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "")
	private Long userId;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Transient
	private String passwordConfirmed;
	@Column(name = "email")
	private String email;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "active")
	private boolean active;
	@Column(name = "deleted")
	private boolean deleted;
	@Column(name = "regDate")
	private Date regDate;
	@Column(name = "status")
	private Integer status;
	@Column(name = "languageId")
	private Long languageId;
	@Column(name = "resetHash")
	private String resetHash;
	@Column(name = "activateHash")
	private String activateHash;
	@Column(name = "lastlogin")
	private Date lastLogin;
	@Column(name = "levelId")
	private Long levelId;
	@Column(name = "pictureURI")
	private String pictureURI;
	@Column(name = "startTime")
	private Date startTime;
	@Column(name = "updateTime")
	private Date updateTime;
	@Column(name = "resethash")
	private String resethash;
	@Column(name = "activatehash")
	private String activatehash;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "roleId", insertable = true, updatable = true)
	private Role role;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "addressesId", insertable = true, updatable = true)
	private Addresses addresses;

	@Transient
	private UserLevel userlevel;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirmed() {
		return passwordConfirmed;
	}

	public void setPasswordConfirmed(String passwordConfirmed) {
		this.passwordConfirmed = passwordConfirmed;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}

	public String getResetHash() {
		return resetHash;
	}

	public void setResetHash(String resetHash) {
		this.resetHash = resetHash;
	}

	public String getActivateHash() {
		return activateHash;
	}

	public void setActivateHash(String activateHash) {
		this.activateHash = activateHash;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Long getLevel_id() {
		return levelId;
	}

	public void setLevel_id(Long levelId) {
		this.levelId = levelId;
	}

	public String getPictureURI() {
		return pictureURI;
	}

	public void setPictureURI(String pictureURI) {
		this.pictureURI = pictureURI;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Addresses getAddresses() {
		return addresses;
	}

	public void setAddresses(Addresses addresses) {
		this.addresses = addresses;
	}

	public UserLevel getUserlevel() {
		return userlevel;
	}

	public void setUserlevel(UserLevel userlevel) {
		this.userlevel = userlevel;
	}

	public String getActivatehash() {
		return activatehash;
	}

	public void setActivatehash(String activatehash) {
		this.activatehash = activatehash;
	}

	public String getResethash() {
		return resethash;
	}

	public void setResethash(String resethash) {
		this.resethash = resethash;
	}
}
