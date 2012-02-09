/**
 * 
 */
package com.iit.univdhaka.iis.domain.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iit.univdhaka.iis.dao.StudentDetailsDao;
import com.iit.univdhaka.iis.domain.StudentDetails;

/**
 * @author Bazlur Rahman Rokon
 * 
 */
public class StudentDetailDaoTest extends AbstractTest {
	@Autowired
	private StudentDetailsDao dao;

	@Test
	public void createStudent() {
		StudentDetails studentDetails = new StudentDetails();
		
		studentDetails.setDateCreated(new Date());
		studentDetails.setFirstName("Bazlur");
		studentDetails.setLastName("Rahman");

		dao.create(studentDetails);

		StudentDetails st = dao.get(1);
		assertNotNull(st);
	}
}
