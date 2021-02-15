package com.cii.model.config;

public class CompleteFormOption extends NegotiationOption {
    private String formCompletedLabel = "";
    private String formNotCompletedLabel = "";
    private String formName = "";
    private String template = "";
    private String completedFlag = "";
    private int index;
    private boolean showClearForm = true;

    public boolean isShowClearForm() {
        return showClearForm;
    }

    public void setShowClearForm(boolean showClearForm) {
        this.showClearForm = showClearForm;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String htmlFormIdOptionName) {
        this.formName = htmlFormIdOptionName;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String htmlFormTemplateId) {
        this.template = htmlFormTemplateId;
    }

    public String getCompletedFlag() {
        return completedFlag;
    }

    public void setCompletedFlag(String htmlFormCompletedFlag) {
        this.completedFlag = htmlFormCompletedFlag;
    }

    public String getFormCompletedLabel() {
        return formCompletedLabel;
    }

    public void setFormCompletedLabel(String formCompletedLabel) {
        this.formCompletedLabel = formCompletedLabel;
    }

    public String getFormNotCompletedLabel() {
        return formNotCompletedLabel;
    }

    public void setFormNotCompletedLabel(String formNotCompletedLabel) {
        this.formNotCompletedLabel = formNotCompletedLabel;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
