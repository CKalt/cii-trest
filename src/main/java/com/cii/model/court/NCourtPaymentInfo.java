package com.cii.model.court;

public class NCourtPaymentInfo {
    private String userName;
    private String password;
    private String guid;
    private String ncourtUrl;
    private boolean defaultPayee;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getNcourtUrl() {
        return ncourtUrl;
    }

    public void setNcourtUrl(String ncourtUrl) {
        this.ncourtUrl = ncourtUrl;
    }

    public boolean isDefaultPayee() {
        return defaultPayee;
    }

    public void setDefaultPayee(boolean defaultPayee) {
        this.defaultPayee = defaultPayee;
    }
}
