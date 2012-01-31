package com.rokonoid.apps.user.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rokonoid.apps.user.domain.User;
import com.rokonoid.apps.user.service.UserService;

@Controller
@RequestMapping("/user/*")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public void create(ModelMap model) {
		User user = new User();
		model.put("user", user);
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String create(@ModelAttribute("document") User user,
			BindingResult result, HttpSession session) {
		validate(user, result);

		if (result.hasErrors()) {
			return "user/create";
		}

		userService.saveUser(user);
		return "home/index";
	}

	private void validate(User user, BindingResult result) {
		if (user.getUsername() == null || "".equals(user.getUsername())) {
			result.rejectValue("username", "required", "username is required");
		}
		if (user.getPassword() == null || "".equals(user.getPassword())) {
			result.rejectValue("password", "required", "password is required");
		}

		if (user.getPasswordConfirmed() == null
				|| "".equals(user.getPasswordConfirmed())) {
			result.rejectValue("passwordConfirmed", "required",
					"confirm password is required");
		}
		if (user.getFirstName() == null || "".equals(user.getFirstName())) {
			result.rejectValue("firstName", "required",
					"First Name is required");
		}
		if (user.getLastName() == null || "".equals(user.getLastName())) {
			result.rejectValue("phoneNumber", "required",
					"phone number is required");
		}

		if (!user.getPassword().equals(user.getPasswordConfirmed())) {
			result.addError(new ObjectError("password mismatch",
					"password mismatch"));
		}
	}
}
