package com.cii.model.config;

import java.math.BigDecimal;
import java.util.*;

public class EditSubCasesOption extends NegotiationOption {
    private List<String> columns;

    private List<Dropdown> offers;

    private List<Dropdown> descriptions;

    private List<CustomDropdown> customDropdown;

    private RadioButton trafficSchool;

    private boolean hasCustomOffers;

    private Double trafficSchoolFee;

    private List<EditSubCaseStatus> statuses;

    private String workFlowStateId;

    private boolean moveWFS;

    private String moveWFSStatusValue;

    private boolean trafficSchoolHistoryItem;

    private String trafficSchoolHistoryItemTemplate;
    private Map<String, List<String>> access;
    private String trafficSchoolLabel;
    private boolean trafficSchoolSingleCheck;
    private boolean displayExtraCaseFee;
    private String extraCaseFeeLabel;
    private String extraFeeHistoryItemLabel;
    private String extraCaseFeeAttribute;
    private boolean extraCaseFeeRequired;

    private String customDropdownLabel;
    private String customNumberInputLabel;
    private boolean customNumberInputIsInDollars;

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public List<Dropdown> getOffers() {
        return offers;
    }

    public void setOffers(List<Dropdown> offers) {
        this.offers = offers;
    }

    public List<Dropdown> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Dropdown> descriptions) {
        this.descriptions = descriptions;
    }

    public RadioButton getTrafficSchool() {
        return trafficSchool;
    }

    public void setTrafficSchool(RadioButton trafficSchool) {
        this.trafficSchool = trafficSchool;
    }

    public boolean isHasCustomOffers() {
        return hasCustomOffers;
    }

    public void setHasCustomOffers(boolean hasCustomOffers) {
        this.hasCustomOffers = hasCustomOffers;
    }

    public Double getTrafficSchoolFee() {
        return trafficSchoolFee;
    }

    public void setTrafficSchoolFee(Double trafficSchoolFee) {
        this.trafficSchoolFee = trafficSchoolFee;
    }

    public List<EditSubCaseStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<EditSubCaseStatus> statuses) {
        this.statuses = statuses;
    }

    public String getWorkFlowStateId() {
        return workFlowStateId;
    }

    public void setWorkFlowStateId(String workFlowStateId) {
        this.workFlowStateId = workFlowStateId;
    }

    public boolean isMoveWFS() {
        return moveWFS;
    }

    public String getMoveWFSStatusValue() {
        return moveWFSStatusValue;
    }

    public void setMoveWFSStatusValue(String moveWFSStatusValue) {
        this.moveWFSStatusValue = moveWFSStatusValue;
    }

    public void setMoveWFS(boolean moveWFS) {
        this.moveWFS = moveWFS;
    }

    public boolean isTrafficSchoolHistoryItem() {
        return trafficSchoolHistoryItem;
    }

    public void setTrafficSchoolHistoryItem(boolean trafficSchoolHistoryItem) {
        this.trafficSchoolHistoryItem = trafficSchoolHistoryItem;
    }

    public String getTrafficSchoolHistoryItemTemplate() {
        return trafficSchoolHistoryItemTemplate;
    }

    public void setTrafficSchoolHistoryItemTemplate(String trafficSchoolHistoryItemTemplate) {
        this.trafficSchoolHistoryItemTemplate = trafficSchoolHistoryItemTemplate;
    }

    public Map<String, List<String>> getAccess() {
        return access;
    }

    public void setAccess(Map<String, List<String>> access) {
        this.access = access;
    }

    public String getTrafficSchoolLabel() {
        return trafficSchoolLabel;
    }

    public void setTrafficSchoolLabel(String trafficSchoolLabel) {
        this.trafficSchoolLabel = trafficSchoolLabel;
    }

    public boolean isTrafficSchoolSingleCheck() {
        return trafficSchoolSingleCheck;
    }

    public void setTrafficSchoolSingleCheck(boolean trafficSchoolSingleCheck) {
        this.trafficSchoolSingleCheck = trafficSchoolSingleCheck;
    }

    public boolean isDisplayExtraCaseFee() {
        return displayExtraCaseFee;
    }

    public void setDisplayExtraCaseFee(boolean displayExtraCaseFee) {
        this.displayExtraCaseFee = displayExtraCaseFee;
    }

    public String getExtraCaseFeeLabel() {
        return extraCaseFeeLabel;
    }

    public void setExtraCaseFeeLabel(String extraCaseFeeLabel) {
        this.extraCaseFeeLabel = extraCaseFeeLabel;
    }

    public String getExtraCaseFeeAttribute() {
        return extraCaseFeeAttribute;
    }

    public void setExtraCaseFeeAttribute(String extraCaseFeeAttribute) {
        this.extraCaseFeeAttribute = extraCaseFeeAttribute;
    }

    public String getExtraFeeHistoryItemLabel() {
        return extraFeeHistoryItemLabel;
    }

    public void setExtraFeeHistoryItemLabel(String extraFeeHistoryItemLabel) {
        this.extraFeeHistoryItemLabel = extraFeeHistoryItemLabel;
    }

    public boolean isExtraCaseFeeRequired() {
        return extraCaseFeeRequired;
    }

    public void setExtraCaseFeeRequired(boolean extraCaseFeeRequired) {
        this.extraCaseFeeRequired = extraCaseFeeRequired;
    }

    public String getCustomDropdownLabel() {
        return customDropdownLabel;
    }

    public void setCustomDropdownLabel(String customDropdownLabel) {
        this.customDropdownLabel = customDropdownLabel;
    }

    public List<CustomDropdown> getCustomDropdown() {
        return customDropdown;
    }

    public void setCustomDropdown(List<CustomDropdown> customDropdown) {
        this.customDropdown = customDropdown;
    }

    public String getCustomNumberInputLabel() {
        return customNumberInputLabel;
    }

    public void setCustomNumberInputLabel(String customNumberInputLabel) {
        this.customNumberInputLabel = customNumberInputLabel;
    }

    public boolean isCustomNumberInputIsInDollars() {
        return customNumberInputIsInDollars;
    }

    public void setCustomNumberInputIsInDollars(boolean customNumberInputIsInDollars) {
        this.customNumberInputIsInDollars = customNumberInputIsInDollars;
    }
}
