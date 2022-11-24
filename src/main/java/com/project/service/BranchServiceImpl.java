package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.BranchDAO;
import com.project.model.BranchVO;

@Service
@Transactional
public class BranchServiceImpl implements BranchService{

	@Autowired
	private BranchDAO branchDAO;

	public void insert(BranchVO branchVO) 
	{
		this.branchDAO.insert(branchVO);
	}

	public List search() 
	{
		return this.branchDAO.search();
	}

	public void delete(BranchVO branchVO) 
	{
		this.branchDAO.delete(branchVO);
	}

	public void deleteAllByState(BranchVO branchVO) 
	{
		this.branchDAO.deleteAllByState(branchVO);
	}
	public void deleteAllByCity(BranchVO branchVO) 
	{
		this.branchDAO.deleteAllByCity(branchVO);
	}

	public List edit(BranchVO branchVO) 
	{
		return this.branchDAO.edit(branchVO);
	}
}
