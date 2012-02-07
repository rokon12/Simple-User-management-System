package com.iit.univdhaka.iis.domain.test;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iit.univdhaka.iis.domain.User;
import com.iit.univdhaka.iis.service.UserService;

public class UserServieTest extends AbstractTest {
	@Autowired
	private UserService userService;

	@Test
	public void setUserTest() {
		User user = new User();

		user.setUsername("rokon");
		user.setPassword(("rokon12"));
		user.setDeleted(true);
		user.setStartTime(new Date());

		userService.saveUser(user);

		User user1 = userService.getUser(new Long(1));

		assertNotNull(user1);
	}
}
