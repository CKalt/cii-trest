package com.cii.model.config;
import java.util.*;

public class CommentOption extends NegotiationOption {

    private String label;
    private String placeholder;
    private String header;
    private boolean isPublic = false;
    private int index = 0;
    private boolean updateCCMS = false;
    private Map<String, List<String>> access;
    private String attribute = "comment";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attr) {
        this.attribute = attr;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}
