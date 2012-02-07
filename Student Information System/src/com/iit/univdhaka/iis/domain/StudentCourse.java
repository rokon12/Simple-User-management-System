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
@Table(name = "Student_Course")
public class StudentCourse extends DomainObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1985752951726749474L;
	@Column(name = "academic_career")
	private String academicCareer;
	@Column(name = "academic_session")
	private String academicSession;
	@Column(name = "course_code")
	private String courseCode;
	@Column(name = "description")
	private String description;
	@Column(name = "subject")
	private String subject;
	@Column(name = "catalog_number")
	private String catalogNumber;
	@Column(name = "session_code")
	private String sessionCode;
	@Column(name = "campus")
	private String campus;
	@Column(name = "enrolment_add_date")
	private Date enrolmentAddDate;
	@Column(name = "enrolment_drop_date")
	private Date enrolmentDropDate;
	@Column(name = "grade_point")
	private float gradePoint;
	@Column(name = "grade_description")
	private String gradeDescription;
	@Column(name = "grade_basis")
	private String grade_basis;
	@Column(name = "grade_point_per_unit")
	private int gradePointPerUnit;
	@Column(name = "unit_taken")
	private int unitTaken;
	@Column(name = "unit_acheived")
	private int unitAcheived;

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

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCatalogNumber() {
		return catalogNumber;
	}

	public void setCatalogNumber(String catalogNumber) {
		this.catalogNumber = catalogNumber;
	}

	public String getSessionCode() {
		return sessionCode;
	}

	public void setSessionCode(String sessionCode) {
		this.sessionCode = sessionCode;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
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

	public float getGradePoint() {
		return gradePoint;
	}

	public void setGradePoint(float gradePoint) {
		this.gradePoint = gradePoint;
	}

	public String getGradeDescription() {
		return gradeDescription;
	}

	public void setGradeDescription(String gradeDescription) {
		this.gradeDescription = gradeDescription;
	}

	public String getGrade_basis() {
		return grade_basis;
	}

	public void setGrade_basis(String grade_basis) {
		this.grade_basis = grade_basis;
	}

	public int getGradePointPerUnit() {
		return gradePointPerUnit;
	}

	public void setGradePointPerUnit(int gradePointPerUnit) {
		this.gradePointPerUnit = gradePointPerUnit;
	}

	public int getUnitTaken() {
		return unitTaken;
	}

	public void setUnitTaken(int unitTaken) {
		this.unitTaken = unitTaken;
	}

	public int getUnitAcheived() {
		return unitAcheived;
	}

	public void setUnitAcheived(int unitAcheived) {
		this.unitAcheived = unitAcheived;
	}

}
