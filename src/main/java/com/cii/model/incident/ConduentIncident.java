package com.cii.model.incident;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.cii.model.incident.Incident;

@Document(collection = "ConduentIncident")
public class ConduentIncident {
	private String id;
	private String caseNumber;
	private String caseNumberSeq;
	private String caseStatus;
	private String caseType;
	private String countyCode;
	private String courtCode;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String phone;
	private boolean isMobilePhone;
	private String email;
	private Date dob;
	private String dln;
	private String dlState;
	private String lpn;
	private String lpState;
	private int lpYear;
	private boolean isCDL;
	private String claim;
	private BigDecimal claimAmount;
	private BigDecimal dueAmount;
	private BigDecimal paidAmount;
	private BigDecimal bailAmount;
	private boolean isAccident;
	private Date caseCloseDate;
	private String caseDisposition;
	private String caseDispositionDesc;
	private Date caseDispositionDate;
	private Date originalOffenseDate;
	private Date offenseDate;
	private int offenseNumber;
	private String offenseDisposition;
	private String judgeName;
	private String officerName;
	private String ticketNumber;
	private boolean isAmendedCharge;
	private String policeAgencyCode;
	private String statute;
	private String localOffenseCode;
	private String localOffenseDesc;
	private String warrantStatus;
	private String warrantType;
	private BigDecimal paymentPlanAmount;
	private String paymentPlanInterval;
	private Date filingDate;
	private Date defermentDate;
	private Date originalHearingDate;
	private String plea;
	private Date hearingDate;
	private String hearingType;
	private Date paymentDueDate;
	private Date appearanceDate;
	private Date arraignmentDate;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String violationCode;
	private String violationDesc;
	private String violationLocation;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getWarrantType() {
		return warrantType;
	}

	public void setWarrantType(String warrantType) {
		this.warrantType = warrantType;
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

	public BigDecimal getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(BigDecimal amountDue) {
		this.dueAmount = amountDue;
	}

	public BigDecimal getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(BigDecimal amountPaid) {
		this.paidAmount = amountPaid;
	}

	public Date getOffenseDate() {
		return offenseDate;
	}

	public void setOffenseDate(Date offenseDate) {
		this.offenseDate = offenseDate;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
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

	public int getLpYear() {
		return lpYear;
	}

	public void setLpYear(int lpYear) {
		this.lpYear = lpYear;
	}

	public String getStatute() {
		return statute;
	}

	public void setStatute(String statute) {
		this.statute = statute;
	}

	public String getWarrantStatus() {
		return warrantStatus;
	}

	public void setWarrantStatus(String warrantStatus) {
		this.warrantStatus = warrantStatus;
	}

	public Date getAppearanceDate() {
		return appearanceDate;
	}

	public void setAppearanceDate(Date appearanceDate) {
		this.appearanceDate = appearanceDate;
	}

	public Date getArraignmentDate() {
		return arraignmentDate;
	}

	public void setArraignmentDate(Date arraignmentDate) {
		this.arraignmentDate = arraignmentDate;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
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

	public String getCaseNumberSeq() {
		return caseNumberSeq;
	}

	public void setCaseNumberSeq(String caseNumberSeq) {
		this.caseNumberSeq = caseNumberSeq;
	}

	public String getCaseDispositionDesc() {
		return caseDispositionDesc;
	}

	public void setCaseDispositionDesc(String caseDispositionDesc) {
		this.caseDispositionDesc = caseDispositionDesc;
	}

	public String getCountyCode() {
		return countyCode;
	}

	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean getIsCDL() {
		return isCDL;
	}

	public void setIsCDL(boolean isCDL) {
		this.isCDL = isCDL;
	}

	public String getClaim() {
		return claim;
	}

	public void setClaim(String claim) {
		this.claim = claim;
	}

	public BigDecimal getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(BigDecimal claimAmount) {
		this.claimAmount = claimAmount;
	}

	public BigDecimal getBailAmount() {
		return bailAmount;
	}

	public void setBailAmount(BigDecimal bailAmount) {
		this.bailAmount = bailAmount;
	}

	public Date getCaseDispositionDate() {
		return caseDispositionDate;
	}

	public void setCaseDispositionDate(Date caseDispositionDate) {
		this.caseDispositionDate = caseDispositionDate;
	}

	public Date getOriginalOffenseDate() {
		return originalOffenseDate;
	}

	public void setOriginalOffenseDate(Date originalOffenseDate) {
		this.originalOffenseDate = originalOffenseDate;
	}

	public String getOffenseDisposition() {
		return offenseDisposition;
	}

	public void setOffenseDisposition(String offenseDisposition) {
		this.offenseDisposition = offenseDisposition;
	}

	public String getJudgeName() {
		return judgeName;
	}

	public void setJudgeName(String judgeName) {
		this.judgeName = judgeName;
	}

	public String getLocalOffenseDesc() {
		return localOffenseDesc;
	}

	public void setLocalOffenseDesc(String localOffenseDesc) {
		this.localOffenseDesc = localOffenseDesc;
	}

	public BigDecimal getPaymentPlanAmount() {
		return paymentPlanAmount;
	}

	public void setPaymentPlanAmount(BigDecimal paymentPlanAmount) {
		this.paymentPlanAmount = paymentPlanAmount;
	}

	public Date getFilingDate() {
		return filingDate;
	}

	public void setFilingDate(Date filingDate) {
		this.filingDate = filingDate;
	}

	public Date getDefermentDate() {
		return defermentDate;
	}

	public void setDefermentDate(Date defermentDate) {
		this.defermentDate = defermentDate;
	}

	public Date getOriginalHearingDate() {
		return originalHearingDate;
	}

	public void setOriginalHearingDate(Date originalHearingDate) {
		this.originalHearingDate = originalHearingDate;
	}

	public Date getHearingDate() {
		return hearingDate;
	}

	public void setHearingDate(Date hearingDate) {
		this.hearingDate = hearingDate;
	}

	public String getHearingType() {
		return hearingType;
	}

	public void setHearingType(String hearingType) {
		this.hearingType = hearingType;
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

	public String getViolationLocation() {
		return violationLocation;
	}

	public void setViolationLocation(String violationLocation) {
		this.violationLocation = violationLocation;
	}
	
	public String getPlea() {
		return plea;
	}

	public void setPlea(String plea) {
		this.plea = plea;
	}
}
