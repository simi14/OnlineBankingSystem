package com.project.dao;

import java.util.List;

import com.project.model.BranchVO;

public interface BranchDAO {

	public void insert(BranchVO branchVO);

	public List search();

	public void delete(BranchVO branchVO);

	public List edit(BranchVO branchVO);

	public void deleteAllByState(BranchVO branchVO);
	public void deleteAllByCity(BranchVO branchVO);
}
