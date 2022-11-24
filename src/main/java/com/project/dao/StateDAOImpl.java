package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.StateVO;

@Repository
public class StateDAOImpl implements StateDAO{


	@Autowired
	SessionFactory sessionFactory;

	public void insert(StateVO stateVO)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(stateVO);
	}
	
	public List search() {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from StateVO where state_status=true");

		List ls = q.list();

		return ls;
	}
	
	public void delete(StateVO stateVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("update StateVO set state_status=false where state_id=" + stateVO.getState_id());
		q.executeUpdate();
	}
	
	public List edit(StateVO stateVO) {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from StateVO where state_id=" + stateVO.getState_id());

		List ls = q.list();

		return ls;
	}
}
