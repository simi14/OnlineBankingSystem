package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.AccountVO;
import com.project.model.LoanTypeVO;
import com.project.service.AccountService;

@Controller
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value ="admin/addAccount")
	public ModelAndView addAccount() {
		return new ModelAndView("admin/addAccount","accountVO",new AccountVO()); 
	}
	
	
	@RequestMapping(value ="admin/insertAccount")
	public ModelAndView insertAccount(@ModelAttribute AccountVO accountVO) {
		this.accountService.insert(accountVO);
		return new ModelAndView("redirect:/admin/viewAccount"); 
	}
	
	@RequestMapping(value = "admin/viewAccount", method = RequestMethod.GET)
	public ModelAndView viewAccount() {

		List searchList = this.accountService.search();

		return new ModelAndView("admin/viewAccount", "searchList", searchList);
	}
	@RequestMapping(value = "admin/deleteAccount", method = RequestMethod.GET)
	public ModelAndView deleteAccount(@ModelAttribute AccountVO accountVO, @RequestParam int id) {

		accountVO.setAccount_id(id);
		accountService.delete(accountVO);

		return new ModelAndView("redirect:/admin/viewAccount");
	}
	
	@RequestMapping(value = "admin/editAccount", method = RequestMethod.GET)
	public ModelAndView editAccount(@ModelAttribute AccountVO accountVO, @RequestParam int id) {

		accountVO.setAccount_id(id);
		List<AccountVO> editList = accountService.edit(accountVO);

		return new ModelAndView("admin/addAccount","accountVO", editList.get(0));

	}
}
