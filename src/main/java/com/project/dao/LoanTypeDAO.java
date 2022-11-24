package com.project.dao;

import java.util.List;

import com.project.model.LoanTypeVO;



public interface LoanTypeDAO {

	public void insert(LoanTypeVO loanTypeVO);
	public List search();
	public void delete(LoanTypeVO loanTypeVO);
	public List edit(LoanTypeVO loanTypeVO);
}
