package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Services")
public class ServicesVO {

	@Id
	@Column(name="service_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int service_id;
	
	@Column(name="service_name")
	private String service_name;
	
	@Column(name="service_description")
	private String service_description;

	@Column(name="service_status")
	private boolean service_status=true;
	
	public boolean isService_status() {
		return service_status;
	}

	public void setService_status(boolean service_status) {
		this.service_status = service_status;
	}

	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public String getService_description() {
		return service_description;
	}

	public void setService_description(String service_description) {
		this.service_description = service_description;
	}
	
	
	
}
