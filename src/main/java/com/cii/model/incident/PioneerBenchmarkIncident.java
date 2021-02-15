package com.cii.model.incident;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PioneerBenchmarkIncident")
public class PioneerBenchmarkIncident {
	private String id;
	private String caseUniqueId;
	private String courtCode;
	private String caseNumber;
	private String offenseNumber;
	private String caseStatus;
	private String caseType;
    private boolean amendedIndicator;
    private boolean warrantOutstanding;
    private String warrantType;
    private String ticketNumber;
    private String ticketingAgencyCode;
    private String ticketingAgent;
    private String driversLicenseNumber;
    private String driversLicenseState;
    private String dateOfBirth;
    private String licensePlateNumber;
    private String licensePlateState;
    private String licensePlateYear;
    private String stateOffenseCode;
    private String localOffenseCode;
    private String offenseDescription;
    private String offenseDate;
    private String filingDate;
    private String hearingDate;
    private boolean failedToAppear;
    private BigDecimal fineAmount;
    private BigDecimal feeAmount;
    private BigDecimal amountDue;
    private BigDecimal amountPaid;
    private BigDecimal paymentAmount;
    private String paymentFrequency;
    private String paymentDueDate;
    private String defendantFirstName;
    private String defendantMiddleName;
    private String defendantLastName;
    private String defendantNameSuffix;
    private String defendantAddress1;
    private String defendantAddress2;
    private String defendantCity;
    private String defendantState;
    private String defendantZip;
    private String defendantEmail;
    private String defendantPhone;
    private String defendantPhoneType;
	private String judgeName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCaseUniqueId() {
		return caseUniqueId;
	}

	public void setCaseUniqueId(String caseUniqueId) {
		this.caseUniqueId = caseUniqueId;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getOffenseNumber() {
		return offenseNumber;
	}

	public void setOffenseNumber(String offenseNumber) {
		this.offenseNumber = offenseNumber;
	}

	public String getCourtCode() {
		return courtCode;
	}

	public void setCourtCode(String courtCode) {
		this.courtCode = courtCode;
	}

	public String getCaseStatus() {
		return caseStatus;
	}

	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}

