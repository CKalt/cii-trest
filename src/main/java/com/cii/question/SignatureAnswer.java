package com.cii.question;

public class SignatureAnswer extends Answer {
    private String signatureSvg;
    private String signatureName;
    private int index;

    public String getValue() {
        return signatureSvg;
    }

    public String getSignatureSvg() {
        return signatureSvg;
    }

    public void setSignatureSvg(String signatureSvg) {
        this.signatureSvg = signatureSvg;
    }

    public String getSignatureName() {
        return signatureName;
    }

    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
