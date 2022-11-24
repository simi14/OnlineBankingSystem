package com.project.service;

import java.util.List;

import com.project.model.LoanRateVO;

public interface LoanRateService {

	public void insert(LoanRateVO loanRateVO);

	public List search();

	public void delete(LoanRateVO loanRateVO);

	public List edit(LoanRateVO loanRateVO);

	public void deleteAll(LoanRateVO loanRateVO);

}
