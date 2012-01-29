package com.rokonoid.apps.user.dao;

import java.util.List;

import com.rokonoid.apps.user.domain.User;

public interface UserDao {
	public User getUser(Long userId);

	public void updateUser(User user);

	public Long deleteUserID(long USER_ID);

	public Long selectMaxFromUsers();

	public List<User> getAllUsers();

	public List<User> getAllUsersDeleted();

	public User getAllUser(String search);

	public boolean checkUserLogin(String DataValue);

	public User getUserByName(String login);

	public User getUserByEmail(String email);

	public Object getUserByHash(String hash);

	public Object resetPassByHash(String hash, String pass);

	public Long selectMaxFromUsersWithSearch(String search);
}
