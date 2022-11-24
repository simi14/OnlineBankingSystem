package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.AccountDocumentDAO;
import com.project.model.AccountDocumentVO;

@Service
@Transactional
public class AccountDocumentServiceImpl implements AccountDocumentService{

	@Autowired
	private AccountDocumentDAO accountDocumentDAO;

	public void insert(AccountDocumentVO accountDocumentVO) {	
		this.accountDocumentDAO.insert(accountDocumentVO);
	}
	
	public List search() {
		return this.accountDocumentDAO.search();

	}
	public void delete(AccountDocumentVO accountDocumentVO) {
		this.accountDocumentDAO.delete(accountDocumentVO);
	}
	
	public List edit(AccountDocumentVO accountDocumentVO) {
		return this.accountDocumentDAO.edit(accountDocumentVO);

	}
}
