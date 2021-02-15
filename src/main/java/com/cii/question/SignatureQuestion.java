package com.cii.question;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SignatureQuestion extends Question {
    private int index;
    private boolean signatureRequired;
    private boolean nameRequired;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean getSignatureRequired() {
        return signatureRequired;
    }

    public void setSignatureRequired(boolean signatureRequired) {
        this.signatureRequired = signatureRequired;
    }

    public boolean getNameRequired() {
        return nameRequired;
    }

    public void setNameRequired(boolean nameRequired) {
        this.nameRequired = nameRequired;
    }

    @JsonIgnore
    public SignatureQuestion getSignatureQuestion() {
        return this;
    }
}
