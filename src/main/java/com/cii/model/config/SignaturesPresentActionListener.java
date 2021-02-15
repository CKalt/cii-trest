package com.cii.model.config;

import java.util.List;

public class SignaturesPresentActionListener extends ActionListener {
    private String toStateId;
    private String template;
    private String status;
    private List<String> signaturesRequired;

    public String getToStateId() {
        return toStateId;
    }

    public void setToStateId(String toStateId) {
        this.toStateId = toStateId;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getSignaturesRequired() {
        return signaturesRequired;
    }

    public void setSignaturesRequired(List<String> signaturesRequired) {
        this.signaturesRequired = signaturesRequired;
    }
}
