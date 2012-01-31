package com.rokonoid.apps.user.web;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rokonoid.apps.user.domain.LoginCommand;
import com.rokonoid.apps.user.service.UserService;

@Controller
@RequestMapping("/login/*")
public class LoginController {

	private static final Logger log = LoggerFactory
			.getLogger(LoginController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void showLoginForm(LoginCommand loginCommand) {
		log.debug("entered login form");
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String proccessLogin(LoginCommand command, BindingResult result,
			HttpSession session) {
		log.debug("entered processFormSubmission, userName={}, password={}",
				command.getUserName(), command.getPassword());

		if (command.getUserName() == null || "".equals(command.getUserName())) {
			result.rejectValue("userName", "required", "please enter user name");
		}
		if (command.getPassword() == null || "".equals(command.getPassword())) {
			result.rejectValue("password", "required", "please enter password");
		}
		if (result.hasErrors()) {
			return "login/login";
		}

		if (!userService.checkUserLogin(command.getUserName(),
				command.getPassword())) {
			result.addError(new ObjectError("wrong_username_password",
					"incorrect username/password, please try again with valid username/password"));
			return "login/login";
		}

		session.setAttribute("USER", command);

		return "home/index";
	}

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public void logout(HttpSession session, HttpServletResponse response)
			throws IOException {
		session.invalidate();
		response.sendRedirect("login");
	}

}
