package com.project.service;

import java.util.List;

import com.project.model.CityVO;

public interface CityService {

	public void insert(CityVO cityVO);

	public List search();

	public void delete(CityVO cityVO);

	public List edit(CityVO cityVO);

	public void deleteAll(CityVO cityVO);
	
	public List searchByState(CityVO cityVO);
}
