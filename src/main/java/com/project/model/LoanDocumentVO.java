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
@Table(name="LoanDocuments")
public class LoanDocumentVO {

	@Id
	@Column(name="loanDocument_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int loanDocument_id;
	
	@ManyToOne
	@JoinColumn(name ="loanType_id")
	private LoanTypeVO loanTypeVO;
	
	@ManyToOne
	@JoinColumn(name ="document_id")
	private DocumentsVO documentsVO;
	


	public int getLoanDocument_id() {
		return loanDocument_id;
	}

	public void setLoanDocument_id(int loanDocument_id) {
		this.loanDocument_id = loanDocument_id;
	}

	public LoanTypeVO getLoanTypeVO() {
		return loanTypeVO;
	}

	public void setLoanTypeVO(LoanTypeVO loanTypeVO) {
		this.loanTypeVO = loanTypeVO;
	}

	public DocumentsVO getDocumentsVO() {
		return documentsVO;
	}

	public void setDocumentsVO(DocumentsVO documentsVO) {
		this.documentsVO = documentsVO;
	}

	public boolean isLoanDocument_status() {
		return loanDocument_status;
	}

	public void setLoanDocument_status(boolean loanDocument_status) {
		this.loanDocument_status = loanDocument_status;
	}

	@Column(name="loanDocument_status")
	private boolean loanDocument_status=true;
	
}
