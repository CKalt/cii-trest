package com.cii.model.incident;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="JISWarrant")
public class JISWarrantIncident {
	private String id;
	private String court;
	private String caseNumber;
	private String caseParty;
	private String caseStatus;
	private Date warrantDate;
	private String warrantCode;
	private String warrantCodeDescription;
	private Date warrantRecallDate;
	private BigDecimal amountDue;
	private BigDecimal amountPaid;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCourt() {
		return court;
	}
	
	public String getCaseNumber() {
		return caseNumber;
	}
	
	public String getCaseParty() {
		return caseParty;
	}
	
	public String getCaseStatus() {
		return caseStatus;
	}
	
	public Date getWarrantDate() {
		return warrantDate;
	}
	
	public String getWarrantCode() {
		return warrantCode;
	}
	
	public String getWarrantCodeDescription() {
		return warrantCodeDescription;
	}
	
	public Date getWarrantRecallDate() {
		return warrantRecallDate;
	}
	
	public BigDecimal getAmountDue() {
		return amountDue;
	}
	
	public BigDecimal getAmountPaid() {
		return amountPaid;
	}
	
	public void setCourt(String court) {
		this.court = court;
	}
	
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	
	public void setCaseParty(String caseParty) {
		this.caseParty = caseParty;
	}
	
	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}
	
	public void setWarrantDate(Date warrantDate) {
		this.warrantDate = warrantDate;
	}
	
	public void setWarrantCode(String warrantCode) {
		this.warrantCode = warrantCode;
	}
	
	public void setWarrantCodeDescription(String warrantCodeDescription) {
		this.warrantCodeDescription = warrantCodeDescription;
	}
	
	public void setWarrantRecallDate(Date warrantRecallDate) {
		this.warrantRecallDate = warrantRecallDate;
	}
	
	public void setAmountDue(BigDecimal amountDue) {
		this.amountDue = amountDue;
	}
	
	public void setAmountPaid(BigDecimal amountPaid) {
		this.amountPaid = amountPaid;
	}
}
