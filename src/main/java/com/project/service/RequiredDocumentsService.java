package com.project.service;

import java.util.List;

import com.project.model.RequiredDocumentsVO;

public interface RequiredDocumentsService {

	public void insert(RequiredDocumentsVO requiredDocumentsVO);
	public List search();
	public void delete(RequiredDocumentsVO requiredDocumentsVO);
	public List edit(RequiredDocumentsVO requiredDocumentsVO);

}
