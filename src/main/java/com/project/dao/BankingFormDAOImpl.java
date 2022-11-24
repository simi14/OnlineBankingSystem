package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.BankingFormVO;

@Repository
public class BankingFormDAOImpl implements BankingFormDAO{

	@Autowired
	SessionFactory sessionFactory;

	public void insert(BankingFormVO bankingFormVO)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(bankingFormVO);
	}
	
	public List search() {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from BankingFormVO where bankingForm_status=true");

		List ls = q.list();

		return ls;
	}
	
	public void delete(BankingFormVO bankingFormVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("update BankingFormVO set bankingForm_status=false where bankingForm_id=" + bankingFormVO.getBankingFormId());
		q.executeUpdate();
	}
	
	public List edit(BankingFormVO bankingFormVO) {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from BankingFormVO where bankingForm_id=" + bankingFormVO.getBankingFormId());

		List ls = q.list();

		return ls;
	}
}
