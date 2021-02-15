package com.cii.model.config;

import java.util.List;
import java.util.Map;

public class ViewFormOption extends NegotiationOption {
    private String caption;
    private String content;
    private String condition;
    private String signButtonText;
    private String rejectButtonText;
    private boolean signOrRejectVisible;
    private boolean signVisible;
    private boolean rejectVisible;
    private boolean questionsVisible = true;
    private List<Object> agreementViews;
    private boolean resetSignaturesOnReject = false;
    private boolean displayDescending = false;
    private Map<String, List<String>> access;

    public void setCaption(String caption) { this.caption = caption; }

    public String getCaption() { return this.caption; }

    public void setContent(String content) { this.content = content; }

    public String getContent() { return this.content; }

    public void setCondition(String condition) { this.condition = condition; }

    public String getCondition() { return this.condition; }

    public void setSignOrRejectVisible(boolean signOrRejectVisible) { this.signOrRejectVisible = signOrRejectVisible; }

    public boolean getSignOrRejectVisible() { return this.signOrRejectVisible; }

    public boolean getQuestionsVisible() {
        return questionsVisible;
    }

    public void setQuestionsVisible(boolean questionsVisible) {
        this.questionsVisible = questionsVisible;
    }

    public List<Object> getAgreementViews() {
        return agreementViews;
    }

    public void setAgreementViews(List<Object> agreementViews) {
        this.agreementViews = agreementViews;
    }

    public boolean getSignVisible() {
        return signVisible;
    }

    public void setSignVisible(boolean signVisible) {
        this.signVisible = signVisible;
    }

    public boolean getRejectVisible() {
        return rejectVisible;
    }

    public void setRejectVisible(boolean rejectVisible) {
        this.rejectVisible = rejectVisible;
    }

    public String getSignButtonText() {
        return signButtonText;
    }

    public void setSignButtonText(String signButtonText) {
        this.signButtonText = signButtonText;
    }

    public String getRejectButtonText() {
        return rejectButtonText;
    }

    public void setRejectButtonText(String rejectButtonText) {
        this.rejectButtonText = rejectButtonText;
    }

    public boolean getResetSignaturesOnReject() {
        return resetSignaturesOnReject;
    }

    public void setResetSignaturesOnReject(boolean resetSignaturesOnReject) {
        this.resetSignaturesOnReject = resetSignaturesOnReject;
    }

    public boolean isDisplayDescending() {
        return displayDescending;
    }

    public void setDisplayDescending(boolean displayDescending) {
        this.displayDescending = displayDescending;
    }

    public Map<String, List<String>> getAccess() {
        return access;
    }

    public void setAccess(Map<String, List<String>> access) {
        this.access = access;
    }
}
