package com.project.service;

import java.util.List;

import com.project.model.AccountVO;

public interface AccountService {

	public void insert(AccountVO accountVO);
	public List search();
	public void delete(AccountVO accountVO);
	public List edit(AccountVO accountVO);
}
