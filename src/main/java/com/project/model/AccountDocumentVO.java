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
@Table(name="AccountDocuments")
public class AccountDocumentVO {

	public int getAccountDocument_id() {
		return accountDocument_id;
	}

	public void setAccountDocument_id(int accountDocument_id) {
		this.accountDocument_id = accountDocument_id;
	}

	public AccountVO getAccountVO() {
		return accountVO;
	}

	public void setAccountVO(AccountVO accountVO) {
		this.accountVO = accountVO;
	}

	public DocumentsVO getDocumentsVO() {
		return documentsVO;
	}

	public void setDocumentsVO(DocumentsVO documentsVO) {
		this.documentsVO = documentsVO;
	}

	public boolean isAccountDocument_status() {
		return accountDocument_status;
	}

	public void setAccountDocument_status(boolean accountDocument_status) {
		this.accountDocument_status = accountDocument_status;
	}

	@Id
	@Column(name="accountDocument_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int accountDocument_id;
	
	@ManyToOne
	@JoinColumn(name ="account_id")
	private AccountVO accountVO;
	
	@ManyToOne
	@JoinColumn(name ="document_id")
	private DocumentsVO documentsVO;
	
	@Column(name="accountDocument_status")
	private boolean accountDocument_status=true;
}
