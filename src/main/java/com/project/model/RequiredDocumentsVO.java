package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="RequiredDocuments")
public class RequiredDocumentsVO {

	@Id
	@Column(name="requiredDocument_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int requiredDocument_id;
	
	@ManyToOne
	@JoinColumn(name ="service_id")
	private ServicesVO servicesVO;
	
	@ManyToOne
	@JoinColumn(name ="document_id")
	private DocumentsVO documentsVO;
	
	@Column(name="requiredDocument_status")
	private boolean requiredDocument_status=true;

	public int getRequiredDocument_id() {
		return requiredDocument_id;
	}

	public void setRequiredDocument_id(int requiredDocument_id) {
		this.requiredDocument_id = requiredDocument_id;
	}

	public ServicesVO getServicesVO() {
		return servicesVO;
	}

	public void setServicesVO(ServicesVO servicesVO) {
		this.servicesVO = servicesVO;
	}

	public DocumentsVO getDocumentsVO() {
		return documentsVO;
	}

	public void setDocumentsVO(DocumentsVO documentsVO) {
		this.documentsVO = documentsVO;
	}

	public boolean isRequiredDocument_status() {
		return requiredDocument_status;
	}

	public void setRequiredDocument_status(boolean requiredDocument_status) {
		this.requiredDocument_status = requiredDocument_status;
	}
	

	
}
