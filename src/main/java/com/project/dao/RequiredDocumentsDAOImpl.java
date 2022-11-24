package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.RequiredDocumentsVO;

@Repository
public class RequiredDocumentsDAOImpl implements RequiredDocumentsDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void insert(RequiredDocumentsVO requiredDocumentsVO) {
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(requiredDocumentsVO);
	}

	public List search() {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from RequiredDocumentsVO where requiredDocument_status=true");

		List ls = q.list();

		return ls;
	}

	public void delete(RequiredDocumentsVO requiredDocumentsVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session
				.createQuery("update RequiredDocumentsVO set requiredDocument_status=false where requiredDocument_id="
						+ requiredDocumentsVO.getRequiredDocument_id());
		q.executeUpdate();
	}

	public List edit(RequiredDocumentsVO requiredDocumentsVO) {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery(
				"from RequiredDocumentsVO where requiredDocument_id=" + requiredDocumentsVO.getRequiredDocument_id());

		List ls = q.list();

		return ls;
	}
}
