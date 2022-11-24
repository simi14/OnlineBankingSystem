package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.LoanDocumentVO;

@Repository
public class LoanDocumentDAOImpl implements LoanDocumentDAO{

	@Autowired
	SessionFactory sessionFactory;

	public void insert(LoanDocumentVO loanDocumentVO)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(loanDocumentVO);
	}
	
	public List search() {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from LoanDocumentVO where loanDocument_status=true");

		List ls = q.list();

		return ls;
	}
	
	public void delete(LoanDocumentVO loanDocumentVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("update LoanDocumentVO set loanDocument_status=false where loanDocument_id=" + loanDocumentVO.getLoanDocument_id());
		q.executeUpdate();
	}
	
	public List edit(LoanDocumentVO loanDocumentVO) {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from LoanDocumentVO where loanDocument_id=" + loanDocumentVO.getLoanDocument_id());

		List ls = q.list();

		return ls;
	}
}
