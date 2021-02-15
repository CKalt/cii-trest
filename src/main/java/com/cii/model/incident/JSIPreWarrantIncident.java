package com.cii.model.incident;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="JSIPreWarrant")
public class JSIPreWarrantIncident {
	private String id;
	private String firstname;
	private String lastname;
	private Date dob;
	private String dln;
	private String dlState;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String email;
	private String caseTypeDesc;
	private Date originalHearingDate;
	private String caseNumber;
    private String cleanCaseNumber;
    private String statute;
    private String charge;
    private int chargeSeq;
	private BigDecimal amountDue;
    private Date originalOffenseDate;
    private Date expirationDate;
		
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCaseTypeDesc() {
        return caseTypeDesc;
    }

    public void setCaseTypeDesc(String caseTypeDesc) {
        this.caseTypeDesc = caseTypeDesc;
    }

    public Date getOriginalHearingDate() {
        return originalHearingDate;
    }

    public void setOriginalHearingDate(Date originalHearingDate) {
        this.originalHearingDate = originalHearingDate;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getCleanCaseNumber() {
        return cleanCaseNumber;
    }

    public void setCleanCaseNumber(String cleanCaseNumber) {
        this.cleanCaseNumber = cleanCaseNumber;
    }

    public String getStatute() {
        return statute;
    }

    public void setStatute(String statute) {
        this.statute = statute;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public int getChargeSeq() {
        return chargeSeq;
    }

    public void setChargeSeq(int chargeSeq) {
        this.chargeSeq = chargeSeq;
    }

    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
    }

    public Date getOriginalOffenseDate() {
        return originalOffenseDate;
    }

    public void setOriginalOffenseDate(Date originalOffenseDate) {
        this.originalOffenseDate = originalOffenseDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
