package com.cii.model.negotiation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BusinessContainer {
    private String businessId;
    private String pin;
    private String businessName;
    private List<String> users;
    private Map<String, Object> data;

    public void setBusinessId(String businessId) { this.businessId = businessId; }
    public String getBusinessId() { return businessId; }

    public Map<String, Object> getData() { return data; }

    public void setData(Map<String, Object> data) { this.data = data; }

    public void setPin(String pin) { this.pin = pin; }

    public String getPin() {return this.pin; }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }
}
