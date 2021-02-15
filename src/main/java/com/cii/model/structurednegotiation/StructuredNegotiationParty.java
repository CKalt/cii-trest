
package com.cii.model.structurednegotiation;


public class StructuredNegotiationParty {

    private StructuredNegotiationUser user;
    private String partyType;
    private StatusInfo statusInfo;

    public StructuredNegotiationUser getUser() {
        return user;
    }

    public void setUser(StructuredNegotiationUser user) {
        this.user = user;
    }

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

}
