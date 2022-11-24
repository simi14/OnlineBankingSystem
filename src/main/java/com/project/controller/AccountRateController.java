package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountRateController {

	@RequestMapping(value ="admin/addAccountRate")
	public ModelAndView addAccountRate() {
		return new ModelAndView("admin/addAccountRate"); 
	}
	
	@RequestMapping(value ="admin/viewAccountRate")
	public ModelAndView viewAccountRate() {
		return new ModelAndView("admin/viewAccountRate"); 
	}
}
