package com.project.service;

import java.util.List;

import com.project.model.ServicesVO;

public interface ServicesService {

	public void insert(ServicesVO serviceVO);
	public List search();
	public void delete(ServicesVO servicesVO);
	public List edit(ServicesVO servicesVO);
}
