package com.cii.model.config;

import java.util.List;
import java.util.Map;

public class SelectCaseDataOption extends NegotiationOption {
    private String caption;
    private String label;
    private String emails;
    private List<String> selectedFileIds;
    private Map<String, List<String>> users;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public List<String> getSelectedFileIds() {
        return selectedFileIds;
    }

    public void setSelectedFileIds(List<String> selectedFileIds) {
        this.selectedFileIds = selectedFileIds;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Map<String, List<String>> getUsers() {
        return users;
    }

    public void setUsers(Map<String, List<String>> users) {
        this.users = users;
    }
}
