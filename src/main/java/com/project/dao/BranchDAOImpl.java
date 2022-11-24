package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.BranchVO;

@Repository
public class BranchDAOImpl implements BranchDAO{

	@Autowired
	SessionFactory sessionFactory;

	public void insert(BranchVO branchVO)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(branchVO);
	}
	
	public List search() {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from BranchVO where branch_status=true");

		List ls = q.list();

		return ls;
	}
	
	public void delete(BranchVO branchVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("update BranchVO set branch_status=false where branch_id=" + branchVO.getBranchId());
		q.executeUpdate();
	}
	
	public void deleteAllByState(BranchVO branchVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("update BranchVO set branch_status=false where stateVO.state_id=" + branchVO.getStateVO().getState_id());
		q.executeUpdate();
	}
	public void deleteAllByCity(BranchVO branchVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("update BranchVO set branch_status=false where cityVO.city_id=" + branchVO.getCityVO().getCity_id());
		q.executeUpdate();
	}
	
	public List edit(BranchVO branchVO) {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from BranchVO where branch_id=" + branchVO.getBranchId());

		List ls = q.list();

		return ls;
	}
}
