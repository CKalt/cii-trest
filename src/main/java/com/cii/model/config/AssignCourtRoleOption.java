package com.cii.model.config;

public class AssignCourtRoleOption extends NegotiationOption {
    private String label = "";
    private String caption = "";
    private String courtRole;
    private String selectedUser;
    private boolean removeCounsel = false;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCourtRole() {
        return courtRole;
    }

    public void setCourtRole(String courtRole) {
        this.courtRole = courtRole;
    }

    public String getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(String selectedUser) {
        this.selectedUser = selectedUser;
    }

    public boolean isRemoveCounsel() {
        return removeCounsel;
    }

    public void setRemoveCounsel(boolean removeCounsel) {
        this.removeCounsel = removeCounsel;
    }
}
