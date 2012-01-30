package com.rokonoid.apps.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.rokonoid.apps.user.dao.UserDao;
import com.rokonoid.apps.user.domain.User;

public class UserDaoTest extends AbstractTest {

	@Autowired
	private UserDao userDao;

	@Test
	public void setUserTest() {
		User user = new User();
		user.setUserId(new Long(1));
		user.setUsername("rokon");
		user.setPassword("rokon12");
		user.setStartTime(new Date());

		userDao.saveUser(user);

		User user1 = userDao.getUser(new Long(1));

		assertNotNull(user1);
	}
}
