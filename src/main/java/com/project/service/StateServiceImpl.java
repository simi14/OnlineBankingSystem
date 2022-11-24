package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.StateDAO;
import com.project.model.StateVO;

@Service
@Transactional
public class StateServiceImpl implements StateService{

	@Autowired
	private StateDAO stateDAO;

	public void insert(StateVO stateVO) {	
		this.stateDAO.insert(stateVO);
	}
	
	public List search() {
		return this.stateDAO.search();

	}
	public void delete(StateVO stateVO) {
		this.stateDAO.delete(stateVO);
	}
	
	public List edit(StateVO stateVO) {
		return this.stateDAO.edit(stateVO);

	}
}
