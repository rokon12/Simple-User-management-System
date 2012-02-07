package com.iit.univdhaka.iis.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iit.univdhaka.iis.domain.User;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {
	private final Logger log = LoggerFactory.getLogger(UserDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User getUser(Long userId) {
		if (userId != null && userId > 0) {
			log.debug("geUser() id: " + userId);
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

			// //Addresses add = user.getAddresses();
			//
			// if (add != null) {
			// add.setDeleted(true);
			// add.setUpdateTime(new Date());
			// }
			sessionFactory.getCurrentSession().update(user);

			User userAfterUpdate = (User) (sessionFactory.getCurrentSession()
					.get(User.class, USER_ID));
			return userAfterUpdate.getUserId();
		}

		return null;
	}

	@SuppressWarnings("unchecked")
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
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
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

	@SuppressWarnings("unchecked")
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
	public User getUserBySerachString(String search) {
		// String[] searchItems = search.split(" ");
		// try {
		// String sqlQuery = "SELECT * FROM  USER u " + "WHERE u.deleted = 1 ";
		// sqlQuery += "AND ( ";
		// for (int i = 0; i < searchItems.length; i++) {
		// if (i != 0) {
		// sqlQuery += " OR ";
		// }
		// sqlQuery += "( " + "lower(u.last_name) LIKE '"
		// + StringUtils.lowerCase("%" + searchItems[i] + "%")
		// + "' " + "OR lower(u.first_name) LIKE '"
		// + StringUtils.lowerCase("%" + searchItems[i] + "%")
		// + "' " + "OR lower(u.username) LIKE '"
		// + StringUtils.lowerCase("%" + searchItems[i] + "%")
		// + "' " + ") ";
		// }
		// sqlQuery += " )";
		//
		// log.debug("sqlQuery : " + sqlQuery);
		// Query query = sessionFactory.getCurrentSession().createSQLQuery(
		// sqlQuery);
		//
		// if (query.list().size() > 0) {
		// return (User) query.list().get(0);
		// }
		//
		// } catch (HibernateException e) {
		// e.printStackTrace();
		// }
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
				.add(Restrictions.eq("deleted", 0)).list().get(0);

	}

	@Override
	public User getUserByEmail(String email) {
		return (User) sessionFactory.getCurrentSession()
				.createCriteria(User.class).add(Restrictions.eq("deleted", 0))
				.add(Restrictions.eq("email", email)).list().get(0);

	}

	@Override
	public Object getUserByHash(String hash) {
		return (User) sessionFactory.getCurrentSession()
				.createCriteria(User.class).add(Restrictions.eq("deleted", 0))
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
			user.setStartTime(new Date());
			user.setDeleted(false);
			sessionFactory.getCurrentSession().save(user);
		}
	}

	@Override
	public boolean checkUserLogin(String username, String password) {
		if ((username != null && !username.equals(""))
				&& (password != null && !password.equals(""))) {

			Criteria criteria = sessionFactory.getCurrentSession()
					.createCriteria(User.class);
			criteria.add(Restrictions.eq("username", username));
			criteria.add(Restrictions.eq("password", password));

			@SuppressWarnings("rawtypes")
			List list = criteria.list();
			if (list.size() > 0) {
				return true;
			}
		}
		return false;
	}
}
