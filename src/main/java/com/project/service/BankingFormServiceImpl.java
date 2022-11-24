package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.BankingFormDAO;
import com.project.model.BankingFormVO;

@Service
@Transactional
public class BankingFormServiceImpl implements BankingFormService{


	@Autowired
	private BankingFormDAO bankingFormDAO;

	public void insert(BankingFormVO bankingFormVO) {	
		this.bankingFormDAO.insert(bankingFormVO);
	}
	
	public List search() {
		return this.bankingFormDAO.search();

	}
	public void delete(BankingFormVO bankingFormVO) {
		this.bankingFormDAO.delete(bankingFormVO);
	}
	
	public List edit(BankingFormVO bankingFormVO) {
		return this.bankingFormDAO.edit(bankingFormVO);

	}

}
