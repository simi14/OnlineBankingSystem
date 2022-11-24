package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.CityVO;
import com.project.model.ServicesVO;
import com.project.model.StateVO;
import com.project.service.CityService;
import com.project.service.StateService;

@Controller
public class CityController {

	@Autowired
	private CityService cityService;
	
	@Autowired
	private StateService stateService;
	
	@RequestMapping(value ="admin/addCity")
	public ModelAndView addCity(HttpSession session) {
		List<StateVO> state_list = stateService.search();
		session.setAttribute("state_list",state_list);
		return new ModelAndView("admin/addCity","cityVO",new CityVO()); 
	}
	
	@RequestMapping(value ="admin/insertCity")
	public ModelAndView insertCity(@ModelAttribute CityVO cityVO) {
		this.cityService.insert(cityVO);
		return new ModelAndView("redirect:/admin/viewCity"); 
	}
	
	@RequestMapping(value = "admin/viewCity", method = RequestMethod.GET)
	public ModelAndView viewCity() {

		List searchList = this.cityService.search();

		return new ModelAndView("admin/viewCity", "searchList", searchList);
	}
	@RequestMapping(value = "admin/deleteCity", method = RequestMethod.GET)
	public ModelAndView deleteCity(@ModelAttribute CityVO cityVO, @RequestParam int id) {

		cityVO.setCity_id(id);
		cityService.delete(cityVO);

		return new ModelAndView("redirect:/admin/viewCity");
	}
	
	@RequestMapping(value = "admin/editCity", method = RequestMethod.GET)
	public ModelAndView editCity(@ModelAttribute CityVO cityVO, @RequestParam int id) {

		cityVO.setCity_id(id);
		List<CityVO> editList = cityService.edit(cityVO);

		return new ModelAndView("admin/addCity","cityVO", editList.get(0));

	}
}
