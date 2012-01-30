package com.rokonoid.apps.user.dao;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rokonoid.apps.user.domain.Addresses;
import com.rokonoid.apps.user.domain.User;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User getUser(Long userId) {
		if (userId != null && userId > 0) {
			return (User) sessionFactory.getCurrentSession().get(User.class,
					userId);
		}
		return null;
	}

	@Override
	public void updateUser(User user) {
		if (user != null) {
			sessionFactory.getCurrentSession().update(user);
		}
	}

	@Override
	public Long deleteUserID(long USER_ID) {
		if (USER_ID != 0) {
			User user = getUser(USER_ID);
			user.setDeleted(true);
			user.setUpdateTime(new Date());

			Addresses add = user.getAddresses();

			if (add != null) {
				add.setDeleted(true);
				add.setUpdateTime(new Date());
			}
			sessionFactory.getCurrentSession().update(user);

			User userAfterUpdate = (User) (sessionFactory.getCurrentSession()
					.get(User.class, USER_ID));
			return userAfterUpdate.getUserId();
		}

		return null;
	}

	@Override
	public Long selectMaxFromUsers() {
		try {
			Criteria criteria = sessionFactory.getCurrentSession()
					.createCriteria(User.class)
					.setProjection(Projections.rowCount())
					.add(Restrictions.eq("deleted", 1));
			List<Long> ll = criteria.list();
			return ll.get(0);

		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		try {
			Criteria criteria = sessionFactory.getCurrentSession()
					.createCriteria(User.class)
					.add(Restrictions.eq("deleted", 1));
			return criteria.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> getAllUsersDeleted() {
		try {
			Criteria criteria = sessionFactory.getCurrentSession()
					.createCriteria(User.class)
					.add(Restrictions.eq("deleted", 0));
			return criteria.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User getAllUser(String search) {
		String[] searchItems = search.split(" ");
		try {
			String sqlQuery = "select * from  User u " + "WHERE u.deleted = 1";
			for (int i = 0; i < searchItems.length; i++) {
				sqlQuery += "( " + "lower(u.lastName) LIKE '"
						+ StringUtils.lowerCase("%" + searchItems[i] + "%")
						+ "' " + "OR lower(u.firstName) LIKE '"
						+ StringUtils.lowerCase("%" + searchItems[i] + "%")
						+ "' " + "OR lower(u.username) LIKE '"
						+ StringUtils.lowerCase("%" + searchItems[i] + "%")
						+ "' " + "OR lower(u.addresses.email) LIKE '"
						+ StringUtils.lowerCase("%" + searchItems[i] + "%")
						+ "' " + ") ";
				sqlQuery += " )";
			}
			Query query = sessionFactory.getCurrentSession().createQuery(
					sqlQuery);
			return (User) query.list().get(0);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean checkUserLogin(String DataValue) {

		return false;
	}

	@Override
	public User getUserByName(String login) {
		return (User) sessionFactory.getCurrentSession()
				.createCriteria(User.class)
				.add(Restrictions.eq("username", login))
				.add(Restrictions.eq("deleted", 1)).list().get(0);

	}

	@Override
	public User getUserByEmail(String email) {
		return (User) sessionFactory.getCurrentSession()
				.createCriteria(User.class).add(Restrictions.eq("deleted", 1))
				.add(Restrictions.eq("email", email)).list().get(0);

	}

	@Override
	public Object getUserByHash(String hash) {
		return (User) sessionFactory.getCurrentSession()
				.createCriteria(User.class).add(Restrictions.eq("deleted", 1))
				.add(Restrictions.eq("resetHash", hash)).list().get(0);

	}

	@Override
	public Object resetPassByHash(String hash, String pass) {
		Object u = this.getUserByHash(hash);
		if (u instanceof User) {
			User us = (User) u;
			us.setPassword(pass);
			us.setResetHash("");
			updateUser(us);
			return new Long(-8);
		} else {
			return u;
		}
	}

	@Override
	public void saveUser(User user) {
		if (user != null) {
			sessionFactory.getCurrentSession().save(user);
		}
	}
}
