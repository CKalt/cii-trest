package com.cii.model.sos;

import java.util.Date;

public class DriverHistoryItem {
    private String description;    
    private String location;
    private DriverHistoryItemType type;
    private String unparsedString;
    
    private Date convictionDate;
    
    private Date issuedDate;
    
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Date getConvictionDate() {
        return convictionDate;
    }
    
    public void setConvictionDate(Date convictionDate) {
        this.convictionDate = convictionDate;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public DriverHistoryItemType getType() {
        return type;
    }
    
    public void setType(DriverHistoryItemType type) {
        this.type = type;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getUnparsedString() {
        return unparsedString;
    }

    public void setUnparsedString(String unparsedString) {
        this.unparsedString = unparsedString;
    } 
}
