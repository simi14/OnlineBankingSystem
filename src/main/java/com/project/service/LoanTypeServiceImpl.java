package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.LoanTypeDAO;
import com.project.model.LoanTypeVO;


@Service
@Transactional
public class LoanTypeServiceImpl implements LoanTypeService{

	@Autowired
	private LoanTypeDAO loanTypeDAO;

	public void insert(LoanTypeVO loanTypeVO) {	
		this.loanTypeDAO.insert(loanTypeVO);
	}
	
	public List search() {
		return this.loanTypeDAO.search();

	}
	public void delete(LoanTypeVO loanTypeVO) {
		this.loanTypeDAO.delete(loanTypeVO);
	}
	
	public List edit(LoanTypeVO loanTypeVO) {
		return this.loanTypeDAO.edit(loanTypeVO);

	}
}
