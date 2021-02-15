package com.cii.question;

import java.util.Map;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="_class")
public abstract class Question extends QuestionVisitor {
    protected boolean isRequired;
    protected String caption;
    protected Integer dependsOnQuestion;
    protected Integer dependsOnOption;
    protected boolean updateNegotiation;
    protected String attribute;
    protected String baseUrl;
    protected String label;
    private String captionAttribute;
    private String setValueFromIncident;
    private boolean partyAnswer;
    private String dateFormat;
    private boolean useConditional;
    private boolean useNegotiationData;

    private Map<String, List<String>> access;

    public boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public List<QuestionOption> getOptions() {
        return null;
    }

    public void setOptions(List<QuestionOption> options) {
    }

    public Integer getDependsOnQuestion() {
        return dependsOnQuestion;
    }

    public void setDependsOnQuestion(Integer dependsOnQuestion) {
        this.dependsOnQuestion = dependsOnQuestion;
    }

    public Integer getDependsOnOption() {
        return dependsOnOption;
    }

    public void setDependsOnOption(Integer dependsOnOption) {
        this.dependsOnOption = dependsOnOption;
    }

    public boolean getUpdateNegotiation() {
        return updateNegotiation;
    }

    public void setUpdateNegotiation(boolean updateNegotiation) {
        this.updateNegotiation = updateNegotiation;
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Map<String, List<String>> getAccess() {
        return access;
    }

    public void setAccess(Map<String, List<String>> access) {
        this.access = access;
    }

    public void setBaseUrl(String baseUrl) { this.baseUrl = baseUrl; }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCaptionAttribute() {
        return captionAttribute;
    }

    public void setCaptionAttribute(String captionAttribute) {
        this.captionAttribute = captionAttribute;
    }

    public boolean isPartyAnswer() {
        return partyAnswer;
    }

    public void setPartyAnswer(boolean partyAnswer) {
        this.partyAnswer = partyAnswer;
    }

    public String getSetValueFromIncident() {
        return setValueFromIncident;
    }

    public void setSetValueFromIncident(String setValueFromIncident) {
        this.setValueFromIncident = setValueFromIncident;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public boolean isUseConditional() {
        return useConditional;
    }

    public void setUseConditional(boolean useConditional) {
        this.useConditional = useConditional;
    }

    public boolean isUseNegotiationData() {
        return useNegotiationData;
    }

    public void setUseNegotiationData(boolean useNegotiationData) {
        this.useNegotiationData = useNegotiationData;
    }
}
