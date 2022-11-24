package com.project.service;

import java.util.List;

import com.project.model.AccountDocumentVO;

public interface AccountDocumentService {

	public void insert(AccountDocumentVO accountDocumentVO);
	public List search();
	public void delete(AccountDocumentVO accountDocumentVO);
	public List edit(AccountDocumentVO accountDocumentVO);
}
