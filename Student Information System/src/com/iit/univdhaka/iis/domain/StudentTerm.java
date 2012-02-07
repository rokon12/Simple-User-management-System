package com.iit.univdhaka.iis.domain;

import java.util.Date;

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
@Table(name = "Student_Term")
public class StudentTerm extends DomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8045324673373664176L;

	@Column(name = "academic_session")
	private String academicSession;

	@Column(name = "primary_acaedemic_program")
	private String primaryAcaedemicProgram;
	@Column(name = "attendence_status")
	private String attendence_status;
	@Column(name = "form_of_study")
	private String formOfStudy;
	@Column(name = "withdraw_code")
	private String withdrawCode;
	@Column(name = "withdraw_reason")
	private String withdrawReason;
	@Column(name = "withdraw_date")
	private Date withdrawDate;
	@Column(name = "academic_level")
	private String academicLevel;
	@Column(name = "enrollment_date")
	private Date enrollmentDate;
	@Column(name = "termUnits_taken")
	private int termUnitsTaken;
	@Column(name = "termUnit_acheived")
	private int termUnitAcheived;
	@Column(name = "term_GPA")
	private float termGPA;
	@Column(name = "overall_GPA")
	private float overallGPA;
	@Column(name = "transfer_credit_unit")
	private int transferCreditUnit;
	@Column(name = "year_of_program")
	private int yearOfProgram;
	@Column(name = "year_of_study")
	private int yearOfStudy;
	@Column(name = "aniversary_date")
	private Date aniversaryDate;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "academic_career_id", insertable = true, updatable = true)
	private AcademicCareer academicCareer;

	public String getAcademicSession() {
		return academicSession;
	}

	public void setAcademicSession(String academicSession) {
		this.academicSession = academicSession;
	}

	public String getPrimaryAcaedemicProgram() {
		return primaryAcaedemicProgram;
	}

	public void setPrimaryAcaedemicProgram(String primaryAcaedemicProgram) {
		this.primaryAcaedemicProgram = primaryAcaedemicProgram;
	}

	public String getAttendence_status() {
		return attendence_status;
	}

	public void setAttendence_status(String attendence_status) {
		this.attendence_status = attendence_status;
	}

	public String getFormOfStudy() {
		return formOfStudy;
	}

	public void setFormOfStudy(String formOfStudy) {
		this.formOfStudy = formOfStudy;
	}

	public String getWithdrawCode() {
		return withdrawCode;
	}

	public void setWithdrawCode(String withdrawCode) {
		this.withdrawCode = withdrawCode;
	}

	public String getWithdrawReason() {
		return withdrawReason;
	}

	public void setWithdrawReason(String withdrawReason) {
		this.withdrawReason = withdrawReason;
	}

	public Date getWithdrawDate() {
		return withdrawDate;
	}

	public void setWithdrawDate(Date withdrawDate) {
		this.withdrawDate = withdrawDate;
	}

	public String getAcademicLevel() {
		return academicLevel;
	}

	public void setAcademicLevel(String academicLevel) {
		this.academicLevel = academicLevel;
	}

	public Date getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public int getTermUnitsTaken() {
		return termUnitsTaken;
	}

	public void setTermUnitsTaken(int termUnitsTaken) {
		this.termUnitsTaken = termUnitsTaken;
	}

	public int getTermUnitAcheived() {
		return termUnitAcheived;
	}

	public void setTermUnitAcheived(int termUnitAcheived) {
		this.termUnitAcheived = termUnitAcheived;
	}

	public float getTermGPA() {
		return termGPA;
	}

	public void setTermGPA(float termGPA) {
		this.termGPA = termGPA;
	}

	public float getOverallGPA() {
		return overallGPA;
	}

	public void setOverallGPA(float overallGPA) {
		this.overallGPA = overallGPA;
	}

	public int getTransferCreditUnit() {
		return transferCreditUnit;
	}

	public void setTransferCreditUnit(int transferCreditUnit) {
		this.transferCreditUnit = transferCreditUnit;
	}

	public int getYearOfProgram() {
		return yearOfProgram;
	}

	public void setYearOfProgram(int yearOfProgram) {
		this.yearOfProgram = yearOfProgram;
	}

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public Date getAniversaryDate() {
		return aniversaryDate;
	}

	public void setAniversaryDate(Date aniversaryDate) {
		this.aniversaryDate = aniversaryDate;
	}

	public AcademicCareer getAcademicCareer() {
		return academicCareer;
	}

	public void setAcademicCareer(AcademicCareer academicCareer) {
		this.academicCareer = academicCareer;
	}

}
