package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BankingForms")
public class BankingFormVO {

	@Id
	@Column(name = "bankingForm_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bankingFormId;

	@Column(name = "bankingForm_name")
	private String bankingFormName;

	@Column(name = "bankingForm_description")
	private String bankingFormDescription;

	@Column(name = "bankingForm_file_name")
	private String bankingFormFileName;

	@Column(name = "bankingForm_file_path")
	private String bankingFormFilePath;
	
	@Column(name = "bankingForm_link")
	private String bankingFormlink;

	public String getBankingFormlink() {
		return bankingFormlink;
	}

	public void setBankingFormlink(String bankingFormlink) {
		this.bankingFormlink = bankingFormlink;
	}

	@Column(name = "bankingForm_status")
	private boolean bankingFormStatus = true;

	public int getBankingFormId() {
		return bankingFormId;
	}

	public void setBankingFormId(int bankingFormId) {
		this.bankingFormId = bankingFormId;
	}

	public String getBankingFormName() {
		return bankingFormName;
	}

	public void setBankingFormName(String bankingFormName) {
		this.bankingFormName = bankingFormName;
	}

	public String getBankingFormDescription() {
		return bankingFormDescription;
	}

	public void setBankingFormDescription(String bankingFormDescription) {
		this.bankingFormDescription = bankingFormDescription;
	}

	public String getBankingFormFileName() {
		return bankingFormFileName;
	}

	public void setBankingFormFileName(String bankingFormFileName) {
		this.bankingFormFileName = bankingFormFileName;
	}

	public String getBankingFormFilePath() {
		return bankingFormFilePath;
	}

	public void setBankingFormFilePath(String bankingFormFilePath) {
		this.bankingFormFilePath = bankingFormFilePath;
	}

	public boolean isBankingFormStatus() {
		return bankingFormStatus;
	}

	public void setBankingFormStatus(boolean bankingFormStatus) {
		this.bankingFormStatus = bankingFormStatus;
	}
}
