package com.cii.model.negotiation;

import com.querydsl.core.annotations.QueryEntity;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Map;

@QueryEntity
@Document
@CompoundIndexes({
    @CompoundIndex(name = "negotiationId", def = "{negotiationId: 1, createDate: -1}")
})
public class HistoryItem {
    private String id;
    private String negotiationId;
	private String userId; 
	private Date createDate;
	private String note;
    private Map<String, List<String>> access;
    private String notificationId;
    private String apiAuditId;

    @Transient
    private String name;
    @Transient
    private String type;

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNegotiationId() {
		return negotiationId;
	}

	public void setNegotiationId(String negotiationId) {
		this.negotiationId = negotiationId;
	}

	public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date created) {
        this.createDate = created;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

	public Map<String, List<String>> getAccess() {
		return access;
	}

	public void setAccess(Map<String, List<String>> access) {
		this.access = access;
	}
	
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getApiAuditId() {
        return apiAuditId;
    }

    public void setApiAuditId(String apiAuditId) {
        this.apiAuditId = apiAuditId;
    }
}
