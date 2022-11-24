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

import com.project.model.AccountDocumentVO;
import com.project.model.AccountVO;
import com.project.model.DocumentsVO;
import com.project.model.LoanDocumentVO;
import com.project.model.LoanTypeVO;
import com.project.model.RequiredDocumentsVO;
import com.project.model.ServicesVO;
import com.project.service.AccountDocumentService;
import com.project.service.AccountService;
import com.project.service.DocumentsService;
import com.project.service.LoanDocumentService;
import com.project.service.LoanTypeService;
import com.project.service.RequiredDocumentsService;
import com.project.service.ServicesService;

@Controller
public class RequiredDocumentsController {

	@Autowired
	private ServicesService servicesService;

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private LoanTypeService loanTypeService;
	
	@Autowired
	private DocumentsService documentsService;

	@Autowired
	private RequiredDocumentsService requiredDocumentsService;
	
	@Autowired
	private AccountDocumentService accountDocumentService;
	
	@Autowired
	private LoanDocumentService loanDocumentService;

	
	//Required Documents
	
	@RequestMapping(value = "admin/addRequiredDocuments")
	public ModelAndView addRequiredDocuments(HttpSession session) {
		List<ServicesVO> service_list = this.servicesService.search();
		session.setAttribute("service_list", service_list);

		List<DocumentsVO> document_list = this.documentsService.search();
		session.setAttribute("document_list", document_list);

		return new ModelAndView("admin/addRequiredDocuments", "requiredDocumentsVO", new RequiredDocumentsVO());
	}

	@RequestMapping(value = "admin/insertRequiredDocuments")
	public ModelAndView insertRequiredDocuments(@RequestParam int sid, @RequestParam String[] documentVOList) {

		ServicesVO servicesVO = new ServicesVO();
		servicesVO.setService_id(sid);

		for (int i = 0; i < documentVOList.length; i++) {

			DocumentsVO documentsVO = new DocumentsVO();
			documentsVO.setDocument_id(Integer.parseInt(documentVOList[i]));

			RequiredDocumentsVO requiredDocumentsVO = new RequiredDocumentsVO();
			requiredDocumentsVO.setDocumentsVO(documentsVO);
			requiredDocumentsVO.setServicesVO(servicesVO);
			requiredDocumentsVO.setRequiredDocument_status(true);

			// TODO: Insert requiredDocumentsVO here
			this.requiredDocumentsService.insert(requiredDocumentsVO);
		}
		return new ModelAndView("redirect:/admin/viewRequiredDocuments");
	}

	@RequestMapping(value = "admin/deleteRequiredDocuments", method = RequestMethod.GET)
	public ModelAndView deleteRequiredDocuments(@ModelAttribute RequiredDocumentsVO requiredDocumentsVO,
			@RequestParam int id) {

		requiredDocumentsVO.setRequiredDocument_id(id);
		
		requiredDocumentsService.delete(requiredDocumentsVO);
		

		return new ModelAndView("redirect:/admin/viewRequiredDocuments");
	}

	@RequestMapping(value = "admin/editRequiredDocuments", method = RequestMethod.GET)
	public ModelAndView editRequiredDocuments(@ModelAttribute RequiredDocumentsVO requiredDocumentsVO, @RequestParam int id) {

		requiredDocumentsVO.setRequiredDocument_id(id);
		;
		List<RequiredDocumentsVO> editList = requiredDocumentsService.edit(requiredDocumentsVO);

		return new ModelAndView("admin/addRequiredDocuments", "requiredDocumentsVO", editList.get(0));

	}

	@RequestMapping(value = "admin/viewRequiredDocuments")
	public ModelAndView viewRequiredDocuments() {
		List searchList = this.requiredDocumentsService.search();
		return new ModelAndView("admin/viewRequiredDocuments", "searchList", searchList);
	}
	
	//Account Required Documents
	
	@RequestMapping(value = "admin/accountRequiredDocuments")
	public ModelAndView accountRequiredDocuments(HttpSession session) {
		List<AccountVO> account_list = this.accountService.search();
		session.setAttribute("account_list",account_list);
		
		List<DocumentsVO> document_list = this.documentsService.search();
		session.setAttribute("document_list", document_list);
		
		return new ModelAndView("admin/accountRequiredDocuments","accountDocumentVO", new AccountDocumentVO());
	}

