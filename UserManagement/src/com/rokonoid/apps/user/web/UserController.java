package com.rokonoid.apps.user.web;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	public String create(@ModelAttribute("user") User user,
			BindingResult result, HttpSession session) {
		validate(user, result);

		if (result.hasErrors()) {
			return "user/create";
		}

		userService.saveUser(user);
		return "login/login";
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
			result.rejectValue("lastName", "required", "Last Name is required");
		}

		if (user.getEmail() == null || "".equals(user.getEmail())) {
			result.rejectValue("email", "required", "email is required");
		} else if (!validateEmail(user.getEmail())) {
			result.rejectValue("email", "required", "not a valid email address");
		} else {
			// User u1 = userService.getUserByName(user.getUsername());
			// if (u1 != null && u1.getUsername().equals(user.getUsername())) {
			// result.rejectValue("username", "required",
			// "username already in use, try another");
			// }
			// u1 = userService.getUserByEmail(user.getEmail());
			//
			// if (u1 != null && u1.getEmail().equals(user.getEmail())) {
			// result.rejectValue("username", "required",
			// "email address already in use, try another");
			// }
		}

		if (!user.getPassword().equals(user.getPasswordConfirmed())) {
			result.addError(new ObjectError("password mismatch",
					"password mismatch"));
		}
	}

	private boolean validateEmail(String email) {
		Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
		// Match the given string with the pattern
		Matcher m = p.matcher(email);
		// check whether match is found
		boolean matchFound = m.matches();
		if (matchFound)
			return true;
		return false;
	}
}
