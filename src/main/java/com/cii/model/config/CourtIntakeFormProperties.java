package com.cii.model.config;

import java.util.List;
import java.util.Map;

public class CourtIntakeFormProperties {
    private boolean hasCaseNumber;
    private boolean hasMediator;
    private boolean hasIVDNumber;
    private boolean hasJudge;
    private boolean hasMediationType;
    private boolean hasReferralSource;
    private boolean hasFirstCourtDate;
    private boolean hasAttorneyName;
    private boolean hasHearingDate;
    private boolean hasHearingType;
    private boolean JISWarrantUpload;
    private String mediatorLabel;
    private String caseNumberLabel;
    private List<Dropdown> mediationTypes;
    private List<Dropdown> referralSources;
    private Map<String, String> buttonLabels;

    public boolean isHasCaseNumber() {
        return hasCaseNumber;
    }

    public void setHasCaseNumber(boolean hasCaseNumber) {
        this.hasCaseNumber = hasCaseNumber;
    }

    public boolean isHasMediator() {
        return hasMediator;
    }

    public void setHasMediator(boolean hasMediator) {
        this.hasMediator = hasMediator;
    }

    public boolean isHasIVDNumber() {
        return hasIVDNumber;
    }

    public void setHasIVDNumber(boolean hasIVDNumber) {
        this.hasIVDNumber = hasIVDNumber;
    }

    public boolean isHasJudge() {
        return hasJudge;
    }

    public void setHasJudge(boolean hasJudge) {
        this.hasJudge = hasJudge;
    }

    public boolean isHasMediationType() {
        return hasMediationType;
    }

    public void setHasMediationType(boolean hasMediationType) {
        this.hasMediationType = hasMediationType;
    }

    public boolean isHasReferralSource() {
        return hasReferralSource;
    }

    public void setHasReferralSource(boolean hasReferralSource) {
        this.hasReferralSource = hasReferralSource;
    }

    public boolean isHasFirstCourtDate() {
        return hasFirstCourtDate;
    }

    public void setHasFirstCourtDate(boolean hasFirstCourtDate) {
        this.hasFirstCourtDate = hasFirstCourtDate;
    }

    public boolean isHasAttorneyName() {
        return hasAttorneyName;
    }

    public void setHasAttorneyName(boolean hasAttorneyName) {
        this.hasAttorneyName = hasAttorneyName;
    }

    public boolean isHasHearingType() {
        return hasHearingType;
    }

    public void setHasHearingType(boolean hasHearingType) {
        this.hasHearingType = hasHearingType;
    }

    public List<Dropdown> getMediationTypes() {
        return mediationTypes;
    }

    public void setMediationTypes(List<Dropdown> mediationTypes) {
        this.mediationTypes = mediationTypes;
    }

    public List<Dropdown> getReferralSources() {
        return referralSources;
    }

    public void setReferralSources(List<Dropdown> referralSources) {
        this.referralSources = referralSources;
    }

    public boolean isHasHearingDate() {
        return hasHearingDate;
    }

    public void setHasHearingDate(boolean hasHearingDate) {
        this.hasHearingDate = hasHearingDate;
    }

    public boolean isJISWarrantUpload() {
        return JISWarrantUpload;
    }

    public void setJISWarrantUpload(boolean JISWarrantUpload) {
        this.JISWarrantUpload = JISWarrantUpload;
    }

    public Map<String, String> getButtonLabels() {
        return buttonLabels;
    }

    public void setButtonLabels(Map<String, String> buttonLabels) {
        this.buttonLabels = buttonLabels;
    }

    public String getMediatorLabel() {
        return mediatorLabel;
    }

    public void setMediatorLabel(String mediatorLabel) {
        this.mediatorLabel = mediatorLabel;
    }

    public String getCaseNumberLabel() {
        return caseNumberLabel;
    }

    public void setCaseNumberLabel(String caseNumberLabel) {
        this.caseNumberLabel = caseNumberLabel;
    }
}
