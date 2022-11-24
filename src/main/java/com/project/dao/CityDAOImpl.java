package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.CityVO;

@Repository
public class CityDAOImpl implements CityDAO{

	@Autowired
	SessionFactory sessionFactory;

	public void insert(CityVO cityVO)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(cityVO);
	}
	
	public List search() {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from CityVO where city_status=true");

		List ls = q.list();

		return ls;
	}
	
	public List searchByState(CityVO cityVO) {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from CityVO where stateVO.state_status=true and stateVO.state_id="+cityVO.getStateVO().getState_id());

		List ls = q.list();

		return ls;
	}
	
	public void delete(CityVO cityVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("update CityVO set city_status=false where city_id=" + cityVO.getCity_id());
		q.executeUpdate();
	}
	
	public void deleteAll(CityVO cityVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("update CityVO set city_status=false where stateVO.state_id=" + cityVO.getStateVO().getState_id());
		q.executeUpdate();
	}
	
	public List edit(CityVO cityVO) {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from CityVO where city_id=" + cityVO.getCity_id());

		List ls = q.list();

		return ls;
	}
}
