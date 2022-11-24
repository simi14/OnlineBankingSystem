package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="State")
public class StateVO {

	@Id
	@Column(name="state_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int state_id;
	
	@Column(name="state_name")
	private String state_name;

	@Column(name="state_status")
	private boolean state_status=true;
	
	public boolean isState_status() {
		return state_status;
	}

	public void setState_status(boolean state_status) {
		this.state_status = state_status;
	}

	public int getState_id() {
		return state_id;
	}

	public void setState_id(int state_id) {
		this.state_id = state_id;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	
	

}
