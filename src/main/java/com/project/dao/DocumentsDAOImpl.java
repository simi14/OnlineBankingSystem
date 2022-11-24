package com.project.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.DocumentsVO;

@Repository
public class DocumentsDAOImpl implements DocumentsDAO{

	
	@Autowired
	SessionFactory sessionFactory;

	public void insert(DocumentsVO documentsVO)
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(documentsVO);
	}
	
	public List search() {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from DocumentsVO where document_status=true");

		List ls = q.list();

		return ls;
	}
	
	public void delete(DocumentsVO documentsVO) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("update DocumentsVO set document_status=false where document_id=" + documentsVO.getDocument_id());
		q.executeUpdate();
	}
	
	public List edit(DocumentsVO documentsVO) {
		Session session = sessionFactory.openSession();

		Query q = session.createQuery("from DocumentsVO where document_id=" + documentsVO.getDocument_id());

		List ls = q.list();

		return ls;
	}
}
