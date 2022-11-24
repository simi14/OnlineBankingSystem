package com.project.dao;

import java.util.List;

import com.project.model.CityVO;

public interface CityDAO {

	public void insert(CityVO cityVO);

	public List search();
	
	public List searchByState(CityVO cityVO);

	public void delete(CityVO cityVO);

	public List edit(CityVO cityVO);

	public void deleteAll(CityVO cityVO);
}
