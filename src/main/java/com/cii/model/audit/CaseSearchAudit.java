package com.cii.model.audit;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.cii.model.incident.EligibilityStatus;
import com.querydsl.core.annotations.QueryEntity;

@QueryEntity
@Document
@CompoundIndexes({
    @CompoundIndex(name = "urlKeyAndCreateDate", def = "{urlKey: 1, createDate: -1}")
})
public class CaseSearchAudit {
    @Id
    private String id;
    private String urlKey;
    private String caseType;
    private String dln;
    private String dlState;
    private Date   dob;
    private String dobDay;
    private String dobMonth;
    private String dobYear;
    private String caseNumber;
    private String firstname;
    private String lastname;
    private String lpn;
    private String lpState;
    
    @Indexed(direction = IndexDirection.DESCENDING)
    private Date createDate;
    private int inProgressCount;
    private int casesCompletedCount;

    private Map<EligibilityStatus, Integer> eligibilityStatusCounts = new HashMap<>();

    public int getInProgressCount() {
        return inProgressCount;
    }

    public void setInProgressCount(int inProgressCount) {
        this.inProgressCount = inProgressCount;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Map<EligibilityStatus, Integer> getEligibilityStatusCounts() {
        return eligibilityStatusCounts;
    }

    public void setEligibilityStatusCounts(Map<EligibilityStatus, Integer> eligibilityStatusCounts) {
        this.eligibilityStatusCounts = eligibilityStatusCounts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrlKey() {
        return urlKey;
    }

    public void seturlKey(String urlKey) {
        this.urlKey = urlKey;
    }

    public String getDln() {
        return dln;
    }

    public void setDln(String dln) {
        this.dln = dln.replaceAll("[^a-zA-Z0-9\\*]", "").toUpperCase();
    }

    public String getDlState() {
        return dlState;
    }

    public void setDlState(String dlState) {
        this.dlState = dlState.replaceAll("\\s", "").toUpperCase();
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob= dob;
    }

    public String getDobDay() {
        return dobDay;
    }

    public void setDobDay(String dobDay) {
        this.dobDay = dobDay.trim();
    }

    public String getDobMonth() {
        return dobMonth;
    }

    public void setDobMonth(String dobMonth) {
        this.dobMonth = dobMonth.trim();
    }

    public String getDobYear() {
        return dobYear;
    }

    public void setDobYear(String dobYear) {
        this.dobYear = dobYear.trim();
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
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

    public int getCasesCompletedCount() {
        return casesCompletedCount;
    }

    public void setCasesCompletedCount(int casesCompletedCount) {
        this.casesCompletedCount = casesCompletedCount;
    }
}
