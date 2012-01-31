package com.rokonoid.apps.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.rokonoid.apps.user.dao.UserDao;
import com.rokonoid.apps.user.domain.User;
import com.rokonoid.apps.util.crypt.MD5CryptImplementation;

public class UserDaoTest extends AbstractTest {

	@Autowired
	private UserDao userDao;
	private MD5CryptImplementation md5 = new MD5CryptImplementation();

	@Test
	public void setUserTest() {
		User user = new User();
		
		user.setUsername("rokon");
		user.setPassword(md5.createPassPhrase("rokon12"));
		user.setDeleted(true);
		user.setStartTime(new Date());

		userDao.saveUser(user);

		User user1 = userDao.getUser(new Long(1));

		assertNotNull(user1);
	}

	
	
}
