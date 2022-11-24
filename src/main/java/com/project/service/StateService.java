package com.project.service;

import java.util.List;

import com.project.model.StateVO;

public interface StateService {

	public void insert(StateVO stateVO);
	public List search();
	public void delete(StateVO stateVO);
	public List edit(StateVO stateVO);
}
