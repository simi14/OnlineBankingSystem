package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.AccountDAO;
import com.project.model.AccountVO;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDAO accountDAO;

	public void insert(AccountVO accountVO) {	
		this.accountDAO.insert(accountVO);
	}
	
	public List search() {
		return this.accountDAO.search();

	}
	public void delete(AccountVO accountVO) {
		this.accountDAO.delete(accountVO);
	}
	
	public List edit(AccountVO accountVO) {
		return this.accountDAO.edit(accountVO);

	}
}
