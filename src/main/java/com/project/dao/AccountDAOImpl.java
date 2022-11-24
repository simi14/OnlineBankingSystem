package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.AccountVO;


@Repository
public class AccountDAOImpl implements AccountDAO{

	
	@Autowired
	SessionFactory sessionFactory;

	public void insert(AccountVO accountVO)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(accountVO);
	}
	
	public List search() {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from AccountVO where account_status=true");

		List ls = q.list();

		return ls;
	}
	
	public void delete(AccountVO accountVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("update AccountVO set account_status=false where account_id=" + accountVO.getAccount_id());
		q.executeUpdate();
	}
	
	public List edit(AccountVO accountVO) {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from AccountVO where account_id=" + accountVO.getAccount_id());

		List ls = q.list();

		return ls;
	}
}
