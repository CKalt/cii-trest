package com.cii.model.incident;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JISDwls")
public class JISDwlsIncident {
	private String id;
	private String court;
	private String caseNumber;
	private String caseParty;
	private Date arraignDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourt() {
		return court;
	}

	public void setCourt(String court) {
		this.court = court;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getCaseParty() {
		return caseParty;
	}

	public void setCaseParty(String caseParty) {
		this.caseParty = caseParty;
	}

	public Date getArraignDate() {
		return arraignDate;
	}

	public void setArraignDate(Date arraignDate) {
		this.arraignDate = arraignDate;
	}
}
