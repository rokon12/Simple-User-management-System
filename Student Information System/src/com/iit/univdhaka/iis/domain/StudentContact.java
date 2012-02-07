package com.iit.univdhaka.iis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Bazlur Rahman Rokon
 * 
 */
@Entity
@Table(name = "Student_Contact")
public class StudentContact extends DomainObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6846355028749159591L;
	@Column(name = "home_address_line_1")
	private String homeAddressLine1;
	@Column(name = "home_address_line_2")
	private String homeAddressLine2;
	@Column(name = "home_address_line_3")
	private String homeAddressLine3;
	@Column(name = "home_address_line_4")
	private String homeAddressLine4;
	@Column(name = "post_code")
	private String postCode;
	@Column(name = "country")
	private String country;
	@Column(name = "phone")
	private String phone;
	@Column(name = "email")
	private String email;
	@Column(name = "term_address_line_1")
	private String termAddressLine1;
	@Column(name = "term_address_line_2")
	private String termAddressLine2;
	@Column(name = "term_address_line_3")
	private String termAddressLine3;
	@Column(name = "term_address_line_4")
	private String termAddressLine4;
	@Column(name = "term_post_code")
	private String termPostCode;
	@Column(name = "term_country")
	private String termCountry;

	public String getHomeAddressLine1() {
		return homeAddressLine1;
	}

	public void setHomeAddressLine1(String homeAddressLine1) {
		this.homeAddressLine1 = homeAddressLine1;
	}

	public String getHomeAddressLine2() {
		return homeAddressLine2;
	}

	public void setHomeAddressLine2(String homeAddressLine2) {
		this.homeAddressLine2 = homeAddressLine2;
	}

	public String getHomeAddressLine3() {
		return homeAddressLine3;
	}

	public void setHomeAddressLine3(String homeAddressLine3) {
		this.homeAddressLine3 = homeAddressLine3;
	}

	public String getHomeAddressLine4() {
		return homeAddressLine4;
	}

	public void setHomeAddressLine4(String homeAddressLine4) {
		this.homeAddressLine4 = homeAddressLine4;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTermAddressLine1() {
		return termAddressLine1;
	}

	public void setTermAddressLine1(String termAddressLine1) {
		this.termAddressLine1 = termAddressLine1;
	}

	public String getTermAddressLine2() {
		return termAddressLine2;
	}

	public void setTermAddressLine2(String termAddressLine2) {
		this.termAddressLine2 = termAddressLine2;
	}

	public String getTermAddressLine3() {
		return termAddressLine3;
	}

	public void setTermAddressLine3(String termAddressLine3) {
		this.termAddressLine3 = termAddressLine3;
	}

	public String getTermAddressLine4() {
		return termAddressLine4;
	}

	public void setTermAddressLine4(String termAddressLine4) {
		this.termAddressLine4 = termAddressLine4;
	}

	public String getTermPostCode() {
		return termPostCode;
	}

	public void setTermPostCode(String termPostCode) {
		this.termPostCode = termPostCode;
	}

	public String getTermCountry() {
		return termCountry;
	}

	public void setTermCountry(String termCountry) {
		this.termCountry = termCountry;
	}

}
