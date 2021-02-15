package com.cii.model.event;

import java.util.Date;
import java.util.HashMap;
import javax.persistence.Id;

import com.cii.model.user.Role;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public  class Event {
    @Id
    private String id;

    @Id
    private String userId;
    @Id
    private String negotiationId;
    private String eventType;
    private String access;
    private Date timestamp;
    private Role role;

    private HashMap<String,Object> data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public HashMap<String,Object> getData() {
        return data;
    }

    public void setData(HashMap<String,Object> data) {
        this.data = data;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getNegotiationId() {
        return negotiationId;
    }

    public void setNegotiationId(String negotiationId) {
        this.negotiationId = negotiationId;
    }


    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }
}
