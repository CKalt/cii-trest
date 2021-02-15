package com.cii.model.config;

public class EditSubCaseStatus extends Dropdown {
    private String status;
    private String template;
    private String workFlowStateId;
    private String dateParam;
    private boolean setFinalized;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getWorkFlowStateId() {
        return workFlowStateId;
    }

    public void setWorkFlowStateId(String workFlowStateId) {
        this.workFlowStateId = workFlowStateId;
    }

    public String getDateParam() {
        return dateParam;
    }

    public void setDateParam(String dateParam) {
        this.dateParam = dateParam;
    }

    public boolean isSetFinalized() {
        return setFinalized;
    }

    public void setSetFinalized(boolean setFinalized) {
        this.setFinalized = setFinalized;
    }
}
