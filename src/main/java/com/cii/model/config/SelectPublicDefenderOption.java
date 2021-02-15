package com.cii.model.config;

public class SelectPublicDefenderOption extends NegotiationOption {
    private String publicDefender;
    private String content = "";
    private String caption = "";

    public String getPublicDefender() {
        return publicDefender;
    }

    public void setPublicDefender(String publicDefender) {
        this.publicDefender = publicDefender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
