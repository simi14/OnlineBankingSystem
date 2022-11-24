package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.CityDAO;
import com.project.model.CityVO;

@Service
@Transactional
public class CityServiceImpl implements CityService {

	@Autowired
	private CityDAO cityDAO;

	public void insert(CityVO cityVO) 
	{
		this.cityDAO.insert(cityVO);
	}

	public List search() 
	{
		return this.cityDAO.search();
	}
	
	public List searchByState(CityVO cityVO) 
	{
		return this.cityDAO.searchByState(cityVO);
	}
	

	public void delete(CityVO cityVO) 
	{
		this.cityDAO.delete(cityVO);
	}

	public void deleteAll(CityVO cityVO) 
	{
		this.cityDAO.deleteAll(cityVO);
	}

	public List edit(CityVO cityVO) 
	{
		return this.cityDAO.edit(cityVO);
	}
}
