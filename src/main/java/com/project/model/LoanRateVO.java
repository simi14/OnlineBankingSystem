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
@Table(name="LoanRate")
public class LoanRateVO {

	@Id
	@Column(name="loanRate_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int loanRate_id;
	
	
	@Column(name="loanRate_tenure")
	private String loanRate_tenure;
	
	@Column(name="loanRate_rate")
	private String loanRate_rate;
	
	@Column(name="loanRate_maxAmount")
	private String loanRate_maxAmount;
	
	@ManyToOne
	@JoinColumn(name ="loantype_id")
	private LoanTypeVO loanTypeVO;
	
	public LoanTypeVO getLoanTypeVO() {
		return loanTypeVO;
	}

	public void setLoanTypeVO(LoanTypeVO loanTypeVO) {
		this.loanTypeVO = loanTypeVO;
	}

	public int getLoanRate_id() {
		return loanRate_id;
	}

	public void setLoanRate_id(int loanRate_id) {
		this.loanRate_id = loanRate_id;
	}



	public String getLoanRate_tenure() {
		return loanRate_tenure;
	}

	public void setLoanRate_tenure(String loanRate_tenure) {
		this.loanRate_tenure = loanRate_tenure;
	}

	public String getLoanRate_rate() {
		return loanRate_rate;
	}

	public void setLoanRate_rate(String loanRate_rate) {
		this.loanRate_rate = loanRate_rate;
	}

	public String getLoanRate_maxAmount() {
		return loanRate_maxAmount;
	}

	public void setLoanRate_maxAmount(String loanRate_maxAmount) {
		this.loanRate_maxAmount = loanRate_maxAmount;
	}

	public boolean isLoanRate_status() {
		return loanRate_status;
	}

	public void setLoanRate_status(boolean loanRate_status) {
		this.loanRate_status = loanRate_status;
	}

	@Column(name="loanRate_status")
	private boolean loanRate_status=true;
}
