/**
 * 
 */
package com.iit.univdhaka.iis.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iit.univdhaka.iis.domain.StudentDetails;

/**
 * @author Bazlur Rahman Rokon
 * 
 */
@Controller
@RequestMapping("/student/*")
public class StudentDetailsController {
	@RequestMapping(value = "create", method = RequestMethod.GET)
	public void create(ModelMap model) {
		StudentDetails student = new StudentDetails();
		model.put("student", student);
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public void create(ModelMap model, HttpServletRequest request) {
		StudentDetails student = new StudentDetails();
		model.put("student", student);
	}
}
