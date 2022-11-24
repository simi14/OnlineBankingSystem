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
@Table(name="Branch")
public class BranchVO {

	@Id
	@Column(name="branch_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int branchId;
	
	@Column(name="branch_name")
	private String branchName;
	
	@Column(name="IFSC_code")
	private String ifscCode;

	@Column(name="branch_status")
	private boolean branch_status=true;
	
	@Column(name="branch_address")
	private String branchAddress;
	
	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}


	public boolean isBranch_status() {
		return branch_status;
	}

	public void setBranch_status(boolean branch_status) {
		this.branch_status = branch_status;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}


	public StateVO getStateVO() {
		return stateVO;
	}

	public void setStateVO(StateVO stateVO) {
		this.stateVO = stateVO;
	}

	public CityVO getCityVO() {
		return cityVO;
	}

	public void setCityVO(CityVO cityVO) {
		this.cityVO = cityVO;
	}

	@ManyToOne
	@JoinColumn(name ="state_id")
	private StateVO stateVO;
	
	@ManyToOne
	@JoinColumn(name ="city_id")
	private CityVO cityVO;
}
