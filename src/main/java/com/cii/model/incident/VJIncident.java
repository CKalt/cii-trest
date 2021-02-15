package com.cii.model.incident;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.cii.model.incident.Incident;

@Document(collection = "VJIncident")
public class VJIncident {
	private String id;
	private String caseNumber;
	private String caseStatus;
	private String caseType;
	private String courtCode;
	private String firstName;
	private String middleName;
	private String lastName;
	private String nameSuffix;
	private String phone;
	private boolean isMobilePhone;
	private String email;
	private Date dob;
	private String dln;
	private String dlState;
	private BigDecimal amountDue;
	private BigDecimal amountPaid;
	private boolean isAccident;
	private Date caseCloseDate;
	private String caseDisposition;
	private Date caseDispositionDate;
	private String offenseDisposition;
	private Date offenseDate;
	private int offenseNumber;
	private String officerName;
	private String citationNumber;
	private boolean onlineSystemUseIndicator;
	private boolean isAmendedCharge;
	private String policeAgencyCode;
	private String stateOffenseCode;
	private String stateOffenseDescription;
	private String localOffenseCode;
	private boolean hasActiveWarrant;
	private String warrantType;
	private Date firstPaymentDate;
	private BigDecimal firstPaymentAmount;
	private Date lastPaymentDate;
	private BigDecimal lastPaymentAmount;
	private BigDecimal lateFee;
	private String paymentPlanInterval;
	private Date paymentDueDate;
	private Date paymentPlanStartDate;
	private BigDecimal paymentPlanAmount;
	private BigDecimal originalFineAmount;
	private BigDecimal suspensionFee;
	private BigDecimal warrantFee;
	private Date defaultJudgementDate;
	private Date ticketCaseDefaultDate;
	private Date warrantIssueDate;
	private Date warrantRecallDate;
	private String chargeId;
	private String interfaceStatus;
	private Date interfaceReceiveTime;
	private Date interfaceDropDate;
	private String offensePlea;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNameSuffix() {
		return nameSuffix;
	}

