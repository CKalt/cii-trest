package com.cii.model.negotiation;

import java.util.List;
import java.util.Map;

public class FormContainer {
    private String formId;
    private String workflowStateId;
    private String pin;
    private String createdByUserPin;
    private String status;
    private String displayName;
    private String s3FileName;
    private String key;
    private boolean ignoreParties;
    private Map<String, String> agreementDisplayList;
    private Map<String, List<String>> users;
    private Map<String, Object> variables;

    public void setFormId(String formId) {this.formId = formId; }

    public String getFormId() { return formId; }

    public void setWorkflowStateId(String workflowStateId) { this.workflowStateId = workflowStateId; }

    public String getWorkflowStateId() { return workflowStateId; }

    public void setUsers(Map<String, List<String>> users) { this.users = users; }

    public Map<String, List<String>> getUsers() { return users; }

    public void setVariables(Map<String, Object> variables) { this.variables = variables; }

    public Map<String, Object> getVariables() { return this.variables; }

    public void setPin(String pin) { this.pin = pin; }

    public String getPin() { return this.pin; }

    public void setCreatedByUserPin(String createdByUserPin) { this.createdByUserPin = createdByUserPin; }

    public String getCreatedByUserPin() { return this.createdByUserPin; }

    public void setStatus(String status) { this.status = status; }

    public String getStatus() { return status; }

    public void setDisplayName(String displayName) { this.displayName = displayName; }

    public String getDisplayName() { return displayName; }

    public void setS3FileName(String s3FileName) { this.s3FileName = s3FileName; }

    public String getS3FileName() { return this.s3FileName; }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Map<String, String> getAgreementDisplayList() {
        return agreementDisplayList;
    }

    public void setAgreementDisplayList(Map<String, String> agreementDisplayList) {
        this.agreementDisplayList = agreementDisplayList;
    }

    public boolean isIgnoreParties() {
        return ignoreParties;
    }

    public void setIgnoreParties(boolean ignoreParties) {
        this.ignoreParties = ignoreParties;
    }
}
