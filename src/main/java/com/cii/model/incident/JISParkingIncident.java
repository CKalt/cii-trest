package com.cii.model.incident;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="JISParking")
public class JISParkingIncident {
	private String id;
	private String court;
	private String caseNumber;
	private String caseParty;
	private String caseStatus;
	private String firstname;
	private String middlename;
	private String lastname;
	private String dln;
	private String dlState;
	private Date dob;
	private String licensePlate;
	private String licensePlateState;
	private int licensePlateYear;
	private Date ticketDate;
	private String violationCode;
	private String violationDesc;
	private String violationLocation;
    private BigDecimal amountDue;
    private BigDecimal amountPaid;
    private String ticketingAgency;
    private String officer;
    private Date dispositionDate;
    private String dispositionDesc;
    private String courtCaseType;
	
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

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlateState() {
        return licensePlateState;
    }

    public void setLicensePlateState(String lpState) {
        this.licensePlateState = lpState;
    }

    public int getLicensePlateYear() {
        return licensePlateYear;
    }

    public void setLicensePlateYear(int lpYear) {
        this.licensePlateYear = lpYear;
    }

    public Date getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(Date ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getViolationCode() {
        return violationCode;
    }

    public void setViolationCode(String violationCode) {
        this.violationCode = violationCode;
    }

    public String getViolationDesc() {
        return violationDesc;
    }

    public void setViolationDesc(String violationDesc) {
        this.violationDesc = violationDesc;
    }
    
    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
    }

    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getTicketingAgency() {
        return ticketingAgency;
    }

    public void setTicketingAgency(String ticketingAgency) {
        this.ticketingAgency = ticketingAgency;
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }

    public Date getDispositionDate() {
        return dispositionDate;
    }

    public void setDispositionDate(Date dispositionDate) {
        this.dispositionDate = dispositionDate;
    }

    public String getDispositionDesc() {
        return dispositionDesc;
    }
    
    public void setDispositionDesc(String dispositionDesc) {
        this.dispositionDesc = dispositionDesc;
    }

    public String getViolationLocation() {
        return violationLocation;
    }

    public void setViolationLocation(String violationLocation) {
        this.violationLocation = violationLocation;
    }

    public String getCourtCaseType() {
        return courtCaseType;
    }

    public void setCourtCaseType(String courtCaseType) {
        this.courtCaseType = courtCaseType;
    }
}
