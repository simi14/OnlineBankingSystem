package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ServicesDAO;
import com.project.model.ServicesVO;

@Service
@Transactional
public class ServicesServiceImpl implements ServicesService{

	@Autowired
	private ServicesDAO servicesDAO;

	public void insert(ServicesVO servicesVO) {	
		this.servicesDAO.insert(servicesVO);
	}
	
	public List search() {
		return this.servicesDAO.search();

	}
	public void delete(ServicesVO servicesVO) {
		this.servicesDAO.delete(servicesVO);
	}
	
	public List edit(ServicesVO servicesVO) {
		return this.servicesDAO.edit(servicesVO);

	}

}
