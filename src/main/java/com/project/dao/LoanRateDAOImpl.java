package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.LoanRateVO;

@Repository
public class LoanRateDAOImpl implements LoanRateDAO{

	@Autowired
	SessionFactory sessionFactory;

	public void insert(LoanRateVO loanRateVO)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(loanRateVO);
	}
	
	public List search() {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from LoanRateVO where loanRate_status=true");

		List ls = q.list();

		return ls;
	}
	
	public void delete(LoanRateVO loanRateVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("update LoanRateVO set loanRate_status=false where loanRate_id=" + loanRateVO.getLoanRate_id());
		q.executeUpdate();
	}
	
	public void deleteAll(LoanRateVO loanRateVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("update LoanRateVO set loanRate_status=false where stateVO.state_id=" + loanRateVO.getLoanTypeVO().getLoantype_id());
		q.executeUpdate();
	}
	
	public List edit(LoanRateVO loanRateVO) {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from LoanRateVO where loanRate_id=" + loanRateVO.getLoanRate_id());

		List ls = q.list();

		return ls;
	}

}
