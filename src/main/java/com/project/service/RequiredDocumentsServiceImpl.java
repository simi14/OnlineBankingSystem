package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.RequiredDocumentsDAO;
import com.project.model.RequiredDocumentsVO;

@Service
@Transactional
public class RequiredDocumentsServiceImpl implements RequiredDocumentsService{


	@Autowired
	private RequiredDocumentsDAO requiredDocumentsDAO;

	public void insert(RequiredDocumentsVO requiredDocumentsVO) {	
		this.requiredDocumentsDAO.insert(requiredDocumentsVO);
	}
	
	public List search() {
		return this.requiredDocumentsDAO.search();

	}
	public void delete(RequiredDocumentsVO requiredDocumentsVO) {
		this.requiredDocumentsDAO.delete(requiredDocumentsVO);
	}
	
	public List edit(RequiredDocumentsVO requiredDocumentsVO) {
		return this.requiredDocumentsDAO.edit(requiredDocumentsVO);

	}
}