	@RequestMapping(value = "admin/insertAccountDocuments")
	public ModelAndView insertAccountDocuments(@RequestParam int aid, @RequestParam String[] documentVOList) {

		AccountVO accountVO=new AccountVO();
		accountVO.setAccount_id(aid);

		for (int i = 0; i < documentVOList.length; i++) {

			DocumentsVO documentsVO = new DocumentsVO();
			documentsVO.setDocument_id(Integer.parseInt(documentVOList[i]));

			AccountDocumentVO accountDocumentsVO = new AccountDocumentVO();
			accountDocumentsVO.setDocumentsVO(documentsVO);
			accountDocumentsVO.setAccountVO(accountVO);
			accountDocumentsVO.setAccountDocument_status(true);

			// TODO: Insert requiredDocumentsVO here
			this.accountDocumentService.insert(accountDocumentsVO);
		}
		return new ModelAndView("redirect:/admin/viewAccountDocuments");
	}

	@RequestMapping(value = "admin/deleteAccountDocuments", method = RequestMethod.GET)
	public ModelAndView deleteAccountDocuments(@ModelAttribute AccountDocumentVO accountDocumentVO,
			@RequestParam int id) {

		accountDocumentVO.setAccountDocument_id(id);
		
		accountDocumentService.delete(accountDocumentVO);
		

		return new ModelAndView("redirect:/admin/viewAccountDocuments");
	}

	@RequestMapping(value = "admin/editAccountDocuments", method = RequestMethod.GET)
	public ModelAndView editAccountDocuments(@ModelAttribute AccountDocumentVO accountDocumentVO, @RequestParam int id) {

		accountDocumentVO.setAccountDocument_id(id);
		
		List<AccountDocumentVO> editList = accountDocumentService.edit(accountDocumentVO);

		return new ModelAndView("admin/accountRequiredDocuments","accountDocumentVO", editList.get(0));

	}
	@RequestMapping(value = "admin/viewAccountDocuments")
	public ModelAndView viewAccountDocuments() {
		List searchList = this.accountDocumentService.search();
		return new ModelAndView("admin/viewAccountDocuments", "searchList", searchList);
	}

	
	//Loan Required Documents
	
	
	@RequestMapping(value = "admin/loanRequiredDocuments")
	public ModelAndView loanRequiredDocuments(HttpSession session) {
		List<LoanTypeVO> loanType_list = this.loanTypeService.search();
		session.setAttribute("loanType_list",loanType_list);
		
		List<DocumentsVO> document_list = this.documentsService.search();
		session.setAttribute("document_list", document_list);
		
		return new ModelAndView("admin/loanRequiredDocuments","loanDocumentVO", new LoanDocumentVO());
	}

	@RequestMapping(value = "admin/viewLoanDocuments")
	public ModelAndView viewLoanDocuments() {
		List searchList = this.loanDocumentService.search();
		return new ModelAndView("admin/viewLoanDocuments", "searchList", searchList);
	}
	
	@RequestMapping(value = "admin/insertLoanDocuments")
	public ModelAndView insertLoanDocuments(@RequestParam int aid, @RequestParam String[] documentVOList) {

		LoanTypeVO loanTypeVO=new LoanTypeVO();
		loanTypeVO.setLoantype_id(aid);

		for (int i = 0; i < documentVOList.length; i++) {

			DocumentsVO documentsVO = new DocumentsVO();
			documentsVO.setDocument_id(Integer.parseInt(documentVOList[i]));

			LoanDocumentVO loanDocumentsVO = new LoanDocumentVO();
			loanDocumentsVO.setDocumentsVO(documentsVO);
			loanDocumentsVO.setLoanTypeVO(loanTypeVO);
			loanDocumentsVO.setLoanDocument_status(true);

			// TODO: Insert requiredDocumentsVO here
			this.loanDocumentService.insert(loanDocumentsVO);
		}
		return new ModelAndView("redirect:/admin/viewLoanDocuments");
	}

	@RequestMapping(value = "admin/deleteLoanDocuments", method = RequestMethod.GET)
	public ModelAndView deleteLoanDocuments(@ModelAttribute LoanDocumentVO loanDocumentVO,
			@RequestParam int id) {

		loanDocumentVO.setLoanDocument_id(id);
		
		loanDocumentService.delete(loanDocumentVO);
		

		return new ModelAndView("redirect:/admin/viewLoanDocuments");
	}

	@RequestMapping(value = "admin/editLoanDocuments", method = RequestMethod.GET)
	public ModelAndView editLoanDocuments(@ModelAttribute LoanDocumentVO loanDocumentVO, @RequestParam int id) {

		loanDocumentVO.setLoanDocument_id(id);
		
		List<LoanDocumentVO> editList = loanDocumentService.edit(loanDocumentVO);

		return new ModelAndView("admin/loanRequiredDocuments","loanDocumentVO", editList.get(0));

	}

}
