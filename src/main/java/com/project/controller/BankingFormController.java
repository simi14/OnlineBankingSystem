package com.project.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.BankingFormVO;
import com.project.service.BankingFormService;
import com.project.utils.BaseMethods;



@Controller
public class BankingFormController {

	@Autowired
	private BankingFormService bankingFormService;
	
	@RequestMapping(value ="admin/addBankingForm")
	public ModelAndView addBankingForm() {
		return new ModelAndView("admin/addBankingForm","bankingFormVO", new BankingFormVO()); 
	}
	
	/*@RequestMapping(value ="admin/viewBankingForm")
	public ModelAndView viewBankingForm() {
		return new ModelAndView("admin/viewBankingForm"); 
	}
	*/
	@RequestMapping(value = "admin/insertBankingForm")
	public ModelAndView insertBankingForm(HttpServletRequest request, @ModelAttribute BankingFormVO bankingFormVO,
			@RequestParam MultipartFile file) {

		String path = request.getSession().getServletContext().getRealPath("/");
		String fileName = file.getOriginalFilename();
		String filePath = path + "documents\\BankingForms\\";

		try {
			byte barr[] = file.getBytes();

			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(filePath + "/" + fileName));

			bout.write(barr);
			bout.flush();
			bout.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		String link=BaseMethods.uploadFile(filePath + "/" + fileName);
		bankingFormVO.setBankingFormFileName(fileName);
		bankingFormVO.setBankingFormFilePath(filePath);
		bankingFormVO.setBankingFormlink(link);
		this.bankingFormService.insert(bankingFormVO);
		return new ModelAndView("redirect:/admin/viewBankingForm");
	}

	@RequestMapping(value = "admin/viewBankingForm", method = RequestMethod.GET)
	public ModelAndView viewBankingForm() {

		List searchList = this.bankingFormService.search();

		return new ModelAndView("admin/viewBankingForm", "searchList", searchList);
	}

	@RequestMapping(value = "admin/deleteBankingForm", method = RequestMethod.GET)
	public ModelAndView deleteBankingForm(@ModelAttribute BankingFormVO bankingFormVO, @RequestParam int id) {

		bankingFormVO.setBankingFormId(id);
		bankingFormService.delete(bankingFormVO);

		return new ModelAndView("redirect:/admin/viewBankingForm");
	}

	@RequestMapping(value = "admin/editBankingForm", method = RequestMethod.GET)
	public ModelAndView editBankingForm(@ModelAttribute BankingFormVO bankingFormVO, @RequestParam int id) {

		bankingFormVO.setBankingFormId(id);
		List<BankingFormVO> editList = bankingFormService.edit(bankingFormVO);

		return new ModelAndView("admin/addBankingForm", "bankingFormVO", editList.get(0));

	}
}
