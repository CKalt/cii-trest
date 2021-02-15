package com.cii.model.config;

import java.util.List;

public class BuildFormOption extends NegotiationOption {
    private List<Object> forms;
    private boolean hideOptionOnCreate;
    private String content;
    private boolean isHtmlForm;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setForms(List<Object> forms) { this.forms = forms; }

    public List<Object> getForms() { return this.forms; }

    public boolean getHideOptionOnCreate() {
        return hideOptionOnCreate;
    }

    public void setHideOptionOnCreate(boolean hideOptionOnCreate) {
        this.hideOptionOnCreate = hideOptionOnCreate;
    }

    public boolean getIsHtmlForm() {
        return isHtmlForm;
    }

    public void setHtmlForm(boolean htmlForm) {
        isHtmlForm = htmlForm;
    }
}
