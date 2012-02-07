package com.iit.univdhaka.iis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Bazlur Rahman Rokon
 * 
 */
@Entity
@Table(name = "StudentA_dvisor")
public class StudentAdvisor extends DomainObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8264909377167456535L;
	@Column(name = "advisor_name")
	private String advisorName;
	@Column(name = "advisor_role")
	private String advisorRole;
	@Column(name = "academic_program")
	private String academicProgram;
	@Column(name = "academic_plan")
	private String academicPlan;

	public String getAdvisorName() {
		return advisorName;
	}

	public void setAdvisorName(String advisorName) {
		this.advisorName = advisorName;
	}

	public String getAdvisorRole() {
		return advisorRole;
	}

	public void setAdvisorRole(String advisorRole) {
		this.advisorRole = advisorRole;
	}

	public String getAcademicProgram() {
		return academicProgram;
	}

	public void setAcademicProgram(String academicProgram) {
		this.academicProgram = academicProgram;
	}

	public String getAcademicPlan() {
		return academicPlan;
	}

	public void setAcademicPlan(String academicPlan) {
		this.academicPlan = academicPlan;
	}

}
