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
@Table(name="City")
public class CityVO {

	@Id
	@Column(name="city_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int city_id;
	
	@Column(name="city_name")
	private String city_name;

	@Column(name="city_status")
	private boolean city_status=true;
	
	@ManyToOne
	@JoinColumn(name ="state_id")
	private StateVO stateVO;

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public boolean isCity_status() {
		return city_status;
	}

	public void setCity_status(boolean city_status) {
		this.city_status = city_status;
	}

	public StateVO getStateVO() {
		return stateVO;
	}

	public void setStateVO(StateVO stateVO) {
		this.stateVO = stateVO;
	}
	
	
}
