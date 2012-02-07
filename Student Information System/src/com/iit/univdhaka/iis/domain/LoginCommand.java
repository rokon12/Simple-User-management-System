package com.iit.univdhaka.iis.domain;

/**
 * @author Bazlur Rahman Rokon
 * 
 */
public class LoginCommand {
	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
