package com.cii.model.incident;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="JMSDwls")
public class JMSDwlsIncident {
	private String id;
	private String court;
	private String caseNumber;
	private String caseYear;
	private String caseType;
	private String caseDivision;
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

	public Date getArraignDate() {
		return arraignDate;
	}

	public void setArraignDate(Date arraignDate) {
		this.arraignDate = arraignDate;
	}

	public String getCaseYear() {
		return caseYear;
	}

	public void setCaseYear(String caseYear) {
		this.caseYear = caseYear;
	}

	public String getCaseType() {
		return caseType;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public String getCaseDivision() {
		return caseDivision;
	}

	public void setCaseDivision(String caseDivision) {
		this.caseDivision = caseDivision;
	}
}
