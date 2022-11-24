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

import com.project.model.LoanRateVO;
import com.project.model.LoanTypeVO;
import com.project.service.LoanRateService;
import com.project.service.LoanTypeService;

@Controller
public class LoanRateController {

	@Autowired
	private LoanTypeService loanTypeService;
	
	@Autowired
	private LoanRateService loanRateService;
	
	@RequestMapping(value ="admin/addLoanRate")
	public ModelAndView addLoanRate(HttpSession session) {
		List<LoanTypeVO> loanType_list = loanTypeService.search();
		session.setAttribute("loanType_list",loanType_list);
		return new ModelAndView("admin/addLoanRate","loanRateVO",new LoanRateVO()); 
	}

	
	@RequestMapping(value ="admin/insertLoanRate")
	public ModelAndView insertLoanRate(@ModelAttribute LoanRateVO loanRateVO) {
		this.loanRateService.insert(loanRateVO);
		return new ModelAndView("redirect:/admin/viewLoanRate"); 
	}
	
	@RequestMapping(value = "admin/viewLoanRate", method = RequestMethod.GET)
	public ModelAndView viewLoanRate() {

		List searchList = this.loanRateService.search();

		return new ModelAndView("admin/viewLoanRate", "searchList", searchList);
	}
	@RequestMapping(value = "admin/deleteLoanRate", method = RequestMethod.GET)
	public ModelAndView deleteLoanRate(@ModelAttribute LoanRateVO loanRateVO, @RequestParam int id) {

		loanRateVO.setLoanRate_id(id);
		loanRateService.delete(loanRateVO);

		return new ModelAndView("redirect:/admin/viewLoanRate");
	}
	
	@RequestMapping(value = "admin/editLoanRate", method = RequestMethod.GET)
	public ModelAndView editLoanRate(@ModelAttribute LoanRateVO loanRateVO, @RequestParam int id,HttpSession session) {

		loanRateVO.setLoanRate_id(id);
		List<LoanRateVO> editList = loanRateService.edit(loanRateVO);

		List<LoanTypeVO> loanType_list = loanTypeService.search();
		session.setAttribute("loanType_list",loanType_list);
		return new ModelAndView("admin/addLoanRate","loanRateVO", editList.get(0));

	}
}
