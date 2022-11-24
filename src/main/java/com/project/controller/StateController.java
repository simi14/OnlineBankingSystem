package com.project.controller;

import java.util.List;

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
public class StateController {


	@Autowired
	private StateService stateService;
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping(value ="admin/addState")
	public ModelAndView addState() {
		return new ModelAndView("admin/addState","stateVO",new StateVO()); 
	}
	
/*	@RequestMapping(value ="/viewState")
	public ModelAndView viewState() {
		return new ModelAndView("admin/viewState"); 
	}*/
	
	@RequestMapping(value ="admin/insertState")
	public ModelAndView insertServices(@ModelAttribute StateVO stateVO) {
		this.stateService.insert(stateVO);
		return new ModelAndView("redirect:/admin/viewState"); 
	}
	
	@RequestMapping(value = "admin/viewState", method = RequestMethod.GET)
	public ModelAndView viewState() {

		List searchList = this.stateService.search();

		return new ModelAndView("admin/viewState", "searchList", searchList);
	}
	@RequestMapping(value = "admin/deleteState", method = RequestMethod.GET)
	public ModelAndView deleteState(@ModelAttribute StateVO stateVO,CityVO cityVO, @RequestParam int id) {

		stateVO.setState_id(id);
		cityVO.setStateVO(stateVO);
		this.cityService.deleteAll(cityVO);
		stateService.delete(stateVO);

		return new ModelAndView("redirect:/admin/viewState");
	}
	
	@RequestMapping(value = "admin/editState", method = RequestMethod.GET)
	public ModelAndView editState(@ModelAttribute StateVO stateVO, @RequestParam int id) {

		stateVO.setState_id(id);
		List<ServicesVO> editList = stateService.edit(stateVO);

		return new ModelAndView("admin/addState","stateVO", editList.get(0));

	}
}
