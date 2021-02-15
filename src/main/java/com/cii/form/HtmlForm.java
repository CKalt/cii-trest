package com.cii.form;

import java.util.Date;
import java.util.HashMap;

import org.springframework.data.annotation.Id;

import com.cii.model.negotiation.Negotiation;

public class HtmlForm {
    @Id
    private String id;
    private String negotiationId;
    private Date createDate;
    private Date updateDate;
    private HashMap<String, String> variables;
    private AgreementStatus htmlFormStatus;
    private String htmlFormVersionId;
    private String pdfBucket;
    private String pdfFolder;
    private String pdfFileName;

    public AgreementStatus getHtmlFormStatus() {
        return htmlFormStatus;
    }

    public void setHtmlFormStatus(AgreementStatus htmlFormStatus) {
        this.htmlFormStatus = htmlFormStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public String getHtmlFormVersionId() {
        return htmlFormVersionId;
    }

    public void setHtmlFormVersionId(String htmlFormVersionId) {
        this.htmlFormVersionId = htmlFormVersionId;
    }

    public String getNegotiationId() {
		return negotiationId;
	}

	public void setNegotiationId(String negotiationId) {
		this.negotiationId = negotiationId;
	}

	public HashMap<String, String> getVariables() {
        return variables;
    }

    public void setVariables(HashMap<String, String> variables) {
        this.variables = variables;
    }

    public String getPdfBucket() {
        return pdfBucket;
    }

    public void setPdfBucket(String pdfBucket) {
        this.pdfBucket = pdfBucket;
    }

    public String getPdfFolder() {
        return pdfFolder;
    }

    public void setPdfFolder(String pdfFolder) {
        this.pdfFolder = pdfFolder;
    }

    public String getPdfFileName() {
        return pdfFileName;
    }

    public void setPdfFileName(String pdfFileName) {
        this.pdfFileName = pdfFileName;
    }
}
