package com.project.dao;

import java.util.List;

import com.project.model.DocumentsVO;

public interface DocumentsDAO {

	public void insert(DocumentsVO documentsVO);
	public List search();
	public void delete(DocumentsVO documentsVO);
	public List edit(DocumentsVO documentsVO);
}
