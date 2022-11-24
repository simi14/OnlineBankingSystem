package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Documents")
public class DocumentsVO {

	@Id
	@Column(name = "document_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int document_id;

	@Column(name = "document_name")
	private String document_name;

	@Column(name = "document_description")
	private String document_description;

	@Column(name = "document_file_name")
	private String documentFileName;

	@Column(name = "document_file_path")
	private String documentFilePath;

	@Column(name = "document_status")
	private boolean document_status = true;

	public boolean isDocument_status() {
		return document_status;
	}

	public void setDocument_status(boolean document_status) {
		this.document_status = document_status;
	}

	public int getDocument_id() {
		return document_id;
	}

	public void setDocument_id(int document_id) {
		this.document_id = document_id;
	}

	public String getDocument_name() {
		return document_name;
	}

	public void setDocument_name(String document_name) {
		this.document_name = document_name;
	}

	public String getDocument_description() {
		return document_description;
	}

	public void setDocument_description(String document_description) {
		this.document_description = document_description;
	}

	public String getDocumentFileName() {
		return documentFileName;
	}

	public void setDocumentFileName(String documentFileName) {
		this.documentFileName = documentFileName;
	}

	public String getDocumentFilePath() {
		return documentFilePath;
	}

	public void setDocumentFilePath(String documentFilePath) {
		this.documentFilePath = documentFilePath;
	}

}
