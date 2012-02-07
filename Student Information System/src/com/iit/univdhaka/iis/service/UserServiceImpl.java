package com.iit.univdhaka.iis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iit.univdhaka.iis.crypt.MD5Implementation;
import com.iit.univdhaka.iis.dao.UserDao;
import com.iit.univdhaka.iis.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	// private MD5CryptImplementation crypt = new MD5CryptImplementation();
	private MD5Implementation md5 = new MD5Implementation();

	@Override
	public User getUser(Long userId) {
		return userDao.getUser(userId);
	}

	@Override
	public void saveUser(User user) {
		user.setPassword(md5.createPassPhrase(user.getPassword()));
		userDao.saveUser(user);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public Long deleteUserID(long USER_ID) {

		return userDao.deleteUserID(USER_ID);
	}

	@Override
	public Long selectMaxFromUsers() {

		return userDao.selectMaxFromUsers();
	}

	@Override
	public List<User> getAllUsers() {

		return userDao.getAllUsers();
	}

	@Override
	public List<User> getAllUsersDeleted() {

		return userDao.getAllUsersDeleted();
	}

	@Override
	public User getUserBySearchString(String search) {

		return userDao.getUserBySerachString(search);
	}

	@Override
	public boolean checkUserLogin(String DataValue) {

		return userDao.checkUserLogin(DataValue);
	}

	@Override
	public User getUserByName(String login) {

		return userDao.getUserByName(login);
	}

	@Override
	public User getUserByEmail(String email) {

		return userDao.getUserByEmail(email);
	}

	@Override
	public Object getUserByHash(String hash) {

		return userDao.getUserByHash(hash);
	}

	@Override
	public Object resetPassByHash(String hash, String pass) {

		return userDao.resetPassByHash(hash, pass);
	}

	@Override
	public boolean checkUserLogin(String username, String password) {
		return userDao.checkUserLogin(username, md5.createPassPhrase(password));
	}
}
