package com.rokonoid.apps.user.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
	private long roleId;
	@Column(name = "name")
	private String name;
	@Column(name = "start_time")
	private Date startTime;
	@Column(name = "update_time")
	private Date updateTime;
	@Column(name = "deleted")
	private boolean deleted;

	// @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	// @JoinColumn(name = "permissionId", insertable = true, updatable = true)
	// private List<Permission> permissions;
	//
	// @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	// @JoinColumn(name = "userId", insertable = true, updatable = true)
	// private List<User> users;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
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

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	// public List<Permission> getPermissions() {
	// return permissions;
	// }
	//
	// public void setPermissions(List<Permission> permissions) {
	// this.permissions = permissions;
	// }
	//
	// public List<User> getUsers() {
	// return users;
	// }
	//
	// public void setUsers(List<User> users) {
	// this.users = users;
	// }

}
