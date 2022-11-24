package com.project.service;

import java.util.List;

import com.project.model.BankingFormVO;

public interface BankingFormService {

	public void insert(BankingFormVO bankingFormVO);
	public List search();
	public void delete(BankingFormVO bankingFormVO);
	public List edit(BankingFormVO bankingFormVO);
}
