package com.cii.model.incident;

import com.cii.model.negotiation.PartyContainer;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Document
public class Incident {
    String id;
    List<EligibilityStatus> eligibilityStatuses;
    String ineligibilityReason;
    String ineligibilityLongExplanation;

    String courtCode;
    String dlState;
    String dln;
    private String citationNumber;
    String stateId;
    Date dob;
    String lastname;
    String firstname;
    String middlename;
    String nameSuffix;
    String gender;
    String caseStatus;
    String caseNumber;
    String cleanCaseNumber;
    String policeIncidentNumber;
    String status;
    Date statusDate;
    String sosCodeDesc;
    Date filingDate;
    private String amountDue;
    private String amountPaid;
    BigDecimal amountOrdered;
    BigDecimal sweepAmount;
    BigDecimal totalDue;
    private Date dueDate;
    private Date otherDate;
    int filingYear;
    String policeAgency;
    String type;
    String petitionNumber;
    boolean warrantOutstanding;
    String warrantType;
    String sosCode;
    String paccCode;
    String localOffenseCode;
    String localOffenseDesc;
    String paccCodeDesc;
    String citationType;
    boolean hasAttorney;
    boolean isAccident;
    private boolean update;
    private List<String> companionCases;
    Date closed;
    String offenseDesc;
    String dispositionCode;
    Date dispositionDate;
    Date reopenedDate;
    String caseSuffix;
    String countyCode;
    String courtSystemCodeType;
    String idCodeLoc;
    String judgeBarNumber;
    String judge;
    String offenseDispositionCode;
    Date offenseDispositionDate;
    Date arraignDate;
    int offenseNumber;
    int offenseNumberSeq;
    boolean isAmended;
    String partyNumber;
    String partyType;
    String prosecutorsBarNumber;
    String caseType;
    String caseSubType;
    int points = -1;
    String ssn;

    // Grand Rapids (61st) Prewarrant common attributes
    String address;
    String city;
    String state;
    String zip;
    String phone;
    boolean isMobile;
    String email;
    String caseTypeDesc;
    Date hearingDate;
    Date originalHearingDate;
    Date originalOffenseDate;
    String statute;
    String charge;
    int chargeSequence;
    Date expirationDate;

    // Parking additional attributes
    String licensePlate;
    String licensePlateState;
    int licensePlateYear;

    Date ticketDate;
    String ticketNumber;
    String violationLocation;
    String ticketingAgency;

    String officer;
    String complaintNumber; // complaintNumber used in AZPARKING 

    // Mediation Core and Family attributes
    String petitioner;
    String respondent;
    String mediator;
    String atlasNumber;
    String mediationType;
    String mediationCenter;
    String referralSource;
    String division;
    String hearingType;
    boolean isIVD;
    private boolean isCDL;
    String party1Attorney;
    String party2Attorney;
    String firstCourtDate;
    String attorneyName;
    String payment;
    String arrearage;
    String maintenance;
    String totalMonthly;
    String IVDNumber;
    String principalClaimAmount;
    private String accidentType;

    private List<Incident> subCases;
    private List<PartyContainer> partyList;
    private Map<String, Object> other;

    private String finePayee;

    private String citedSpeed;
    private String postedSpeed;
    private boolean accident;
    private boolean activeWarrant;
    private Date startDate;
    private boolean pastDue;
    private boolean licenseHold;
    private boolean safety;
    private boolean constructionZone;
    private boolean trafficSchoolEligible;
    private boolean failedToAppear;
    Boolean relatedCase;

    // NCourtCase Attributes
    String stateOffenseCode;
    BigDecimal fineAmount;
    BigDecimal feeAmount;
    BigDecimal paymentAmount;
    String paymentFrequency;
    Date paymentDueDate;
    String address2;
    String phoneType;
    String ticketingAgent;
    String caseUniqueId;

    List<String> relatedCases;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOffenseDesc(String offenseDesc) {
        this.offenseDesc = offenseDesc;
    }