	public String getCaseType() {
		return caseType;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public boolean isAmendedIndicator() {
		return amendedIndicator;
	}

	public void setAmendedIndicator(boolean amendedIndicator) {
		this.amendedIndicator = amendedIndicator;
	}

	public boolean isWarrantOutstanding() {
		return warrantOutstanding;
	}

	public void setWarrantOutstanding(boolean warrantOutstanding) {
		this.warrantOutstanding = warrantOutstanding;
	}

	public String getWarrantType() {
		return warrantType;
	}

	public void setWarrantType(String warrantType) {
		this.warrantType = warrantType;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getTicketingAgencyCode() {
		return ticketingAgencyCode;
	}

	public void setTicketingAgencyCode(String ticketingAgencyCode) {
		this.ticketingAgencyCode = ticketingAgencyCode;
	}

	public String getTicketingAgent() {
		return ticketingAgent;
	}

	public void setTicketingAgent(String ticketingAgent) {
		this.ticketingAgent = ticketingAgent;
	}

	public String getDriversLicenseNumber() {
		return driversLicenseNumber;
	}

	public void setDriversLicenseNumber(String driversLicenseNumber) {
		this.driversLicenseNumber = driversLicenseNumber;
	}

	public String getDriversLicenseState() {
		return driversLicenseState;
	}

	public void setDriversLicenseState(String driversLicenseState) {
		this.driversLicenseState = driversLicenseState;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}

	public String getLicensePlateState() {
		return licensePlateState;
	}

	public void setLicensePlateState(String licensePlateState) {
		this.licensePlateState = licensePlateState;
	}

	public String getLicensePlateYear() {
		return licensePlateYear;
	}

	public void setLicensePlateYear(String licensePlateYear) {
		this.licensePlateYear = licensePlateYear;
	}

	public String getStateOffenseCode() {
		return stateOffenseCode;
	}

	public void setStateOffenseCode(String stateOffenseCode) {
		this.stateOffenseCode = stateOffenseCode;
	}

	public String getLocalOffenseCode() {
		return localOffenseCode;
	}

	public void setLocalOffenseCode(String localOffenseCode) {
		this.localOffenseCode = localOffenseCode;
	}

	public String getOffenseDescription() {
		return offenseDescription;
	}

	public void setOffenseDescription(String offenseDescription) {
		this.offenseDescription = offenseDescription;
	}

	public String getOffenseDate() {
		return offenseDate;
	}

	public void setOffenseDate(String offenseDate) {
		this.offenseDate = offenseDate;
	}

	public String getFilingDate() {
		return filingDate;
	}

	public void setFilingDate(String filingDate) {
		this.filingDate = filingDate;
	}

	public String getHearingDate() {
		return hearingDate;
	}

	public void setHearingDate(String hearingDate) {
		this.hearingDate = hearingDate;
	}

	public BigDecimal getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(BigDecimal fineAmount) {
		this.fineAmount = fineAmount;
	}

	public BigDecimal getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(BigDecimal feeAmount) {
		this.feeAmount = feeAmount;
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

	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(String paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public String getPaymentDueDate() {
		return paymentDueDate;
	}

	public void setPaymentDueDate(String paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}

	public String getDefendantFirstName() {
		return defendantFirstName;
	}

	public void setDefendantFirstName(String defendantFirstName) {
		this.defendantFirstName = defendantFirstName;
	}

	public String getDefendantMiddleName() {
		return defendantMiddleName;
	}

	public void setDefendantMiddleName(String defendantMiddleName) {
		this.defendantMiddleName = defendantMiddleName;
	}

	public String getDefendantLastName() {
		return defendantLastName;
	}

	public void setDefendantLastName(String defendantLastName) {
		this.defendantLastName = defendantLastName;
	}

	public String getDefendantNameSuffix() {
		return defendantNameSuffix;
	}

	public void setDefendantNameSuffix(String defendantNameSuffix) {
		this.defendantNameSuffix = defendantNameSuffix;
	}

	public String getDefendantAddress1() {
		return defendantAddress1;
	}

	public void setDefendantAddress1(String defendantAddress1) {
		this.defendantAddress1 = defendantAddress1;
	}

	public String getDefendantAddress2() {
		return defendantAddress2;
	}

	public void setDefendantAddress2(String defendantAddress2) {
		this.defendantAddress2 = defendantAddress2;
	}

	public String getDefendantCity() {
		return defendantCity;
	}

	public void setDefendantCity(String defendantCity) {
		this.defendantCity = defendantCity;
	}

	public String getDefendantState() {
		return defendantState;
	}

	public void setDefendantState(String defendantState) {
		this.defendantState = defendantState;
	}

	public String getDefendantZip() {
		return defendantZip;
	}

	public void setDefendantZip(String defendantZip) {
		this.defendantZip = defendantZip;
	}

	public String getDefendantEmail() {
		return defendantEmail;
	}

	public void setDefendantEmail(String defendantEmail) {
		this.defendantEmail = defendantEmail;
	}

	public String getDefendantPhone() {
		return defendantPhone;
	}

	public void setDefendantPhone(String defendantPhone) {
		this.defendantPhone = defendantPhone;
	}

	public String getDefendantPhoneType() {
		return defendantPhoneType;
	}

	public void setDefendantPhoneType(String defendantPhoneType) {
		this.defendantPhoneType = defendantPhoneType;
	}

	public boolean getFailedToAppear() {
		return failedToAppear;
	}

	public void setFailedToAppear(boolean failedToAppear) {
		this.failedToAppear = failedToAppear;
	}

	public String getJudgeName() {
		return judgeName;
	}

	public void setJudgeName(String judgeName) {
		this.judgeName = judgeName;
	}
}
