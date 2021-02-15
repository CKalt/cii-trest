package com.cii.model.incident;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="JMSPreWarrant")
public class JMSPreWarrantIncident {
	private String id;
	private String courtCode;
	private String caseNumber;
	private String cleanCaseNumber;
	private String caseStatus;
	private String firstname;
	private String middlename;
	private String lastname;
	private String stateId;
	private String dln;
	private String dlState;
	private Date dob;
	private String offenseDesc;
    private BigDecimal amountDue;
    private BigDecimal totalDue;
	
	public JMSPreWarrantIncident() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getCourtCode() {
        return courtCode;
    }

    public void setCourtCode(String courtCode) {
        this.courtCode = courtCode;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
        this.cleanCaseNumber = normalize(caseNumber);
    }

    public String getCleanCaseNumber() {
        return cleanCaseNumber;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDln() {
        return dln;
    }

    public void setDln(String dln) {
        this.dln = dln;
    }

    public String getDlState() {
        return dlState;
    }

    public void setDlState(String dlState) {
        this.dlState = dlState;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getOffenseDesc() {
        return offenseDesc;
    }

    public void setOffenseDesc(String offenseDesc) {
        this.offenseDesc = offenseDesc;
    }
    
    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
    }

    public BigDecimal getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(BigDecimal totalDue) {
        this.totalDue = totalDue;
    }
    
    public Incident toIncident() {
        Incident t = new Incident();

        t.setCourtCode(courtCode);
        t.setCaseNumber(caseNumber);
        t.setCleanCaseNumber(cleanCaseNumber);
        t.setStatus(caseStatus);
        t.setStateId(stateId);
        t.setFirstname(firstname);
        t.setMiddlename(middlename);
        t.setLastname(lastname);        
        t.setDln(dln);
        t.setDlState(dlState);
        t.setDob(dob);
        if(amountDue!=null) {
            t.setAmountDue(new DecimalFormat("#0.00").format(amountDue));
        }
        t.setTotalDue(totalDue);
        t.setOffenseDesc(offenseDesc);
        t.setWarrantOutstanding(Boolean.FALSE);        

        return t;
    }
    
    private String normalize(String caseNum) {
        return caseNum.replaceAll("[^0-9a-zA-Z]+", "").toUpperCase();
    }
	
}
