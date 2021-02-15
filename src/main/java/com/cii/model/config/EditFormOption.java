package com.cii.model.config;

public class EditFormOption extends NegotiationOption  {
    private String deleteFormActionId;
    private String submitFormActionId;
    private String formInformationLabel = "Complete Form Information";
    private boolean displaySave = true;
    private boolean displayClearAndSave = true;
    private boolean displaySaveAndView = true;
    private boolean displayDelete = true;
    private boolean displaySaveAndSubmit = true;
    private boolean useHtmlForm = false;

    public void setDeleteFormActionId(String deleteFormActionId) { this.deleteFormActionId = deleteFormActionId; }

    public String getDeleteFormActionId() { return deleteFormActionId; }

    public void setSubmitFormActionId(String submitFormActionId) { this.submitFormActionId = submitFormActionId; }

    public String getSubmitFormActionId() { return submitFormActionId; }

    public boolean getDisplaySave() {
        return displaySave;
    }

    public void setDisplaySave(boolean displaySave) {
        this.displaySave = displaySave;
    }

    public boolean getDisplayClearAndSave() {
        return displayClearAndSave;
    }

    public void setDisplayClearAndSave(boolean displayClearAndSave) {
        this.displayClearAndSave = displayClearAndSave;
    }

    public boolean getDisplaySaveAndView() {
        return displaySaveAndView;
    }

    public void setDisplaySaveAndView(boolean displaySaveAndView) {
        this.displaySaveAndView = displaySaveAndView;
    }

    public boolean getDisplayDelete() {
        return displayDelete;
    }

    public void setDisplayDelete(boolean displayDelete) {
        this.displayDelete = displayDelete;
    }

    public boolean getDisplaySaveAndSubmit() {
        return displaySaveAndSubmit;
    }

    public void setDisplaySaveAndSubmit(boolean displaySaveAndSubmit) {
        this.displaySaveAndSubmit = displaySaveAndSubmit;
    }

    public boolean getUseHtmlForm() {
        return useHtmlForm;
    }

    public void setUseHtmlForm(boolean useHtmlForm) {
        this.useHtmlForm = useHtmlForm;
    }

    public String getFormInformationLabel() {
        return formInformationLabel;
    }

    public void setFormInformationLabel(String formInformationLabel) {
        this.formInformationLabel = formInformationLabel;
    }
}
