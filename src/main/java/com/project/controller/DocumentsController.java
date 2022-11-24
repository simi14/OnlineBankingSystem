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

import com.project.model.DocumentsVO;
import com.project.service.DocumentsService;

@Controller
public class DocumentsController {

	@Autowired
	private DocumentsService documentsService;

	@RequestMapping(value = "admin/addDocuments")
	public ModelAndView addDocuments() {
		return new ModelAndView("admin/addDocuments", "documentsVO", new DocumentsVO());
	}

	/*
	 * @RequestMapping(value ="/viewDocuments") public ModelAndView
	 * viewDocuments() { return new ModelAndView("admin/viewDocuments"); }
	 */
	@RequestMapping(value = "admin/insertDocuments")
	public ModelAndView insertDocuments(HttpServletRequest request, @ModelAttribute DocumentsVO documentsVO,
			@RequestParam MultipartFile file) {

		String path = request.getSession().getServletContext().getRealPath("/");
		String fileName = file.getOriginalFilename();
		String filePath = path + "documents\\demoDocuments\\";

		try {
			byte barr[] = file.getBytes();

			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(filePath + "/" + fileName));

			bout.write(barr);
			bout.flush();
			bout.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		documentsVO.setDocumentFileName(fileName);
		documentsVO.setDocumentFilePath(filePath);

		this.documentsService.insert(documentsVO);
		return new ModelAndView("redirect:/admin/viewDocuments");
	}

	@RequestMapping(value = "admin/viewDocuments", method = RequestMethod.GET)
	public ModelAndView viewDocuments() {

		List searchList = this.documentsService.search();

		return new ModelAndView("admin/viewDocuments", "searchList", searchList);
	}

	@RequestMapping(value = "admin/deleteDocuments", method = RequestMethod.GET)
	public ModelAndView deleteDocuments(@ModelAttribute DocumentsVO documentsVO, @RequestParam int id) {

		documentsVO.setDocument_id(id);
		documentsService.delete(documentsVO);

		return new ModelAndView("redirect:/admin/viewDocuments");
	}

	@RequestMapping(value = "admin/editDocuments", method = RequestMethod.GET)
	public ModelAndView editDocuments(@ModelAttribute DocumentsVO documentsVO, @RequestParam int id) {

		documentsVO.setDocument_id(id);
		List<DocumentsVO> editList = documentsService.edit(documentsVO);

		return new ModelAndView("admin/addDocuments", "documentsVO", editList.get(0));

	}
}
