package com.iit.univdhaka.iis.domain.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iit.univdhaka.iis.crypt.MD5CryptImplementation;
import com.iit.univdhaka.iis.dao.UserDao;
import com.iit.univdhaka.iis.domain.User;

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
