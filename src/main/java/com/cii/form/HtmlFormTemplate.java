package com.cii.form;

import com.cii.model.config.PopulatedFormValues;
import com.cii.model.config.QuestionConfiguration;
import com.cii.model.config.WorkflowConfiguration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Document
public class HtmlFormTemplate {
    @Id
    private String id;
    private String courtHtmlForm;
    private String citizenHtmlForm;
    private String completedHtmlForm;
    private String urlKey;
    private String name;
    private Boolean defendantSignatureNecessary;
    private Boolean pdf;
    private String originalPdf;
    private String s3FileName;
    private String agreementName;
    private List<AgreementDisplayInformation> agreementDisplayList;
    private WorkflowConfiguration formWorkflowConfiguration;
    private QuestionConfiguration questionConfiguration;
    private PopulatedFormValues populatedFormValues;
    private Map<String, Integer> partySignaturePages;
    private String saveRejectedFormToWfs;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrlKey() {
        return urlKey;
    }

    public void setUrlKey(String urlKey) {
        this.urlKey = urlKey;
    }

    public String getCourtHtmlForm() {
        return courtHtmlForm;
    }

    public void setCourtHtmlForm(
            String form) {
        this.courtHtmlForm = form;
    }

    public String getCompletedHtmlForm() {
        return completedHtmlForm;
    }

    public void setCompletedHtmlForm(String form) {
        this.completedHtmlForm = form;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDefendantSignatureNecessary() {
        return defendantSignatureNecessary;
    }

    public void setDefendantSignatureNecessary(
            Boolean defendantSignatureNecessary) {
        this.defendantSignatureNecessary = defendantSignatureNecessary;
    }

    public String getCitizenHtmlForm() {
        return citizenHtmlForm;
    }

    public void setCitizenHtmlForm(String form) {
        this.citizenHtmlForm = form;
    }

    public Boolean getPdf() {
        return pdf;
    }

    public void setPdf(Boolean pdf) {
        this.pdf = pdf;
    }

    public String getOriginalPdf() {
        return originalPdf;
    }

    public void setOriginalPdf(String originalPdf) {
        this.originalPdf = originalPdf;
    }

    public void setS3FileName(String s3FileName) { this.s3FileName = s3FileName; }

    public String getS3FileName() { return this.s3FileName; }

    public WorkflowConfiguration getFormWorkflowConfiguration() { return formWorkflowConfiguration; }

    public void setFormWorkflowConfiguration(WorkflowConfiguration formWorkflowConfiguration) { this.formWorkflowConfiguration = formWorkflowConfiguration; }

    public QuestionConfiguration getQuestionConfiguration() { return questionConfiguration; }

    public void setQuestionConfiguration(QuestionConfiguration questionConfiguration) { this.questionConfiguration = questionConfiguration; }


    public void setAgreementDisplayList(List<AgreementDisplayInformation> agreementDisplayList) { this.agreementDisplayList = agreementDisplayList; }

    public List<AgreementDisplayInformation> getAgreementDisplayList() { return this.agreementDisplayList; }

    public PopulatedFormValues getPopulatedFormValues() {
        return populatedFormValues;
    }

    public void setPopulatedFormValues(PopulatedFormValues populatedFormValues) {
        this.populatedFormValues = populatedFormValues;
    }

    public String getAgreementName() {
        return agreementName;
    }

    public void setAgreementName(String agreementName) {
        this.agreementName = agreementName;
    }

    public Map<String, Integer> getPartySignaturePages() {
        return partySignaturePages;
    }

    public void setPartySignaturePages(Map<String, Integer> partySignaturePages) {
        this.partySignaturePages = partySignaturePages;
    }

    public String getSaveRejectedFormToWfs() {
        return saveRejectedFormToWfs;
    }

    public void setSaveRejectedFormToWfs(String saveRejectedFormToWfs) {
        this.saveRejectedFormToWfs = saveRejectedFormToWfs;
    }
}
