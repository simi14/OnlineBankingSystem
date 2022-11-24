package com.project.service;

import java.util.List;

import com.project.model.LoanDocumentVO;

public interface LoanDocumentService {

	public void insert(LoanDocumentVO loanDocumentVO);
	public List search();
	public void delete(LoanDocumentVO loanDocumentVO);
	public List edit(LoanDocumentVO loanDocumentVO);
}