    public String getOffenseDesc() {
        return offenseDesc;
    }

    public String getDln() {
        return dln;
    }

    public void setDln(String dln) {
        this.dln = dln;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getCaseSubType() {
        return caseSubType;
    }

    public void setCaseSubType(String caseSubType) {
        this.caseSubType = caseSubType;
    }

    public List<EligibilityStatus> getEligibilityStatuses() {
        return eligibilityStatuses;
    }

    public void setEligibilityStatuses(List<EligibilityStatus> eligibilityStatuses) {
        this.eligibilityStatuses = eligibilityStatuses;
    }

    public String getIneligibilityReason() {
        return ineligibilityReason;
    }

    public void setIneligibilityReason(String reason) {
        this.ineligibilityReason = reason;
    }

    public void setIneligibilityLongExplanation(String explanation) {
        this.ineligibilityLongExplanation = explanation;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getCaseSuffix() {
        return caseSuffix;
    }

    public void setCaseSuffix(String caseSuffix) {
        this.caseSuffix = caseSuffix;
    }

    public String getSosCode() {
        return sosCode;
    }

    public void setSosCode(String sOSCode) {
        this.sosCode = sOSCode;
    }

    public void setIVDNumber(String IVDNumber) {
        this.IVDNumber = IVDNumber;
    }

    public String getIVDNumber() {
        return IVDNumber;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public String getPoliceIncidentNumber() {
        return policeIncidentNumber;
    }

    public void setPoliceIncidentNumber(String policeIncidentNumber) {
        this.policeIncidentNumber = policeIncidentNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public String getSosCodeDesc() {
        return sosCodeDesc;
    }

    public void setSosCodeDesc(String sOSCodeDesc) {
        this.sosCodeDesc = sOSCodeDesc;
    }

    public Date getFilingDate() {
        return filingDate;
    }

    public void setFilingDate(Date filingDate) {
        this.filingDate = filingDate;
    }


    public BigDecimal getAmountOrdered() {
        return amountOrdered;
    }

    public void setAmountOrdered(BigDecimal amountOrdered) {
        this.amountOrdered = amountOrdered;
    }

    public int getFilingYear() {
        return filingYear;
    }

    public void setFilingYear(int filingYear) {
        this.filingYear = filingYear;
    }

    public String getPoliceAgency() {
        return policeAgency;
    }

    public void setPoliceAgency(String policeAgency) {
        this.policeAgency = policeAgency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getWarrantOutstanding() {
        return warrantOutstanding;
    }

    public void setWarrantOutstanding(boolean warrantOutstanding) {
        this.warrantOutstanding = warrantOutstanding;
    }

    public String getPaccCode() {
        return paccCode;
    }

    public void setPaccCode(String paccCode) {
        this.paccCode = paccCode;
    }

    public String getLocalOffenseCode() {
        return localOffenseCode;
    }

    public void setLocalOffenseCode(String localOffenseCode) {
        this.localOffenseCode = localOffenseCode;
    }

    public String getLocalOffenseDesc() {
        return localOffenseDesc;
    }

    public void setLocalOffenseDesc(String desc) {
        this.localOffenseDesc = desc;
    }

    public String getPaccCodeDesc() {
        return paccCodeDesc;
    }

    public void setPaccCodeDesc(String desc) {
        this.paccCodeDesc = desc;
    }

    public Date getClosed() {
        return closed;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }

    public String getDispositionCode() {
        return dispositionCode;
    }

    public void setDispositionCode(String dispositionCode) {
        this.dispositionCode = dispositionCode;
    }

    public Date getDispositionDate() {
        return dispositionDate;
    }

    public void setDispositionDate(Date dispositionDate) {
        this.dispositionDate = dispositionDate;
    }

    public Date getReopenedDate() {
        return reopenedDate;
    }

    public void setReopenedDate(Date reopenedDate) {
        this.reopenedDate = reopenedDate;
    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String suffix) {
        this.nameSuffix = suffix;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCourtSystemCodeType() {
        return courtSystemCodeType;
    }

    public void setCourtSystemCodeType(String courtSystemCodeType) {
        this.courtSystemCodeType = courtSystemCodeType;
    }

    public String getIdCodeLoc() {
        return idCodeLoc;
    }

    public void setIdCodeLoc(String idCodeLoc) {
        this.idCodeLoc = idCodeLoc;
    }

    public String getJudgeBarNumber() {
        return judgeBarNumber;
    }

    public void setJudgeBarNumber(String judgeBarNumber) {
        this.judgeBarNumber = judgeBarNumber;
    }

    public String getJudge() {
        return judge;
    }

    public void setJudge(String judgeName) {
        this.judge = judgeName;
    }

    public String getOffenseDispositionCode() {
        return offenseDispositionCode;
    }

    public void setOffenseDispositionCode(String offenseDispositionCode) {
        this.offenseDispositionCode = offenseDispositionCode;
    }

    public Date getOffenseDispositionDate() {
        return offenseDispositionDate;
    }

    public void setOffenseDispositionDate(Date offenseDispositionDate) {
        this.offenseDispositionDate = offenseDispositionDate;
    }

    public int getOffenseNumber() {
        return offenseNumber;
    }

    public void setOffenseNumber(int offenseNumber) {
        this.offenseNumber = offenseNumber;
    }

    public int getOffenseNumberSeq() {
        return offenseNumberSeq;
    }

    public void setOffenseNumberSeq(int offenseNumberSeq) {
        this.offenseNumberSeq = offenseNumberSeq;
    }

    public boolean getIsAmendedCharge() {
        return isAmended;
    }

    public void setIsAmendedCharge(boolean isAmended) {
        this.isAmended = isAmended;
    }

    public String getPartyNumber() {
        return partyNumber;
    }

    public void setPartyNumber(String partyNumber) {
        this.partyNumber = partyNumber;
    }

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    public String getProsecutorsBarNumber() {
        return prosecutorsBarNumber;
    }

    public void setProsecutorsBarNumber(String prosecutorsBarNumber) {
        this.prosecutorsBarNumber = prosecutorsBarNumber;
    }

    public BigDecimal getSweepAmount() {
        return sweepAmount;
    }

    public void setSweepAmount(BigDecimal sweepAmount) {
        this.sweepAmount = sweepAmount;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPetitionNumber() {
        return petitionNumber;
    }

    public void setPetitionNumber(String petitionNumber) {
        this.petitionNumber = petitionNumber;
    }

    public String getComplaintNumber() {
        return complaintNumber;
    }

    public void setComplaintNumber(String complaintNumber) {
        this.complaintNumber = complaintNumber;
    }

    // Getters and Setters for Grand Rapids (61st) Prewarrant attributes

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

    public Date getOriginalOffenseDate() {
        return originalOffenseDate;
    }

    public void setOriginalOffenseDate(Date originalOffenseDate) {
        this.originalOffenseDate = originalOffenseDate;
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

    public int getChargeSequence() {
        return chargeSequence;
    }

    public void setChargeSequence(int chargeSequence) {
        this.chargeSequence = chargeSequence;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
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

    public void setLicensePlateState(String licensePlateState) {
        this.licensePlateState = licensePlateState;
    }

    public int getLicensePlateYear() {
        return licensePlateYear;
    }

    public void setLicensePlateYear(int licensePlateYear) {
        this.licensePlateYear = licensePlateYear;
    }

    public Date getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(Date ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getViolationLocation() {
        return violationLocation;
    }

    public void setViolationLocation(String violationLocation) {
        this.violationLocation = violationLocation;
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

    public Date getArraignDate() {
        return arraignDate;
    }

    public void setArraignDate(Date arraignDate) {
        this.arraignDate = arraignDate;
    }

    public List<Incident> getSubCases() {
        return subCases;
    }

    public void setSubCases(List<Incident> subCases) {
        this.subCases = subCases;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String sid) {
        this.stateId = sid;
    }

    public BigDecimal getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(BigDecimal totalDue) {
        this.totalDue = totalDue;
    }

    public String getCitationType() {
        return citationType;
    }

    public void setCitationType(String citationType) {
        this.citationType = citationType;
    }

    public boolean getHasAttorney() {
        return hasAttorney;
    }

    public void setHasAttorney(boolean hasAttorney) {
        this.hasAttorney = hasAttorney;
    }

    public String getWarrantType() {
        return warrantType;
    }

    public void setWarrantType(String warrantType) {
        this.warrantType = warrantType;
    }

    public Date getHearingDate() {
        return hearingDate;
    }

    public void setHearingDate(Date hearingDate) {
        this.hearingDate = hearingDate;
    }

    public boolean getIsAccident() {
        return isAccident;
    }

    public void setIsAccident(boolean isAccident) {
        this.isAccident = isAccident;
    }

    public boolean getIsMobile() {
        return isMobile;
    }

    public void setIsMobile(boolean isMobile) {
        this.isMobile = isMobile;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getPetitioner() {
        return petitioner;
    }

    public void setPetitioner(String petitioner) {
        this.petitioner = petitioner;
    }

    public String getRespondent() {
        return respondent;
    }

    public void setRespondent(String respondent) {
        this.respondent = respondent;
    }

    public String getMediator() {
        return mediator;
    }

    public void setMediator(String mediator) {
        this.mediator = mediator;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getHearingType() {
        return hearingType;
    }

    public void setHearingType(String hearingType) {
        this.hearingType = hearingType;
    }

    public String getAtlasNumber() {
        return atlasNumber;
    }

    public void setAtlasNumber(String atlasNumber) {
        this.atlasNumber = atlasNumber;
    }

    public String getMediationType() {
        return mediationType;
    }

    public void setMediationType(String mediationType) {
        this.mediationType = mediationType;
    }

    public String getReferralSource() {
        return referralSource;
    }

    public void setReferralSource(String referralSource) {
        this.referralSource = referralSource;
    }

    public boolean getIsIVD() {
        return isIVD;
    }

    public void setIsIVD(boolean isIVD) {
        this.isIVD = isIVD;
    }

    public String getParty1Attorney() {
        return party1Attorney;
    }

    public void setParty1Attorney(String party1Attorney) {
        this.party1Attorney = party1Attorney;
    }

    public String getParty2Attorney() {
        return party2Attorney;
    }

    public void setParty2Attorney(String party2Attorney) {
        this.party2Attorney = party2Attorney;
    }

    public String getFirstCourtDate() {
        return firstCourtDate;
    }

    public void setFirstCourtDate(String firstCourtDate) {
        this.firstCourtDate = firstCourtDate;
    }

    public String getAttorneyName() {
        return attorneyName;
    }

    public void setAttorneyName(String attorneyName) {
        this.attorneyName = attorneyName;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getArrearage() {
        return arrearage;
    }

    public void setArrearage(String arrearage) {
        this.arrearage = arrearage;
    }

    public String getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public String getTotalMonthly() {
        return totalMonthly;
    }

    public void setTotalMonthly(String totalMonthly) {
        this.totalMonthly = totalMonthly;
    }

    public Map<String, Object> getOther() {
        return other;
    }

    public void setOther(Map<String, Object> other) {
        this.other = other;
    }

    public Object get(String key) {
        if (other == null) {
            other = new HashMap<String, Object>();
        }
        return other.get(key);
    }

    public void set(String key, Object value) {
        if (other == null) {
            other = new HashMap<String, Object>();
        }
        other.put(key, value);
    }

    public String getMediationCenter() {
        return mediationCenter;
    }

    public void setMediationCenter(String mediationCenter) {
        this.mediationCenter = mediationCenter;
    }

    public List<PartyContainer> getPartyList() { return this.partyList; }

    public void setPartyList(List<PartyContainer> partyList) { this.partyList = partyList; }

    public boolean isCDL() {
        return isCDL;
    }

    public void setCDL(boolean CDL) {
        isCDL = CDL;
    }

    public String getAccidentType() {
        return accidentType;
    }

    public void setAccidentType(String accidentType) {
        this.accidentType = accidentType;
    }

    public String getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(String amountDue) {
        this.amountDue = amountDue;
    }

    public String getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(String amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getFinePayee() {
        return finePayee;
    }

    public void setFinePayee(String finePayee) {
        this.finePayee = finePayee;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getOtherDate() {
        return otherDate;
    }

    public void setOtherDate(Date otherDate) {
        this.otherDate = otherDate;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public String getCitationNumber() {
        return citationNumber;
    }

    public void setCitationNumber(String citationNumber) {
        this.citationNumber = citationNumber;
    }

    public String getCitedSpeed() {
        return citedSpeed;
    }

    public void setCitedSpeed(String citedSpeed) {
        this.citedSpeed = citedSpeed;
    }

    public String getPostedSpeed() {
        return postedSpeed;
    }

    public void setPostedSpeed(String postedSpeed) {
        this.postedSpeed = postedSpeed;
    }

    public boolean isAccident() {
        return accident;
    }

    public void setAccident(boolean accident) {
        this.accident = accident;
    }

    public boolean isActiveWarrant() {
        return activeWarrant;
    }

    public void setActiveWarrant(boolean activeWarrant) {
        this.activeWarrant = activeWarrant;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean isPastDue() {
        return pastDue;
    }

    public void setPastDue(boolean pastDue) {
        this.pastDue = pastDue;
    }

    public boolean isLicenseHold() {
        return licenseHold;
    }

    public void setLicenseHold(boolean licenseHold) {
        this.licenseHold = licenseHold;
    }

    public boolean isSafety() {
        return safety;
    }

    public void setSafety(boolean safety) {
        this.safety = safety;
    }

    public boolean isConstructionZone() {
        return constructionZone;
    }

    public void setConstructionZone(boolean constructionZone) {
        this.constructionZone = constructionZone;
    }

    public boolean isTrafficSchoolEligible() {
        return trafficSchoolEligible;
    }

    public void setTrafficSchoolEligible(boolean trafficSchoolEligible) {
        this.trafficSchoolEligible = trafficSchoolEligible;
    }

    public boolean isFailedToAppear() {
        return failedToAppear;
    }

    public void setFailedToAppear(boolean failedToAppear) {
        this.failedToAppear = failedToAppear;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getStateOffenseCode() {
        return stateOffenseCode;
    }

    public void setStateOffenseCode(String stateOffenseCode) {
        this.stateOffenseCode = stateOffenseCode;
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

    public Date getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setPaymentDueDate(Date paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getTicketingAgent() {
        return ticketingAgent;
    }

    public void setTicketingAgent(String ticketingAgent) {
        this.ticketingAgent = ticketingAgent;
    }

    public String getCaseUniqueId() {
        return caseUniqueId;
    }

    public void setCaseUniqueId(String caseUniqueId) {
        this.caseUniqueId = caseUniqueId;
    }

    public List<String> getCompanionCases() {
        return companionCases;
    }

    public void setCompanionCases(List<String> companionCases) {
        this.companionCases = companionCases;
    }

    public Boolean isRelatedCase() {
        return relatedCase;
    }

    public void setRelatedCase(Boolean relatedCase) {
        this.relatedCase = relatedCase;
    }

    public List<String> getRelatedCases() {
        return relatedCases;
    }

    public void setRelatedCases(List<String> relatedCases) {
        this.relatedCases = relatedCases;
    }

    public String getPrincipalClaimAmount() {
        return principalClaimAmount;
    }

    public void setPrincipalClaimAmount(String principalClaimAmount) {
        this.principalClaimAmount = principalClaimAmount;
    }
}
