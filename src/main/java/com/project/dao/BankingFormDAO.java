package com.project.dao;

import java.util.List;

import com.project.model.BankingFormVO;

public interface BankingFormDAO {

	public void insert(BankingFormVO bankingFormVO);
	public List search();
	public void delete(BankingFormVO bankingFormVO);
	public List edit(BankingFormVO bankingFormVO);
}
