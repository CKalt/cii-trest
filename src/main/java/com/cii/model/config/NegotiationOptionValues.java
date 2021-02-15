package com.cii.model.config;

import com.cii.model.courtcase.FileInformation;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class NegotiationOptionValues {
    protected Integer selectedOffer;
    protected String offerDescription;
    protected BigDecimal offerFine;
    protected Integer offerPoints;
    protected String offerStateCode;
    protected String offerLocalCode;
    protected String offerCaption;
    protected String offerFineString;

    protected Boolean trafficSchool;

    protected Integer dwlsSelectedOffer;
    protected String dwlsOfferDescription;
    protected Integer dwlsOfferPoints;
    protected BigDecimal dwlsFineFrom;
    protected BigDecimal dwlsFineTo;
    protected String dwlsOfferCaption;
    protected String dwlsFineFromString;
    protected String dwlsFineToString;

    protected Boolean acknowledged;
    protected Boolean acknowledged1;
    protected Boolean acknowledged2;
    protected Boolean acknowledged3;
    protected Boolean acknowledged4;
    protected Boolean acknowledged5;
    protected Boolean acknowledged6;
    protected Boolean acknowledged7;
    protected Boolean acknowledged8;
    protected Boolean acknowledged9;
    protected Boolean acknowledged10;
    protected Boolean acknowledged11;
    protected Boolean acknowledged12;
    protected Boolean acknowledged13;
    protected Boolean acknowledged14;

    protected Map<Integer, Map<Integer, Boolean>> multiAck;

    protected String dueDateString;
    protected String dueDaysString;
    protected Date dueDate;
    protected List<String> otherDateString;
    protected List<String> otherDaysString;
    protected List<String> otherText;

    protected String status;
    protected Boolean paid;
    protected Boolean expired;
    protected Boolean cancelled;

    protected String bondAmountString;
    protected String bondLabel;
    protected BigDecimal bondAmount;

    protected String paymentAmountString;
    protected BigDecimal paymentAmount;
    protected String downPaymentAmountString;
    protected BigDecimal downPaymentAmount;
    protected String firstPaymentDateString;
    protected Date firstPaymentDate;
    protected String paymentFrequency;

    protected String appearanceDateString;
    protected Date appearanceDate;
    protected String appearanceTimeString;
    protected String appearanceTimeAmPmString;
    protected String judge;

    protected String cancelReason;
    protected String comment;
    protected String comment1;
    protected String comment2;
    protected String comment3;
    protected String comment4;
    protected String comment5;

    protected String pretrialDateString;
    protected String pretrialTimeString;
    protected String pretrialTimeAmPmString;
    protected Date pretrialDate;

    protected String dln;
    protected String dlState;

    protected Map<String, Object> options;


    private List<FileInformation> fileInformationList;
    private boolean hasFileToUpload;

    private String status1;
    private String status2;
    private String status3;
    private String status4;
    private String status5;
    private String status6;
    private String status7;

    private String description1;
    private String description2;
    private String description3;
    private String description4;
    private String description5;
    private String description6;
    private String description7;
    private String description8;
    private String description9;
    private String description10;
    private String description11;
    private String description12;
    private String description13;
    private String description14;
    private String description15;

    private String statute1;
    private String statute2;
    private String statute3;
    private String statute4;
    private String statute5;
    private String statute6;
    private String statute7;
    private String statute8;
    private String statute9;
    private String statute10;
    private String statute11;
    private String statute12;
    private String statute13;
    private String statute14;
    private String statute15;

    private Boolean trafficSchool1;
    private Boolean trafficSchool2;
    private Boolean trafficSchool3;
    private Boolean trafficSchool4;
    private Boolean trafficSchool5;
    private Boolean trafficSchool6;
    private Boolean trafficSchool7;
    private Boolean trafficSchool8;
    private Boolean trafficSchool9;
    private Boolean trafficSchool10;
    private Boolean trafficSchool11;
    private Boolean trafficSchool12;
    private Boolean trafficSchool13;
    private Boolean trafficSchool14;
    private Boolean trafficSchool15;

    private boolean extraFee;
    private String extraFeeAmount;

    private int points1;
    private int points2;
    private int points3;
    private int points4;
    private int points5;
    private int points6;
    private int points7;
    private int points8;
    private int points9;
    private int points10;
    private int points11;
    private int points12;
    private int points13;
    private int points14;
    private int points15;

    private String offer1;
    private String offer2;
    private String offer3;
    private String offer4;
    private String offer5;
    private String offer6;
    private String offer7;
    private String offer8;
    private String offer9;
    private String offer10;
    private String offer11;
    private String offer12;
    private String offer13;
    private String offer14;
    private String offer15;

    private String customDropdown1;
    private String customDropdown2;
    private String customDropdown3;
    private String customDropdown4;
    private String customDropdown5;
    private String customDropdown6;
    private String customDropdown7;
    private String customDropdown8;
    private String customDropdown9;
    private String customDropdown10;
    private String customDropdown11;
    private String customDropdown12;
    private String customDropdown13;
    private String customDropdown14;
    private String customDropdown15;

    private String customNumberInput1;
    private String customNumberInput2;
    private String customNumberInput3;
    private String customNumberInput4;
    private String customNumberInput5;
    private String customNumberInput6;
    private String customNumberInput7;
    private String customNumberInput8;
    private String customNumberInput9;
    private String customNumberInput10;
    private String customNumberInput11;
    private String customNumberInput12;
    private String customNumberInput13;
    private String customNumberInput14;
    private String customNumberInput15;

    private Boolean completedForm;
    private Boolean completedForm1;
    private Boolean completedForm2;
    private Boolean completedForm3;
    private Boolean completedForm4;
    private Boolean completedForm5;
    private Boolean completedForm6;
    private Boolean completedForm7;
    private Boolean completedForm8;
    private Boolean completedForm9;

    private String signatureSvg0;
    private String signatureSvg1;
    private String signatureSvg2;
    private String signatureSvg3;
    private String signatureSvg4;
    private String signatureSvg5;
    private String signatureSvg6;
    private String signatureSvg7;
    private String signatureSvg8;
    private String signatureSvg9;
    private String signatureSvg10;
    private String signatureSvg11;
    private String signatureSvg12;

    private String signatureName0;
    private String signatureName1;
    private String signatureName2;
    private String signatureName3;
    private String signatureName4;
    private String signatureName5;
    private String signatureName6;
    private String signatureName7;
    private String signatureName8;
    private String signatureName9;
    private String signatureName10;
    private String signatureName11;
    private String signatureName12;

    private String caseNumber;
    private String dateOfBirthString;
    private Date dateOfBirth;

    private String communityServiceDaysString;
    private Integer communityServiceDays;
    private Boolean communityServiceOptionSelected;
    private Boolean fineOptionSelected;
    private String paymentTypeOption;
    private String paymentPlanTotalFineString;
    private BigDecimal paymentPlanTotalFine;

    private List<String> selection;

    //FL11JC
    private Boolean dismissalFormFinalized;
    private Boolean dismissalFiled;
    private String dismissalForm;
    private boolean csvExported;
    private boolean hasDismissedSubcase;

    public String getAppearanceTimeAmPmString() {
        return appearanceTimeAmPmString;
    }

    public void setAppearanceTimeAmPmString(String amPmString) {
        this.appearanceTimeAmPmString = amPmString;
    }

    public String getPretrialTimeString() {
        return pretrialTimeString;
    }

    public void setPretrialTimeString(String pretrialTimeString) {
        this.pretrialTimeString = pretrialTimeString;
    }

    public String getPretrialTimeAmPmString() {
        return pretrialTimeAmPmString;
    }

    public void setPretrialTimeAmPmString(String pretrialTimeAmPmString) {
        this.pretrialTimeAmPmString = pretrialTimeAmPmString;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }


    public Boolean getDismissalFormFinalized() {
        return dismissalFormFinalized;
    }

    public void setDismissalFormFinalized(Boolean dismissalFormFinalized) {
        this.dismissalFormFinalized = dismissalFormFinalized;
    }

    public Boolean getDismissalFiled() {
        return dismissalFiled;
    }

    public void setDismissalFiled(Boolean dismissalFiled) {
        this.dismissalFiled = dismissalFiled;
    }

    public Integer getSelectedOffer() {
        return selectedOffer;
    }

    public void setSelectedOffer(Integer offer) {
        this.selectedOffer = offer;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public BigDecimal getOfferFine() {
        return offerFine;
    }

    public void setOfferFine(BigDecimal offerFine) {
        this.offerFine = offerFine;
    }

    public String getOfferFineString() {
        return offerFineString;
    }

    public void setOfferFineString(String fineString) {
        this.offerFineString = fineString;
    }

    public Integer getOfferPoints() {
        return offerPoints;
    }

    public void setOfferPoints(Integer offerPoints) {
        this.offerPoints = offerPoints;
    }

    public String getOfferStateCode() {
        return offerStateCode;
    }

    public void setOfferStateCode(String offerStateCode) {
        this.offerStateCode = offerStateCode;
    }

    public String getOfferLocalCode() {
        return offerLocalCode;
    }

    public void setOfferLocalCode(String offerLocalCode) {
        this.offerLocalCode = offerLocalCode;
    }

    public String getOfferCaption() {
        return offerCaption;
    }

    public void setOfferCaption(String offerCaption) {
        this.offerCaption = offerCaption;
    }

    // DWLS

    public Integer getDwlsSelectedOffer() {
        return dwlsSelectedOffer;
    }

    public void setDwlsSelectedOffer(Integer offer) {
        this.dwlsSelectedOffer = offer;
    }

    public String getDwlsOfferDescription() {
        return dwlsOfferDescription;
    }

    public void setDwlsOfferDescription(String offerDescription) {
        this.dwlsOfferDescription = offerDescription;
    }

    public String getDwlsOfferCaption() {
        return dwlsOfferCaption;
    }

    public void setDwlsOfferCaption(String offerCaption) {
        this.dwlsOfferCaption = offerCaption;
    }

    public BigDecimal getDwlsFineFrom() {
        return dwlsFineFrom;
    }

    public void setDwlsFineFrom(BigDecimal offerFine) {
        this.dwlsFineFrom = offerFine;
    }

    public BigDecimal getDwlsFineTo() {
        return dwlsFineTo;
    }

    public void setDwlsFineTo(BigDecimal offerFine) {
        this.dwlsFineTo = offerFine;
    }

    public String getDwlsFineFromString() {
        return dwlsFineFromString;
    }

    public void setDwlsFineFromString(String fineString) {
        this.dwlsFineFromString = fineString;
    }

    public String getDwlsFineToString() {
        return dwlsFineToString;
    }

    public void setDwlsFineToString(String fineString) {
        this.dwlsFineToString = fineString;
    }

    public Integer getDwlsOfferPoints() {
        return dwlsOfferPoints;
    }

    public void setDwlsOfferPoints(Integer dwlsOfferPoints) {
        this.dwlsOfferPoints = dwlsOfferPoints;
    }

    // Traffic School

    public Boolean getTrafficSchool() {
        return trafficSchool;
    }

    public void setTrafficSchool(Boolean trafficSchool) {
        this.trafficSchool = trafficSchool;
    }

    public Boolean getAcknowledged() {
        return acknowledged;
    }

    public void setAcknowledged(Boolean acknowledged) {
        this.acknowledged = acknowledged;
    }

    public Boolean getAcknowledged1() {
        return acknowledged1;
    }

    public void setAcknowledged1(Boolean acknowledged) {
        this.acknowledged1 = acknowledged;
    }

    public Boolean getAcknowledged2() {
        return acknowledged2;
    }

    public void setAcknowledged2(Boolean acknowledged) {
        this.acknowledged2 = acknowledged;
    }

    public Boolean getAcknowledged3() {
        return acknowledged3;
    }

    public void setAcknowledged3(Boolean acknowledged) {
        this.acknowledged3 = acknowledged;
    }

    public Boolean getAcknowledged4() {
        return acknowledged4;
    }

    public void setAcknowledged4(Boolean acknowledged) {
        this.acknowledged4 = acknowledged;
    }

    public Boolean getAcknowledged5() {
        return acknowledged5;
    }

    public void setAcknowledged5(Boolean acknowledged) {
        this.acknowledged5 = acknowledged;
    }

    public Boolean getAcknowledged6() {
        return acknowledged6;
    }

    public void setAcknowledged6(Boolean acknowledged6) {
        this.acknowledged6 = acknowledged6;
    }

    public Boolean getAcknowledged7() {
        return acknowledged7;
    }

    public void setAcknowledged7(Boolean acknowledged7) {
        this.acknowledged7 = acknowledged7;
    }

    public Boolean getAcknowledged8() {
        return acknowledged8;
    }

    public void setAcknowledged8(Boolean acknowledged8) {
        this.acknowledged8 = acknowledged8;
    }

    public Boolean getAcknowledged9() {
        return acknowledged9;
    }

    public void setAcknowledged9(Boolean acknowledged9) {
        this.acknowledged9 = acknowledged9;
    }

    public Boolean getAcknowledged10() {
        return acknowledged10;
    }

    public void setAcknowledged10(Boolean acknowledged10) {
        this.acknowledged10 = acknowledged10;
    }

    public Boolean getAcknowledged11() {
        return acknowledged11;
    }

    public void setAcknowledged11(Boolean acknowledged11) {
        this.acknowledged11 = acknowledged11;
    }

    public Boolean getAcknowledged12() {
        return acknowledged12;
    }

    public void setAcknowledged12(Boolean acknowledged12) {
        this.acknowledged12 = acknowledged12;
    }

    public Boolean getAcknowledged13() {
        return acknowledged13;
    }

    public void setAcknowledged13(Boolean acknowledged13) {
        this.acknowledged13 = acknowledged13;
    }

    public Boolean getAcknowledged14() {
        return acknowledged14;
    }

    public void setAcknowledged14(Boolean acknowledged14) {
        this.acknowledged14 = acknowledged14;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getDueDateString() {
        return dueDateString;
    }

    public void setDueDateString(String dueDateString) {
        this.dueDateString = dueDateString;
    }

    public String getDueDaysString() {
        return dueDaysString;
    }

    public void setDueDaysString(String dueDaysString) {
        this.dueDaysString = dueDaysString;
    }

    public List<String> getOtherDateString() {
        return otherDateString;
    }

    public void setOtherDateString(List<String> otherDateString) {
        this.otherDateString =  otherDateString;
    }

    public List<String> getOtherDaysString() {
        return otherDaysString;
    }

    public void setOtherDaysString(List<String> otherDaysString) {
        this.otherDaysString = otherDaysString;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public String getDismissalForm() {
        return dismissalForm;
    }

    public void setDismissalForm(String dismissalForm) {
        this.dismissalForm = dismissalForm;
    }

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public Boolean getCancelled() {
        return cancelled;
    }

    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String getBondAmountString() {
        return bondAmountString;
    }

    public void setBondAmountString(String bondAmountString) {
        this.bondAmountString = bondAmountString;
    }

    public String getBondLabel() {
        return bondLabel;
    }

    public void setBondLabel(String bondLabel) {
        this.bondLabel = bondLabel;
    }

    public BigDecimal getBondAmount() {
        return bondAmount;
    }

    public void setBondAmount(BigDecimal bondAmount) {
        this.bondAmount = bondAmount;
    }

    public String getPaymentAmountString() {
        return paymentAmountString;
    }

    public void setPaymentAmountString(String paymentAmountString) {
        this.paymentAmountString = paymentAmountString;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getDownPaymentAmountString() {
        return downPaymentAmountString;
    }

    public void setDownPaymentAmountString(String downPaymentAmountString) {
        this.downPaymentAmountString = downPaymentAmountString;
    }

    public BigDecimal getDownPaymentAmount() {
        return downPaymentAmount;
    }

    public void setDownPaymentAmount(BigDecimal downPaymentAmount) {
        this.downPaymentAmount = downPaymentAmount;
    }

    public String getFirstPaymentDateString() {
        return firstPaymentDateString;
    }

    public void setFirstPaymentDateString(String firstPaymentDateString) {
        this.firstPaymentDateString = firstPaymentDateString;
    }

    public Date getFirstPaymentDate() {
        return firstPaymentDate;
    }

    public void setFirstPaymentDate(Date firstPaymentDate) {
        this.firstPaymentDate = firstPaymentDate;
    }

    public String getPaymentFrequency() {
        return paymentFrequency;
    }

    public void setPaymentFrequency(String paymentFrequency) {
        this.paymentFrequency = paymentFrequency;
    }

    public String getAppearanceDateString() {
        return appearanceDateString;
    }

    public void setAppearanceDateString(String appearanceDateString) {
        this.appearanceDateString = appearanceDateString;
    }

    public Date getAppearanceDate() {
        return appearanceDate;
    }

    public void setAppearanceDate(Date appearanceDate) {
        this.appearanceDate = appearanceDate;
    }

    public String getAppearanceTimeString() {
        return appearanceTimeString;
    }

    public void setAppearanceTimeString(String appearanceTimeString) {
        this.appearanceTimeString = appearanceTimeString;
    }

    public String getJudge() {
        return judge;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment1() {
        return comment1;
    }

    public void setComment1(String comment1) {
        this.comment1 = comment1;
    }

    public String getPretrialDateString() {
        return pretrialDateString;
    }

    public void setPretrialDateString(String pretrialDateString) {
        this.pretrialDateString = pretrialDateString;
    }

    public Date getPretrialDate() {
        return pretrialDate;
    }

    public void setPretrialDate(Date pretrialDate) {
        this.pretrialDate = pretrialDate;
    }

    public Map<String, Object> getOptions() {
        return options;
    }

    public void setOptions(Map<String, Object> options) {
        this.options = options;
    }

    public boolean getHasFileToUpload() {
        return hasFileToUpload;
    }

    public void setHasFileToUpload(boolean hasFileToUpload) {
        this.hasFileToUpload = hasFileToUpload;
    }

    public List<FileInformation> getFileInformationList() {
        return fileInformationList;
    }

    public void setFileInformationList(List<FileInformation> fileInformationList) {
        this.fileInformationList = fileInformationList;
    }

    public Boolean getCompletedForm() {
        return completedForm;
    }

    public void setCompletedForm(Boolean completedForm) {
        this.completedForm = completedForm;
    }

    public Boolean getCompletedForm1() {
        return completedForm1;
    }

    public void setCompletedForm1(Boolean completedForm) {
        this.completedForm1 = completedForm;
    }

    public Boolean getCompletedForm2() {
        return completedForm2;
    }

    public void setCompletedForm2(Boolean completedForm) {
        this.completedForm2 = completedForm;
    }

    public Boolean getCompletedForm3() {
        return completedForm3;
    }

    public void setCompletedForm3(Boolean completedForm) {
        this.completedForm3 = completedForm;
    }

    public Boolean getCompletedForm4() {
        return completedForm4;
    }

    public void setCompletedForm4(Boolean completedForm) {
        this.completedForm4 = completedForm;
    }

    public Boolean getCompletedForm5() {
        return completedForm5;
    }

    public void setCompletedForm5(Boolean completedForm) {
        this.completedForm5 = completedForm;
    }

    public Boolean getCompletedForm6() {
        return completedForm6;
    }

    public void setCompletedForm6(Boolean completedForm6) {
        this.completedForm6 = completedForm6;
    }

    public Boolean getCompletedForm7() {
        return completedForm7;
    }

    public void setCompletedForm7(Boolean completedForm7) {
        this.completedForm7 = completedForm7;
    }

    public Boolean getCompletedForm8() {
        return completedForm8;
    }

    public void setCompletedForm8(Boolean completedForm8) {
        this.completedForm8 = completedForm8;
    }

    public Boolean getCompletedForm9() {
        return completedForm9;
    }

    public void setCompletedForm9(Boolean completedForm9) {
        this.completedForm9 = completedForm9;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
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

    public Object get(String key) {
        return getOptions().get(key);
    }

    public void set(String key, Object value) {
        getOptions().put(key, value);
    }

    public void removeKey(String key) {
        getOptions().remove(key);
    }

    public String getDateOfBirthString() {
        return dateOfBirthString;
    }

    public void setDateOfBirthString(String dateOfBirthString) {
        this.dateOfBirthString = dateOfBirthString;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCommunityServiceDaysString() {
        return communityServiceDaysString;
    }

    public void setCommunityServiceDaysString(String communityServiceDaysString) {
        this.communityServiceDaysString = communityServiceDaysString;
    }

    public Integer getCommunityServiceDays() {
        return communityServiceDays;
    }

    public void setCommunityServiceDays(Integer communityServiceDays) {
        this.communityServiceDays = communityServiceDays;
    }

    public Boolean getCommunityServiceOptionSelected() {
        return communityServiceOptionSelected;
    }

    public void setCommunityServiceOptionSelected(Boolean communityServiceOptionSelected) {
        this.communityServiceOptionSelected = communityServiceOptionSelected;
    }

    public Boolean getFineOptionSelected() {
        return fineOptionSelected;
    }

    public void setFineOptionSelected(Boolean fineOptionSelected) {
        this.fineOptionSelected = fineOptionSelected;
    }

    public String getPaymentPlanTotalFineString() {
        return paymentPlanTotalFineString;
    }

    public void setPaymentPlanTotalFineString(String paymentPlanTotalFineString) {
        this.paymentPlanTotalFineString = paymentPlanTotalFineString;
    }

    public BigDecimal getPaymentPlanTotalFine() {
        return paymentPlanTotalFine;
    }

    public void setPaymentPlanTotalFine(BigDecimal paymentPlanTotalFine) {
        this.paymentPlanTotalFine = paymentPlanTotalFine;
    }

    public String getPaymentTypeOption() {
        return paymentTypeOption;
    }

    public void setPaymentTypeOption(String paymentTypeOption) {
        this.paymentTypeOption = paymentTypeOption;
    }

    public List<String> getSelection() {
        return selection;
    }

    public void setSelection(List<String> selection) {
        this.selection = selection;
    }

    public List<String> getOtherText() {
        return otherText;
    }

    public void setOtherText(List<String> otherText) {
        this.otherText = otherText;
    }

    public String getSignatureName() {
        return signatureName0;
    }

    public void setSignatureName(String signatureName) {
        this.signatureName0 = signatureName;
    }

    public String getSignatureSvg11() {
        return signatureSvg11;
    }

    public void setSignatureSvg11(String signatureSvg11) {
        this.signatureSvg11 = signatureSvg11;
    }

    public String getSignatureSvg12() {
        return signatureSvg12;
    }

    public void setSignatureSvg12(String signatureSvg12) {
        this.signatureSvg12 = signatureSvg12;
    }

    public String getSignatureName11() {
        return signatureName11;
    }

    public void setSignatureName11(String signatureName11) {
        this.signatureName11 = signatureName11;
    }

    public String getSignatureName12() {
        return signatureName12;
    }

    public void setSignatureName12(String signatureName12) {
        this.signatureName12 = signatureName12;
    }

    public String getSignatureSvg0() {
        return signatureSvg0;
    }

    public void setSignatureSvg0(String signatureSvg0) {
        this.signatureSvg0 = signatureSvg0;
    }

    public String getSignatureSvg1() {
        return signatureSvg1;
    }

    public void setSignatureSvg1(String signatureSvg1) {
        this.signatureSvg1 = signatureSvg1;
    }

    public String getSignatureSvg2() {
        return signatureSvg2;
    }

    public void setSignatureSvg2(String signatureSvg2) {
        this.signatureSvg2 = signatureSvg2;
    }

    public String getSignatureSvg3() {
        return signatureSvg3;
    }

    public void setSignatureSvg3(String signatureSvg3) {
        this.signatureSvg3 = signatureSvg3;
    }

    public String getSignatureSvg4() {
        return signatureSvg4;
    }

    public void setSignatureSvg4(String signatureSvg4) {
        this.signatureSvg4 = signatureSvg4;
    }

    public String getSignatureSvg5() {
        return signatureSvg5;
    }

    public void setSignatureSvg5(String signatureSvg5) {
        this.signatureSvg5 = signatureSvg5;
    }

    public String getSignatureSvg6() {
        return signatureSvg6;
    }

    public void setSignatureSvg6(String signatureSvg6) {
        this.signatureSvg6 = signatureSvg6;
    }

    public String getSignatureSvg7() {
        return signatureSvg7;
    }

    public void setSignatureSvg7(String signatureSvg7) {
        this.signatureSvg7 = signatureSvg7;
    }

    public String getSignatureSvg8() {
        return signatureSvg8;
    }

    public void setSignatureSvg8(String signatureSvg8) {
        this.signatureSvg8 = signatureSvg8;
    }

    public String getSignatureSvg9() {
        return signatureSvg9;
    }

    public void setSignatureSvg9(String signatureSvg9) {
        this.signatureSvg9 = signatureSvg9;
    }

    public String getSignatureName0() {
        return signatureName0;
    }

    public void setSignatureName0(String signatureName0) {
        this.signatureName0 = signatureName0;
    }

    public String getSignatureName1() {
        return signatureName1;
    }

    public void setSignatureName1(String signatureName1) {
        this.signatureName1 = signatureName1;
    }

    public String getSignatureName2() {
        return signatureName2;
    }

    public void setSignatureName2(String signatureName2) {
        this.signatureName2 = signatureName2;
    }

    public String getSignatureName3() {
        return signatureName3;
    }

    public void setSignatureName3(String signatureName3) {
        this.signatureName3 = signatureName3;
    }

    public String getSignatureName4() {
        return signatureName4;
    }

    public void setSignatureName4(String signatureName4) {
        this.signatureName4 = signatureName4;
    }

    public String getSignatureName5() {
        return signatureName5;
    }

    public void setSignatureName5(String signatureName5) {
        this.signatureName5 = signatureName5;
    }

    public String getSignatureName6() {
        return signatureName6;
    }

    public void setSignatureName6(String signatureName6) {
        this.signatureName6 = signatureName6;
    }

    public String getSignatureName7() {
        return signatureName7;
    }

    public void setSignatureName7(String signatureName7) {
        this.signatureName7 = signatureName7;
    }

    public String getSignatureName8() {
        return signatureName8;
    }

    public void setSignatureName8(String signatureName8) {
        this.signatureName8 = signatureName8;
    }

    public String getSignatureName9() {
        return signatureName9;
    }

    public void setSignatureName9(String signatureName9) {
        this.signatureName9 = signatureName9;
    }

    public boolean getCsvExported() {
        return csvExported;
    }

    public void setCsvExported(boolean csvExported) {
        this.csvExported = csvExported;
    }

    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    public String getDescription4() {
        return description4;
    }

    public void setDescription4(String description4) {
        this.description4 = description4;
    }

    public String getDescription5() {
        return description5;
    }

    public void setDescription5(String description5) {
        this.description5 = description5;
    }

    public String getDescription6() {
        return description6;
    }

    public void setDescription6(String description6) {
        this.description6 = description6;
    }

    public String getDescription7() {
        return description7;
    }

    public void setDescription7(String description7) {
        this.description7 = description7;
    }

    public String getStatute1() {
        return statute1;
    }

    public void setStatute1(String statute1) {
        this.statute1 = statute1;
    }

    public String getStatute2() {
        return statute2;
    }

    public void setStatute2(String statute2) {
        this.statute2 = statute2;
    }

    public String getStatute3() {
        return statute3;
    }

    public void setStatute3(String statute3) {
        this.statute3 = statute3;
    }

    public String getStatute4() {
        return statute4;
    }

    public void setStatute4(String statute4) {
        this.statute4 = statute4;
    }

    public String getStatute5() {
        return statute5;
    }

    public void setStatute5(String statute5) {
        this.statute5 = statute5;
    }

    public String getStatute6() {
        return statute6;
    }

    public void setStatute6(String statute6) {
        this.statute6 = statute6;
    }

    public String getStatute7() {
        return statute7;
    }

    public void setStatute7(String statute7) {
        this.statute7 = statute7;
    }

    public int getPoints1() {
        return points1;
    }

    public void setPoints1(int points1) {
        this.points1 = points1;
    }

    public int getPoints2() {
        return points2;
    }

    public void setPoints2(int points2) {
        this.points2 = points2;
    }

    public int getPoints3() {
        return points3;
    }

    public void setPoints3(int points3) {
        this.points3 = points3;
    }

    public int getPoints4() {
        return points4;
    }

    public void setPoints4(int points4) {
        this.points4 = points4;
    }

    public int getPoints5() {
        return points5;
    }

    public void setPoints5(int points5) {
        this.points5 = points5;
    }

    public int getPoints6() {
        return points6;
    }

    public void setPoints6(int points6) {
        this.points6 = points6;
    }

    public int getPoints7() {
        return points7;
    }

    public void setPoints7(int points7) {
        this.points7 = points7;
    }

    public String getOffer1() {
        return offer1;
    }

    public void setOffer1(String offer1) {
        this.offer1 = offer1;
    }

    public String getOffer2() {
        return offer2;
    }

    public void setOffer2(String offer2) {
        this.offer2 = offer2;
    }

    public String getOffer3() {
        return offer3;
    }

    public void setOffer3(String offer3) {
        this.offer3 = offer3;
    }

    public String getOffer4() {
        return offer4;
    }

    public void setOffer4(String offer4) {
        this.offer4 = offer4;
    }

    public String getOffer5() {
        return offer5;
    }

    public void setOffer5(String offer5) {
        this.offer5 = offer5;
    }

    public String getOffer6() {
        return offer6;
    }

    public void setOffer6(String offer6) {
        this.offer6 = offer6;
    }

    public String getOffer7() {
        return offer7;
    }

    public void setOffer7(String offer7) {
        this.offer7 = offer7;
    }

    public String getSignatureSvg10() {
        return signatureSvg10;
    }

    public void setSignatureSvg10(String signatureSvg10) {
        this.signatureSvg10 = signatureSvg10;
    }

    public String getSignatureName10() {
        return signatureName10;
    }

    public void setSignatureName10(String signatureName10) {
        this.signatureName10 = signatureName10;
    }

    public String getComment2() {
        return comment2;
    }

    public void setComment2(String comment2) {
        this.comment2 = comment2;
    }

    public String getComment3() {
        return comment3;
    }

    public void setComment3(String comment3) {
        this.comment3 = comment3;
    }

    public String getComment4() {
        return comment4;
    }

    public void setComment4(String comment4) {
        this.comment4 = comment4;
    }

    public String getComment5() {
        return comment5;
    }

    public void setComment5(String comment5) {
        this.comment5 = comment5;
    }

    public Boolean getTrafficSchool1() {
        return trafficSchool1;
    }

    public void setTrafficSchool1(Boolean trafficSchool1) {
        this.trafficSchool1 = trafficSchool1;
    }

    public Boolean getTrafficSchool2() {
        return trafficSchool2;
    }

    public void setTrafficSchool2(Boolean trafficSchool2) {
        this.trafficSchool2 = trafficSchool2;
    }

    public Boolean getTrafficSchool3() {
        return trafficSchool3;
    }

    public void setTrafficSchool3(Boolean trafficSchool3) {
        this.trafficSchool3 = trafficSchool3;
    }

    public Boolean getTrafficSchool4() {
        return trafficSchool4;
    }

    public void setTrafficSchool4(Boolean trafficSchool4) {
        this.trafficSchool4 = trafficSchool4;
    }

    public Boolean getTrafficSchool5() {
        return trafficSchool5;
    }

    public void setTrafficSchool5(Boolean trafficSchool5) {
        this.trafficSchool5 = trafficSchool5;
    }

    public Boolean getTrafficSchool6() {
        return trafficSchool6;
    }

    public void setTrafficSchool6(Boolean trafficSchool6) {
        this.trafficSchool6 = trafficSchool6;
    }

    public Boolean getTrafficSchool7() {
        return trafficSchool7;
    }

    public void setTrafficSchool7(Boolean trafficSchool7) {
        this.trafficSchool7 = trafficSchool7;
    }

    public boolean isHasDismissedSubcase() {
        return hasDismissedSubcase;
    }

    public void setHasDismissedSubcase(boolean hasDismissedSubcase) {
        this.hasDismissedSubcase = hasDismissedSubcase;
    }

    public String getStatus1() {
        return status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1;
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }

    public String getStatus3() {
        return status3;
    }

    public void setStatus3(String status3) {
        this.status3 = status3;
    }

    public String getStatus4() {
        return status4;
    }

    public void setStatus4(String status4) {
        this.status4 = status4;
    }

    public String getStatus5() {
        return status5;
    }

    public void setStatus5(String status5) {
        this.status5 = status5;
    }

    public String getStatus6() {
        return status6;
    }

    public void setStatus6(String status6) {
        this.status6 = status6;
    }

    public String getStatus7() {
        return status7;
    }

    public void setStatus7(String status7) {
        this.status7 = status7;
    }

    public void setMultiAck(Map<Integer, Map<Integer, Boolean>> multiAck) {
        this.multiAck = multiAck;
    }

    public Map<Integer, Map<Integer, Boolean>> getMultiAck() {
        return multiAck;
    }

    public boolean isExtraFee() {
        return extraFee;
    }

    public void setExtraFee(boolean extraFee) {
        this.extraFee = extraFee;
    }

    public String getExtraFeeAmount() {
        return extraFeeAmount;
    }

    public void setExtraFeeAmount(String extraFeeAmount) {
        this.extraFeeAmount = extraFeeAmount;
    }

    public String getCustomDropdown1() {
        return customDropdown1;
    }

    public void setCustomDropdown1(String customDropdown1) {
        this.customDropdown1 = customDropdown1;
    }

    public String getCustomDropdown2() {
        return customDropdown2;
    }

    public void setCustomDropdown2(String customDropdown2) {
        this.customDropdown2 = customDropdown2;
    }

    public String getCustomDropdown3() {
        return customDropdown3;
    }

    public void setCustomDropdown3(String customDropdown3) {
        this.customDropdown3 = customDropdown3;
    }

    public String getCustomDropdown4() {
        return customDropdown4;
    }

    public void setCustomDropdown4(String customDropdown4) {
        this.customDropdown4 = customDropdown4;
    }

    public String getCustomDropdown5() {
        return customDropdown5;
    }

    public void setCustomDropdown5(String customDropdown5) {
        this.customDropdown5 = customDropdown5;
    }

    public String getCustomDropdown6() {
        return customDropdown6;
    }

    public void setCustomDropdown6(String customDropdown6) {
        this.customDropdown6 = customDropdown6;
    }

    public String getCustomDropdown7() {
        return customDropdown7;
    }

    public void setCustomDropdown7(String customDropdown7) {
        this.customDropdown7 = customDropdown7;
    }

    public String getDescription8() {
        return description8;
    }

    public void setDescription8(String description8) {
        this.description8 = description8;
    }

    public String getDescription9() {
        return description9;
    }

    public void setDescription9(String description9) {
        this.description9 = description9;
    }

    public String getDescription10() {
        return description10;
    }

    public void setDescription10(String description10) {
        this.description10 = description10;
    }

    public String getDescription11() {
        return description11;
    }

    public void setDescription11(String description11) {
        this.description11 = description11;
    }

    public String getDescription12() {
        return description12;
    }

    public void setDescription12(String description12) {
        this.description12 = description12;
    }

    public String getDescription13() {
        return description13;
    }

    public void setDescription13(String description13) {
        this.description13 = description13;
    }

    public String getDescription14() {
        return description14;
    }

    public void setDescription14(String description14) {
        this.description14 = description14;
    }

    public String getDescription15() {
        return description15;
    }

    public void setDescription15(String description15) {
        this.description15 = description15;
    }

    public String getStatute9() {
        return statute9;
    }

    public void setStatute9(String statute9) {
        this.statute9 = statute9;
    }

    public String getStatute8() {
        return statute8;
    }

    public void setStatute8(String statute8) {
        this.statute8 = statute8;
    }

    public String getStatute10() {
        return statute10;
    }

    public void setStatute10(String statute10) {
        this.statute10 = statute10;
    }

    public String getStatute11() {
        return statute11;
    }

    public void setStatute11(String statute11) {
        this.statute11 = statute11;
    }

    public String getStatute12() {
        return statute12;
    }

    public void setStatute12(String statute12) {
        this.statute12 = statute12;
    }

    public String getStatute13() {
        return statute13;
    }

    public void setStatute13(String statute13) {
        this.statute13 = statute13;
    }

    public String getStatute14() {
        return statute14;
    }

    public void setStatute14(String statute14) {
        this.statute14 = statute14;
    }

    public String getStatute15() {
        return statute15;
    }

    public void setStatute15(String statute15) {
        this.statute15 = statute15;
    }

    public String getCustomDropdown8() {
        return customDropdown8;
    }

    public void setCustomDropdown8(String customDropdown8) {
        this.customDropdown8 = customDropdown8;
    }

    public String getCustomDropdown9() {
        return customDropdown9;
    }

    public void setCustomDropdown9(String customDropdown9) {
        this.customDropdown9 = customDropdown9;
    }

    public String getCustomDropdown10() {
        return customDropdown10;
    }

    public void setCustomDropdown10(String customDropdown10) {
        this.customDropdown10 = customDropdown10;
    }

    public String getCustomDropdown11() {
        return customDropdown11;
    }

    public void setCustomDropdown11(String customDropdown11) {
        this.customDropdown11 = customDropdown11;
    }

    public String getCustomDropdown12() {
        return customDropdown12;
    }

    public void setCustomDropdown12(String customDropdown12) {
        this.customDropdown12 = customDropdown12;
    }

    public String getCustomDropdown13() {
        return customDropdown13;
    }

    public void setCustomDropdown13(String customDropdown13) {
        this.customDropdown13 = customDropdown13;
    }

    public String getCustomDropdown14() {
        return customDropdown14;
    }

    public void setCustomDropdown14(String customDropdown14) {
        this.customDropdown14 = customDropdown14;
    }

    public String getCustomDropdown15() {
        return customDropdown15;
    }

    public void setCustomDropdown15(String customDropdown15) {
        this.customDropdown15 = customDropdown15;
    }

    public Boolean getTrafficSchool8() {
        return trafficSchool8;
    }

    public void setTrafficSchool8(Boolean trafficSchool8) {
        this.trafficSchool8 = trafficSchool8;
    }

    public Boolean getTrafficSchool9() {
        return trafficSchool9;
    }

    public void setTrafficSchool9(Boolean trafficSchool9) {
        this.trafficSchool9 = trafficSchool9;
    }

    public Boolean getTrafficSchool10() {
        return trafficSchool10;
    }

    public void setTrafficSchool10(Boolean trafficSchool10) {
        this.trafficSchool10 = trafficSchool10;
    }

    public Boolean getTrafficSchool11() {
        return trafficSchool11;
    }

    public void setTrafficSchool11(Boolean trafficSchool11) {
        this.trafficSchool11 = trafficSchool11;
    }

    public Boolean getTrafficSchool12() {
        return trafficSchool12;
    }

    public void setTrafficSchool12(Boolean trafficSchool12) {
        this.trafficSchool12 = trafficSchool12;
    }

    public Boolean getTrafficSchool13() {
        return trafficSchool13;
    }

    public void setTrafficSchool13(Boolean trafficSchool13) {
        this.trafficSchool13 = trafficSchool13;
    }

    public Boolean getTrafficSchool14() {
        return trafficSchool14;
    }

    public void setTrafficSchool14(Boolean trafficSchool14) {
        this.trafficSchool14 = trafficSchool14;
    }

    public Boolean getTrafficSchool15() {
        return trafficSchool15;
    }

    public void setTrafficSchool15(Boolean trafficSchool15) {
        this.trafficSchool15 = trafficSchool15;
    }

    public int getPoints9() {
        return points9;
    }

    public void setPoints9(int points9) {
        this.points9 = points9;
    }

    public int getPoints8() {
        return points8;
    }

    public void setPoints8(int points8) {
        this.points8 = points8;
    }

    public int getPoints10() {
        return points10;
    }

    public void setPoints10(int points10) {
        this.points10 = points10;
    }

    public int getPoints11() {
        return points11;
    }

    public void setPoints11(int points11) {
        this.points11 = points11;
    }

    public int getPoints12() {
        return points12;
    }

    public void setPoints12(int points12) {
        this.points12 = points12;
    }

    public int getPoints13() {
        return points13;
    }

    public void setPoints13(int points13) {
        this.points13 = points13;
    }

    public int getPoints14() {
        return points14;
    }

    public void setPoints14(int points14) {
        this.points14 = points14;
    }

    public int getPoints15() {
        return points15;
    }

    public void setPoints15(int points15) {
        this.points15 = points15;
    }

    public String getOffer8() {
        return offer8;
    }

    public void setOffer8(String offer8) {
        this.offer8 = offer8;
    }

    public String getOffer9() {
        return offer9;
    }

    public void setOffer9(String offer9) {
        this.offer9 = offer9;
    }

    public String getOffer10() {
        return offer10;
    }

    public void setOffer10(String offer10) {
        this.offer10 = offer10;
    }

    public String getOffer11() {
        return offer11;
    }

    public void setOffer11(String offer11) {
        this.offer11 = offer11;
    }

    public String getOffer12() {
        return offer12;
    }

    public void setOffer12(String offer12) {
        this.offer12 = offer12;
    }

    public String getOffer13() {
        return offer13;
    }

    public void setOffer13(String offer13) {
        this.offer13 = offer13;
    }

    public String getOffer14() {
        return offer14;
    }

    public void setOffer14(String offer14) {
        this.offer14 = offer14;
    }

    public String getOffer15() {
        return offer15;
    }

    public void setOffer15(String offer15) {
        this.offer15 = offer15;
    }

    public String getCustomNumberInput1() {
        return customNumberInput1;
    }

    public void setCustomNumberInput1(String customNumberInput1) {
        this.customNumberInput1 = customNumberInput1;
    }

    public String getCustomNumberInput2() {
        return customNumberInput2;
    }

    public void setCustomNumberInput2(String customNumberInput2) {
        this.customNumberInput2 = customNumberInput2;
    }

    public String getCustomNumberInput3() {
        return customNumberInput3;
    }

    public void setCustomNumberInput3(String customNumberInput3) {
        this.customNumberInput3 = customNumberInput3;
    }

    public String getCustomNumberInput4() {
        return customNumberInput4;
    }

    public void setCustomNumberInput4(String customNumberInput4) {
        this.customNumberInput4 = customNumberInput4;
    }

    public String getCustomNumberInput5() {
        return customNumberInput5;
    }

    public void setCustomNumberInput5(String customNumberInput5) {
        this.customNumberInput5 = customNumberInput5;
    }

    public String getCustomNumberInput6() {
        return customNumberInput6;
    }

    public void setCustomNumberInput6(String customNumberInput6) {
        this.customNumberInput6 = customNumberInput6;
    }

    public String getCustomNumberInput7() {
        return customNumberInput7;
    }

    public void setCustomNumberInput7(String customNumberInput7) {
        this.customNumberInput7 = customNumberInput7;
    }

    public String getCustomNumberInput8() {
        return customNumberInput8;
    }

    public void setCustomNumberInput8(String customNumberInput8) {
        this.customNumberInput8 = customNumberInput8;
    }

    public String getCustomNumberInput9() {
        return customNumberInput9;
    }

    public void setCustomNumberInput9(String customNumberInput9) {
        this.customNumberInput9 = customNumberInput9;
    }

    public String getCustomNumberInput10() {
        return customNumberInput10;
    }

    public void setCustomNumberInput10(String customNumberInput10) {
        this.customNumberInput10 = customNumberInput10;
    }

    public String getCustomNumberInput11() {
        return customNumberInput11;
    }

    public void setCustomNumberInput11(String customNumberInput11) {
        this.customNumberInput11 = customNumberInput11;
    }

    public String getCustomNumberInput12() {
        return customNumberInput12;
    }

    public void setCustomNumberInput12(String customNumberInput12) {
        this.customNumberInput12 = customNumberInput12;
    }

    public String getCustomNumberInput13() {
        return customNumberInput13;
    }

    public void setCustomNumberInput13(String customNumberInput13) {
        this.customNumberInput13 = customNumberInput13;
    }

    public String getCustomNumberInput14() {
        return customNumberInput14;
    }

    public void setCustomNumberInput14(String customNumberInput14) {
        this.customNumberInput14 = customNumberInput14;
    }

    public String getCustomNumberInput15() {
        return customNumberInput15;
    }

    public void setCustomNumberInput15(String customNumberInput15) {
        this.customNumberInput15 = customNumberInput15;
    }
}
