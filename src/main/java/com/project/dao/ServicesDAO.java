package com.project.dao;

import java.util.List;

import com.project.model.ServicesVO;

public interface ServicesDAO {

	public void insert(ServicesVO servicesVO);
	public List search();
	public void delete(ServicesVO servicesVO);
	public List edit(ServicesVO servicesVO);
}
