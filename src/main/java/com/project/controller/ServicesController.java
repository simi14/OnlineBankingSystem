package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.ServicesVO;
import com.project.service.ServicesService;

@Controller
public class ServicesController {

	
	@Autowired
	private ServicesService servicesService;
	
	@RequestMapping(value ="admin/addServices")
	public ModelAndView addServices() {
		return new ModelAndView("admin/addServices","servicesVO",new ServicesVO()); 
	}
	
	/*@RequestMapping(value ="/viewServices")
	public ModelAndView viewServices() {
		return new ModelAndView("admin/viewServices"); 
	}*/
	
	@RequestMapping(value ="admin/insertServices")
	public ModelAndView insertServices(@ModelAttribute ServicesVO servicesVO) {
		this.servicesService.insert(servicesVO);
		return new ModelAndView("redirect:/admin/viewServices"); 
	}
	
	@RequestMapping(value = "admin/viewServices", method = RequestMethod.GET)
	public ModelAndView viewServices() {

		List searchList = this.servicesService.search();

		return new ModelAndView("admin/viewServices", "searchList", searchList);
	}
	@RequestMapping(value = "admin/deleteServices", method = RequestMethod.GET)
	public ModelAndView deleteServices(@ModelAttribute ServicesVO servicesVO, @RequestParam int id) {

		servicesVO.setService_id(id);
		servicesService.delete(servicesVO);

		return new ModelAndView("redirect:/admin/viewServices");
	}
	
	@RequestMapping(value = "admin/editServices", method = RequestMethod.GET)
	public ModelAndView editServices(@ModelAttribute ServicesVO servicesVO, @RequestParam int id) {

		servicesVO.setService_id(id);
		List<ServicesVO> editList = servicesService.edit(servicesVO);

		return new ModelAndView("admin/addServices","servicesVO", editList.get(0));

	}
}
