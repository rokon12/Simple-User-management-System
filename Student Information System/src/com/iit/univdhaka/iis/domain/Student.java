package com.iit.univdhaka.iis.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Bazlur Rahman Rokon
 * 
 */
@Entity
@Table(name = "student")
public class Student extends DomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8988461003823044065L;
	@Column(name = "academic_career")
	private String academicCareer;
	@Column(name = "academic_session")
	private String academicSession;
	@Column(name = "session_code")
	private String sessionCode;
	@Column(name = "class_number")
	private String classNumber;
	@Column(name = "class_section")
	private String classSection;
	@Column(name = "class_type")
	private String classType;
	@Column(name = "enrolment_status")
	private String enrolmentStatus;
	@Column(name = "enrolment_add_date")
	private Date enrolmentAddDate;
	@Column(name = "enrolment_drop_date")
	private Date enrolmentDropDate;

	public String getAcademicCareer() {
		return academicCareer;
	}

	public void setAcademicCareer(String academicCareer) {
		this.academicCareer = academicCareer;
	}

	public String getAcademicSession() {
		return academicSession;
	}

	public void setAcademicSession(String academicSession) {
		this.academicSession = academicSession;
	}

	public String getSessionCode() {
		return sessionCode;
	}

	public void setSessionCode(String sessionCode) {
		this.sessionCode = sessionCode;
	}

	public String getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}

	public String getClassSection() {
		return classSection;
	}

	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getEnrolmentStatus() {
		return enrolmentStatus;
	}

	public void setEnrolmentStatus(String enrolmentStatus) {
		this.enrolmentStatus = enrolmentStatus;
	}

	public Date getEnrolmentAddDate() {
		return enrolmentAddDate;
	}

	public void setEnrolmentAddDate(Date enrolmentAddDate) {
		this.enrolmentAddDate = enrolmentAddDate;
	}

	public Date getEnrolmentDropDate() {
		return enrolmentDropDate;
	}

	public void setEnrolmentDropDate(Date enrolmentDropDate) {
		this.enrolmentDropDate = enrolmentDropDate;
	}
}
