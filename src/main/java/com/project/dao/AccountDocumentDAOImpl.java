package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.AccountDocumentVO;

@Repository
public class AccountDocumentDAOImpl implements AccountDocumentDAO{

	@Autowired
	SessionFactory sessionFactory;

	public void insert(AccountDocumentVO accountDocumentVO)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(accountDocumentVO);
	}
	
	public List search() {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from AccountDocumentVO where accountDocument_status=true");

		List ls = q.list();

		return ls;
	}
	
	public void delete(AccountDocumentVO accountDocumentVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("update AccountDocumentVO set accountDocument_status=false where accountDocument_id=" + accountDocumentVO.getAccountDocument_id());
		q.executeUpdate();
	}
	
	public List edit(AccountDocumentVO accountDocumentVO) {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from AccountDocumentVO where accountDocument_id=" + accountDocumentVO.getAccountDocument_id());

		List ls = q.list();

		return ls;
	}
}
