package com.cii.model.config;

public class SetOtherTextOption extends NegotiationOption {
    private String label = "";
    private String attribute = "text";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attr) {
        this.attribute = attr;
    }
}
