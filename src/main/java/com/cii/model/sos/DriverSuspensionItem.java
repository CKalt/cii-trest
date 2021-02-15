package com.cii.model.sos;

import java.util.Date;

import com.cii.json.JsonDateDeserializer;
import com.cii.json.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class DriverSuspensionItem {
    @JsonSerialize(using = JsonDateSerializer.class)
    @JsonDeserialize(using = JsonDateDeserializer.class)
    private Date suspensionDate;

    private String location;
    
    public Date getSuspensionDate() {
        return suspensionDate;
    }
    
    public void setSuspensionDate(Date suspensionDate) {
        this.suspensionDate = suspensionDate;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

}
