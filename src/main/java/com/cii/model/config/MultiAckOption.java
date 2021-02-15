package com.cii.model.config;

import java.util.List;
import java.util.Map;

public class MultiAckOption extends NegotiationOption {
    private String caption = "";
    private List<Map<String,String>> options;
    private int index;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public List<Map<String, String>> getOptions() {
        return options;
    }

    public void setOptions(List<Map<String, String>> options) {
        this.options = options;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
