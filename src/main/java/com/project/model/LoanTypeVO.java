package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="LoanType")
public class LoanTypeVO {

	@Id
	@Column(name="loantype_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int loantype_id;
	
	@Column(name="loantype_name")
	private String loantype_name;
	
	@Column(name="loantype_description")
	private String loantype_description;

	@Column(name="loantype_status")
	private boolean loantype_status=true;
	
	public boolean isLoantype_status() {
		return loantype_status;
	}

	public void setLoantype_status(boolean loantype_status) {
		this.loantype_status = loantype_status;
	}

	public int getLoantype_id() {
		return loantype_id;
	}

	public void setLoantype_id(int loantype_id) {
		this.loantype_id = loantype_id;
	}

	public String getLoantype_name() {
		return loantype_name;
	}

	public void setLoantype_name(String loantype_name) {
		this.loantype_name = loantype_name;
	}

	public String getLoantype_description() {
		return loantype_description;
	}

	public void setLoantype_description(String loantype_description) {
		this.loantype_description = loantype_description;
	}

	
}
