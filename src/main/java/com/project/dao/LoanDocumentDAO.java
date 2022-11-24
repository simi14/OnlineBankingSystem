package com.project.dao;

import java.util.List;

import com.project.model.LoanDocumentVO;

public interface LoanDocumentDAO {
	public void insert(LoanDocumentVO loanDocumentVO);
	public List search();
	public void delete(LoanDocumentVO loanDocumentVO);
	public List edit(LoanDocumentVO loanDocumentVO);
}
