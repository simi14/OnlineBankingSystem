package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.LoanTypeVO;

@Repository
public class LoanTypeDAOImpl implements LoanTypeDAO{

	@Autowired
	SessionFactory sessionFactory;

	public void insert(LoanTypeVO loanTypeVO)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(loanTypeVO);
	}
	
	public List search() {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from LoanTypeVO where loantype_status=true");

		List ls = q.list();

		return ls;
	}
	
	public void delete(LoanTypeVO loanTypeVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("update LoanTypeVO set loantype_status=false where loantype_id=" + loanTypeVO.getLoantype_id());
		q.executeUpdate();
	}
	
	public List edit(LoanTypeVO loanTypeVO) {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from LoanTypeVO where loantype_id=" + loanTypeVO.getLoantype_id());

		List ls = q.list();

		return ls;
	}
}
