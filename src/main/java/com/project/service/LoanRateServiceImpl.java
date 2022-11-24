package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.LoanRateDAO;
import com.project.model.LoanRateVO;


@Service
@Transactional
public class LoanRateServiceImpl implements LoanRateService{

	@Autowired
	private LoanRateDAO loanRateDAO;

	public void insert(LoanRateVO loanRateVO) 
	{
		this.loanRateDAO.insert(loanRateVO);
	}

	public List search() 
	{
		return this.loanRateDAO.search();
	}

	public void delete(LoanRateVO loanRateVO) 
	{
		this.loanRateDAO.delete(loanRateVO);
	}

	public void deleteAll(LoanRateVO loanRateVO) 
	{
		this.loanRateDAO.deleteAll(loanRateVO);
	}

	public List edit(LoanRateVO loanRateVO) 
	{
		return this.loanRateDAO.edit(loanRateVO);
	}
}
