package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ComplaintsController {


	
	@RequestMapping(value ="admin/viewComplaint")
	public ModelAndView viewBankingForm() {
		return new ModelAndView("admin/viewComplaint"); 
	}
}
