package com.rokonoid.apps.user.service;

import java.util.List;

import com.rokonoid.apps.user.domain.User;

public interface UserService {
	public User getUser(Long userId);

	public void saveUser(User user);

	public void updateUser(User user);

	public Long deleteUserID(long USER_ID);

	public Long selectMaxFromUsers();

	public List<User> getAllUsers();

	public List<User> getAllUsersDeleted();

	public User getUserBySearchString(String search);

	public boolean checkUserLogin(String DataValue);

	public boolean checkUserLogin(String username, String password);

	public User getUserByName(String login);

	public User getUserByEmail(String email);

	public Object getUserByHash(String hash);

	public Object resetPassByHash(String hash, String pass);

}
