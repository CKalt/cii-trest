package com.cii.model.incident;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="JMSWarrant")
public class JMSWarrantIncident {
	private String id;
	private String courtCode;
	private BigDecimal amount;
	private String warrantType;
	private String caseNumber;
	
	public String getCourtCode() {
        return courtCode;
    }

    public void setCourtCode(String courtCode) {
        this.courtCode = courtCode;
    }
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	public String getWarrantType() {
		return warrantType;
	}
	
	public void setWarrantType(String warrantType) {
		this.warrantType = warrantType;
	}
	
	public String getCaseNumber() {
		return caseNumber;
	}
	
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
}
