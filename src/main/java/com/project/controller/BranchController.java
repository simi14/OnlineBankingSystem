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

import com.project.model.BranchVO;
import com.project.model.CityVO;
import com.project.model.StateVO;
import com.project.service.BranchService;
import com.project.service.CityService;
import com.project.service.StateService;

@Controller
public class BranchController {

	@Autowired
	private StateService stateService;
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private BranchService branchService;
	
	@RequestMapping(value ="admin/addBranch")
	public ModelAndView addBranch(HttpSession session) {
		List<StateVO> state_list = stateService.search();
		session.setAttribute("state_list",state_list);
		return new ModelAndView("admin/addBranch","branchVO",new BranchVO()); 
	}

	@RequestMapping(value ="admin/getCity")
	public ModelAndView getCity(@RequestParam int stateId,CityVO cityVO,StateVO stateVO,HttpSession session) {
		stateVO.setState_id(stateId);
		cityVO.setStateVO(stateVO);
		List<CityVO> city_list = cityService.searchByState(cityVO);
		session.setAttribute("city_list",city_list);
		return new ModelAndView("admin/cityjson"); 
	}
	
	
	
	@RequestMapping(value ="admin/viewBranch")
	public ModelAndView viewBranch() {
		List searchList = this.branchService.search();

		return new ModelAndView("admin/viewBranch","searchList", searchList); 
	}
	
	@RequestMapping(value ="admin/insertBranch")
	public ModelAndView insertBranch(@ModelAttribute BranchVO branchVO) {
		this.branchService.insert(branchVO);
		return new ModelAndView("redirect:/admin/viewBranch"); 
	}
	
	@RequestMapping(value = "admin/deleteBranch", method = RequestMethod.GET)
	public ModelAndView deleteBranch(@ModelAttribute BranchVO branchVO, @RequestParam int id) {

		branchVO.setBranchId(id);
		branchService.delete(branchVO);

		return new ModelAndView("redirect:/admin/viewBranch");
	}
	
	@RequestMapping(value = "admin/editBranch", method = RequestMethod.GET)
	public ModelAndView editBranch(@ModelAttribute BranchVO branchVO, @RequestParam int id) {

		branchVO.setBranchId(id);
		List<BranchVO> editList = branchService.edit(branchVO);

		return new ModelAndView("admin/addBranch","branchVO", editList.get(0));

	}
}
