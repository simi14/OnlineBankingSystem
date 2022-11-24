package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.LoanTypeVO;
import com.project.service.LoanTypeService;

@Controller
public class LoanTypeController {

	@Autowired
	private LoanTypeService loanTypeService;
	
	@RequestMapping(value ="admin/addLoanType")
	public ModelAndView addLoanType() {
		return new ModelAndView("admin/addLoanType","loanTypeVO",new LoanTypeVO()); 
	}
	
/*	@RequestMapping(value ="/viewLoanType")
	public ModelAndView viewLoanType() {
		return new ModelAndView("admin/viewLoanType"); 
	}*/
	@RequestMapping(value ="admin/insertLoanType")
	public ModelAndView insertLoanType(@ModelAttribute LoanTypeVO loanTypeVO) {
		this.loanTypeService.insert(loanTypeVO);
		return new ModelAndView("redirect:/admin/viewLoanType"); 
	}
	
	@RequestMapping(value = "admin/viewLoanType", method = RequestMethod.GET)
	public ModelAndView viewLoanType() {

		List searchList = this.loanTypeService.search();

		return new ModelAndView("admin/viewLoanType", "searchList", searchList);
	}
	@RequestMapping(value = "admin/deleteLoanType", method = RequestMethod.GET)
	public ModelAndView deleteLoanType(@ModelAttribute LoanTypeVO loanTypeVO, @RequestParam int id) {

		loanTypeVO.setLoantype_id(id);
		loanTypeService.delete(loanTypeVO);

		return new ModelAndView("redirect:/admin/viewLoanType");
	}
	
	@RequestMapping(value = "admin/editLoanType", method = RequestMethod.GET)
	public ModelAndView editLoanType(@ModelAttribute LoanTypeVO loanTypeVO, @RequestParam int id) {

		loanTypeVO.setLoantype_id(id);
		List<LoanTypeVO> editList = loanTypeService.edit(loanTypeVO);

		return new ModelAndView("admin/addLoanType","loanTypeVO", editList.get(0));

	}
}
