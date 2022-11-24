package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.ServicesVO;

@Repository
public class ServicesDAOImpl implements ServicesDAO {

	
	@Autowired
	SessionFactory sessionFactory;

	public void insert(ServicesVO servicesVO)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(servicesVO);
	}
	
	public List search() {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from ServicesVO where service_status=true");

		List ls = q.list();

		return ls;
	}
	
	public void delete(ServicesVO servicesVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("update ServicesVO set service_status=false where service_id=" + servicesVO.getService_id());
		q.executeUpdate();
	}
	
	public List edit(ServicesVO servicesVO) {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from ServicesVO where service_id=" + servicesVO.getService_id());

		List ls = q.list();

		return ls;
	}

}
