package com.project.service;

import java.util.List;

import com.project.model.DocumentsVO;



public interface DocumentsService {

	public void insert(DocumentsVO documentsVO);
	public List search();
	public void delete(DocumentsVO documentsVO);
	public List edit(DocumentsVO documentsVO);
}