	public void setNameSuffix(String nameSuffix) {
		this.nameSuffix = nameSuffix;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean getIsMobilePhone() {
		return isMobilePhone;
	}

	public void setIsMobilePhone(boolean isMobilePhone) {
		this.isMobilePhone = isMobilePhone;
	}

	public boolean getIsAccident() {
		return isAccident;
	}

	public void setIsAccident(boolean isAccident) {
		this.isAccident = isAccident;
	}

	public Date getCaseCloseDate() {
		return caseCloseDate;
	}

	public void setCaseCloseDate(Date caseCloseDate) {
		this.caseCloseDate = caseCloseDate;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getCaseDisposition() {
		return caseDisposition;
	}

	public void setCaseDisposition(String caseDisposition) {
		this.caseDisposition = caseDisposition;
	}

	public String getOffenseDisposition() {
		return offenseDisposition;
	}

	public void setOffenseDisposition(String offenseDisposition) {
		this.offenseDisposition = offenseDisposition;
	}

	public int getOffenseNumber() {
		return offenseNumber;
	}

	public void setOffenseNumber(int offenseNumber) {
		this.offenseNumber = offenseNumber;
	}

	public String getOfficerName() {
		return officerName;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	public boolean getOnlineSystemUseIndicator() {
		return onlineSystemUseIndicator;
	}

	public void setOnlineSystemUseIndicator(boolean onlineSystemUseIndicator) {
		this.onlineSystemUseIndicator = onlineSystemUseIndicator;
	}

	public boolean getIsAmendedCharge() {
		return isAmendedCharge;
	}

	public void setIsAmendedCharge(boolean isAmendedCharge) {
		this.isAmendedCharge = isAmendedCharge;
	}

	public String getPoliceAgencyCode() {
		return policeAgencyCode;
	}

	public void setPoliceAgencyCode(String policeAgencyCode) {
		this.policeAgencyCode = policeAgencyCode;
	}

	public String getStateOffenseCode() {
		return stateOffenseCode;
	}

	public void setStateOffenseCode(String stateOffenseCode) {
		this.stateOffenseCode = stateOffenseCode;
	}

	public String getStateOffenseDescription() {
		return stateOffenseDescription;
	}

	public void setStateOffenseDescription(String stateOffenseDescription) {
		this.stateOffenseDescription = stateOffenseDescription;
	}

	public boolean getHasActiveWarrant() {
		return hasActiveWarrant;
	}

	public void setHasActiveWarrant(boolean hasActiveWarrant) {
		this.hasActiveWarrant = hasActiveWarrant;
	}

	public String getWarrantType() {
		return warrantType;
	}

	public void setWarrantType(String warrantType) {
		this.warrantType = warrantType;
	}

	public Date getFirstPaymentDate() {
		return firstPaymentDate;
	}

	public void setFirstPaymentDate(Date firstPaymentDate) {
		this.firstPaymentDate = firstPaymentDate;
	}

	public BigDecimal getFirstPaymentAmount() {
		return firstPaymentAmount;
	}

	public void setFirstPaymentAmount(BigDecimal firstPaymentAmount) {
		this.firstPaymentAmount = firstPaymentAmount;
	}

	public Date getLastPaymentDate() {
		return lastPaymentDate;
	}

	public void setLastPaymentDate(Date lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

	public BigDecimal getLastPaymentAmount() {
		return lastPaymentAmount;
	}

	public void setLastPaymentAmount(BigDecimal lastPaymentAmount) {
		this.lastPaymentAmount = lastPaymentAmount;
	}

	public BigDecimal getLateFee() {
		return lateFee;
	}

	public void setLateFee(BigDecimal lateFee) {
		this.lateFee = lateFee;
	}

	public String getPaymentPlanInterval() {
		return paymentPlanInterval;
	}

	public void setPaymentPlanInterval(String paymentPlanInterval) {
		this.paymentPlanInterval = paymentPlanInterval;
	}

	public Date getPaymentDueDate() {
		return paymentDueDate;
	}

	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}

	public Date getPaymentPlanStartDate() {
		return paymentPlanStartDate;
	}

	public void setPaymentPlanStartDate(Date paymentPlanStartDate) {
		this.paymentPlanStartDate = paymentPlanStartDate;
	}

	public BigDecimal getPaymentPlanAmount() {
		return paymentPlanAmount;
	}

	public void setPaymentPlanAmount(BigDecimal paymentPlanAmount) {
		this.paymentPlanAmount = paymentPlanAmount;
	}

	public BigDecimal getOriginalFineAmount() {
		return originalFineAmount;
	}

	public void setOriginalFineAmount(BigDecimal originalFineAmount) {
		this.originalFineAmount = originalFineAmount;
	}

	public BigDecimal getSuspensionFee() {
		return suspensionFee;
	}

	public void setSuspensionFee(BigDecimal suspensionFee) {
		this.suspensionFee = suspensionFee;
	}

	public BigDecimal getWarrantFee() {
		return warrantFee;
	}

	public void setWarrantFee(BigDecimal warrantFee) {
		this.warrantFee = warrantFee;
	}

	public Date getDefaultJudgementDate() {
		return defaultJudgementDate;
	}

	public void setDefaultJudgementDate(Date defaultJudgementDate) {
		this.defaultJudgementDate = defaultJudgementDate;
	}

	public Date getTicketCaseDefaultDate() {
		return ticketCaseDefaultDate;
	}

	public void setTicketCaseDefaultDate(Date ticketCaseDefaultDate) {
		this.ticketCaseDefaultDate = ticketCaseDefaultDate;
	}

	public Date getWarrantIssueDate() {
		return warrantIssueDate;
	}

	public void setWarrantIssueDate(Date warrantIssueDate) {
		this.warrantIssueDate = warrantIssueDate;
	}

	public Date getWarrantRecallDate() {
		return warrantRecallDate;
	}

	public void setWarrantRecallDate(Date warrantRecallDate) {
		this.warrantRecallDate = warrantRecallDate;
	}

	public String getChargeId() {
		return chargeId;
	}

	public void setChargeId(String chargeId) {
		this.chargeId = chargeId;
	}

	public String getInterfaceStatus() {
		return interfaceStatus;
	}

	public void setInterfaceStatus(String interfaceStatus) {
		this.interfaceStatus = interfaceStatus;
	}

	public Date getInterfaceReceiveTime() {
		return interfaceReceiveTime;
	}

	public void setInterfaceReceiveTime(Date interfaceReceiveTime) {
		this.interfaceReceiveTime = interfaceReceiveTime;
	}

	public Date getInterfaceDropDate() {
		return interfaceDropDate;
	}

	public void setInterfaceDropDate(Date interfaceDropDate) {
		this.interfaceDropDate = interfaceDropDate;
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

	public String getCourtCode() {
		return courtCode;
	}

	public void setCourtCode(String courtCode) {
		this.courtCode = courtCode;
	}

	public String getLocalOffenseCode() {
		return localOffenseCode;
	}

	public void setLocalOffenseCode(String localOffenseCode) {
		this.localOffenseCode = localOffenseCode;
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

	public Date getOffenseDate() {
		return offenseDate;
	}

	public void setOffenseDate(Date offenseDate) {
		this.offenseDate = offenseDate;
	}

	public String getCitationNumber() {
		return citationNumber;
	}

	public void setCitationNumber(String citationNumber) {
		this.citationNumber = citationNumber;
	}

	public String getOffensePlea() {
		return offensePlea;
	}

	public void setOffensePlea(String offensePlea) {
		this.offensePlea = offensePlea;
	}
}
