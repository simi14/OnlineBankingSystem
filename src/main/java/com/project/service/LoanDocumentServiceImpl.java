package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.LoanDocumentDAO;
import com.project.model.LoanDocumentVO;

@Service
@Transactional
public class LoanDocumentServiceImpl implements LoanDocumentService{

	@Autowired
	private LoanDocumentDAO loanDocumentDAO;

	public void insert(LoanDocumentVO loanDocumentVO) {	
		this.loanDocumentDAO.insert(loanDocumentVO);
	}
	
	public List search() {
		return this.loanDocumentDAO.search();

	}
	public void delete(LoanDocumentVO loanDocumentVO) {
		this.loanDocumentDAO.delete(loanDocumentVO);
	}
	
	public List edit(LoanDocumentVO loanDocumentVO) {
		return this.loanDocumentDAO.edit(loanDocumentVO);

	}
}
