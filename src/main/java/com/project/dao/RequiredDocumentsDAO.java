package com.project.dao;

import java.util.List;

import com.project.model.RequiredDocumentsVO;

public interface RequiredDocumentsDAO {

	public void insert(RequiredDocumentsVO requiredDocumentsVO);
	public List search();
	public void delete(RequiredDocumentsVO requiredDocumentsVO);
	public List edit(RequiredDocumentsVO requiredDocumentsVO);
	
}
