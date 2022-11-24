package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.DocumentsDAO;
import com.project.model.DocumentsVO;

@Service
@Transactional
public class DocumentsServiceImpl implements DocumentsService{

	@Autowired
	private DocumentsDAO documentsDAO;

	public void insert(DocumentsVO documentsVO) {	
		this.documentsDAO.insert(documentsVO);
	}
	
	public List search() {
		return this.documentsDAO.search();

	}
	public void delete(DocumentsVO documentsVO) {
		this.documentsDAO.delete(documentsVO);
	}
	
	public List edit(DocumentsVO documentsVO) {
		return this.documentsDAO.edit(documentsVO);

	}

}
