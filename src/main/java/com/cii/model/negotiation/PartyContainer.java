package com.cii.model.negotiation;

import java.util.ArrayList;
import java.util.List;

public class PartyContainer {
    private String type;
    private String partyName;
    private List<UserContainer> users;
    private List<BusinessContainer> businesses;

    public String getType() {
        return type;
    }

    public void setType(String partyType) {
        this.type = partyType;
    }

    public String getPartyName() { return partyName; }

    public void setPartyName(String partyName) { this.partyName = partyName; }

    public List<UserContainer> getUsers() {
        return users;
    }

    public void setBusinesses(List<BusinessContainer> businesses) { this.businesses = businesses; }

    public List<BusinessContainer> getBusinesses() {
        return businesses;
    }

    public void setUsers(List<UserContainer> users) { this.users = users; }
}
