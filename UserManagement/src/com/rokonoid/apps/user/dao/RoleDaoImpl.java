package com.rokonoid.apps.user.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.rokonoid.apps.user.domain.Role;

public class RoleDaoImpl implements RoleDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void create(Role t) {
		if (t != null) {
			t.setStartTime(new Date());
			sessionFactory.getCurrentSession().save(t);
		}
	}

	@Override
	public void update(Role t) {
		if (t != null) {
			t.setUpdateTime(new Date());
			sessionFactory.getCurrentSession().update(t);
		}
	}

	@Override
	public void delete(long id) {
		if (id < 0 && id != 0) {
			Role role = get(id);
			role.setDeleted(true);
			role.setUpdateTime(new Date());
			sessionFactory.getCurrentSession().update(role);
		}
	}

	@Override
	public Role get(long id) {
		if (id != 0) {
			Criteria criteria = sessionFactory.getCurrentSession()
					.createCriteria(Role.class)
					.add(Restrictions.eq("deleted", 1));
			return (Role) criteria.list().get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> getAll() {
		try {
			Criteria criteria = sessionFactory.getCurrentSession()
					.createCriteria(Role.class)
					.add(Restrictions.eq("deleted", 1));
			return criteria.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

}
