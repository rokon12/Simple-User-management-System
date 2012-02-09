/**
 * 
 */
package com.iit.univdhaka.iis.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iit.univdhaka.iis.domain.Student;
import com.iit.univdhaka.iis.domain.StudentDetails;

/**
 * @author Bazlur Rahman Rokon
 * 
 */
@Transactional
@Repository
public class StudentDetailsDaoImp implements StudentDetailsDao {

	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.iit.univdhaka.iis.dao.CommonDao#create(java.lang.Object)
	 */
	@Override
	public void create(StudentDetails t) {
		if (t != null) {
			sessionFactory.getCurrentSession().save(t);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.iit.univdhaka.iis.dao.CommonDao#update(java.lang.Object)
	 */
	@Override
	public void update(StudentDetails t) {
		if (t != null) {
			sessionFactory.getCurrentSession().update(t);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.iit.univdhaka.iis.dao.CommonDao#delete(long)
	 */
	@Override
	public void delete(long id) {
		if (id > 0) {
			StudentDetails student = get(id);
			student.setDeleted(true);
			student.setDateLastUpdated(new Date());
			update(student);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.iit.univdhaka.iis.dao.CommonDao#get(long)
	 */
	@Override
	public StudentDetails get(long id) {
		if (id > 0) {
			return (StudentDetails) sessionFactory.getCurrentSession().get(
					StudentDetails.class, id);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.iit.univdhaka.iis.dao.CommonDao#getAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<StudentDetails> getAll() {
		try {
			Criteria criteria = sessionFactory.getCurrentSession()
					.createCriteria(Student.class)
					.add(Restrictions.eq("deleted", false));
			return criteria.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

}
