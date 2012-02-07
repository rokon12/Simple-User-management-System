package com.iit.univdhaka.iis.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Bazlur Rahman Rokon
 * 
 */
@Entity
@Table(name = "course")
public class Course extends DomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "actieve")
	private boolean actieve;
	@Column(name = "course_code")
	private String courseCode;
	@Column(name = "course_title")
	private String courseTitle;
	@Column(name = "credit")
	private float credit;
	@Column(name = "description")
	private String description;
	@Column(name = "university_code")
	private String universityCode;// http://www.gla.ac.uk/services/it/forstaff/businessapplications/orgstructure/collegeandschoolorganisationalcodes/
	@Column(name = "course_level")
	private String courseLevel;
	@Column(name = "greading_basis")
	private String greadingBasis;
	@Column(name = "academic_group")
	private String academicGroup;
	@Column(name = "typically_offered")
	private String typicallyOffered;
	@Column(name = "prerquisite")
	private String prerquisite;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "course_coordintor_id", insertable = true, updatable = true)
	private CourseCoordintor courseCoordintor;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "academic_career_id", insertable = true, updatable = true)
	private AcademicCareer academicCareer;

	public boolean isActieve() {
		return actieve;
	}

	public void setActieve(boolean actieve) {
		this.actieve = actieve;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUniversityCode() {
		return universityCode;
	}

	public void setUniversityCode(String universityCode) {
		this.universityCode = universityCode;
	}

	public String getCourseLevel() {
		return courseLevel;
	}

	public void setCourseLevel(String courseLevel) {
		this.courseLevel = courseLevel;
	}

	public String getGreadingBasis() {
		return greadingBasis;
	}

	public void setGreadingBasis(String greadingBasis) {
		this.greadingBasis = greadingBasis;
	}

	public String getAcademicGroup() {
		return academicGroup;
	}

	public void setAcademicGroup(String academicGroup) {
		this.academicGroup = academicGroup;
	}

	public String getTypicallyOffered() {
		return typicallyOffered;
	}

	public void setTypicallyOffered(String typicallyOffered) {
		this.typicallyOffered = typicallyOffered;
	}

	public String getPrerquisite() {
		return prerquisite;
	}

	public void setPrerquisite(String prerquisite) {
		this.prerquisite = prerquisite;
	}

	public CourseCoordintor getCourseCoordintor() {
		return courseCoordintor;
	}

	public void setCourseCoordintor(CourseCoordintor courseCoordintor) {
		this.courseCoordintor = courseCoordintor;
	}

	public AcademicCareer getAcademicCareer() {
		return academicCareer;
	}

	public void setAcademicCareer(AcademicCareer academicCareer) {
		this.academicCareer = academicCareer;
	}

}
