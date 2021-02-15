package com.cii.model.incident;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JSIIncident")
public class JSIIncident {
    private String id;
    private String caseNumber;
    private BigDecimal preDispositionBalance;
    private String cid;
    private BigDecimal amountOrdered;
    private BigDecimal amountDue;
    private BigDecimal amountPaid;
    private Date caseDispositionDate;
    private String caseType;
    private String courtCode;
    private String dlState;
    private String dln;
    private Date dob;
    private String email;
    private String firstName;
    private String middleName;
    private String lastName;
    private String judgeNumber;
    private String lpn;
    private String lpState;
    private Integer lpYear;
    private Date offenseDate;
    private String policeAgency;
    private String officer;
    private String citationNumber;
    private Integer speedCited;
    private Integer speedPosted;
    private String sosCode;
    private Date filingDate;
    private String localOffenseCode;
    private String sosDescription;
    private String localOffenseDescription;
    private String caseStatus;
    private Date statusDate;
    private String warrantStatus;
    private Boolean accident;
    private Boolean propertyDamage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public BigDecimal getAmountOrdered() {
        return amountOrdered;
    }

    public void setAmountOrdered(BigDecimal amountOrdered) {
        this.amountOrdered = amountOrdered;
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

    public Date getCaseDispositionDate() {
        return caseDispositionDate;
    }

    public void setCaseDispositionDate(Date caseDispositionDate) {
        this.caseDispositionDate = caseDispositionDate;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getCourtCode() {
        return courtCode;
    }

    public void setCourtCode(String courtCode) {
        this.courtCode = courtCode;
    }

    public String getDlState() {
        return dlState;
    }

    public void setDlState(String dlState) {
        this.dlState = dlState;
    }

    public String getDln() {
        return dln;
    }

    public void setDln(String dln) {
        this.dln = dln;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJudgeNumber() {
        return judgeNumber;
    }

    public void setJudgeNumber(String judgeNumber) {
        this.judgeNumber = judgeNumber;
    }

    public String getLpn() {
        return lpn;
    }

    public void setLpn(String lpn) {
        this.lpn = lpn;
    }

    public String getLpState() {
        return lpState;
    }

    public void setLpState(String lpState) {
        this.lpState = lpState;
    }

    public Integer getLpYear() {
        return lpYear;
    }

    public void setLpYear(Integer lpYear) {
        this.lpYear = lpYear;
    }

    public Date getOffenseDate() {
        return offenseDate;
    }

    public void setOffenseDate(Date offenseDate) {
        this.offenseDate = offenseDate;
    }

    public String getPoliceAgency() {
        return policeAgency;
    }

    public void setPoliceAgency(String policeAgency) {
        this.policeAgency = policeAgency;
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }

    public Integer getSpeedCited() {
        return speedCited;
    }

    public void setSpeedCited(Integer speedCited) {
        this.speedCited = speedCited;
    }

    public Integer getSpeedPosted() {
        return speedPosted;
    }

    public void setSpeedPosted(Integer speedPosted) {
        this.speedPosted = speedPosted;
    }

    public String getSosCode() {
        return sosCode;
    }

    public void setSosCode(String sosCode) {
        this.sosCode = sosCode;
    }

    public Date getFilingDate() {
        return filingDate;
    }

    public void setFilingDate(Date filingDate) {
        this.filingDate = filingDate;
    }

    public String getLocalOffenseCode() {
        return localOffenseCode;
    }

    public void setLocalOffenseCode(String localOffenseCode) {
        this.localOffenseCode = localOffenseCode;
    }

    public String getSosDescription() {
        return sosDescription;
    }

    public void setSosDescription(String sosDescription) {
        this.sosDescription = sosDescription;
    }

    public String getLocalOffenseDescription() {
        return localOffenseDescription;
    }

    public void setLocalOffenseDescription(String localOffenseDescription) {
        this.localOffenseDescription = localOffenseDescription;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public String getWarrantStatus() {
        return warrantStatus;
    }

    public void setWarrantStatus(String warrantStatus) {
        this.warrantStatus = warrantStatus;
    }

    public String getCitationNumber() {
        return citationNumber;
    }

    public void setCitationNumber(String citationNumber) {
        this.citationNumber = citationNumber;
    }

    public Boolean getAccident() {
        return accident;
    }

    public void setAccident(Boolean accident) {
        this.accident = accident;
    }

    public Boolean getPropertyDamage() {
        return propertyDamage;
    }

    public void setPropertyDamage(Boolean propertyDamage) {
        this.propertyDamage = propertyDamage;
    }

    public BigDecimal getPreDispositionBalance() {
        return preDispositionBalance;
    }

    public void setPreDispositionBalance(BigDecimal preDispositionBalance) {
        this.preDispositionBalance = preDispositionBalance;
    }
}
