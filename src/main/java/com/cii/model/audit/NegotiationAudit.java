package com.cii.model.audit;

import java.util.Date;

import javax.persistence.Id;

import com.cii.model.negotiation.Negotiation;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.cii.model.config.NegotiationOptionValues;

@Document
public class NegotiationAudit {
	@Id
	private String id;
	private String userId;
	private Date createDate;
	private String urlKey;
	
	@Indexed
	private String negotiationId;
	private String workflowFromStateId;
	private String workflowFromStateName;
	private String workflowToStateId;
	private String workflowToStateName;
	private String actionId;
	private String actionName;
	private NegotiationOptionValues beforeOptionValues;
	private NegotiationOptionValues afterOptionValues;

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
		
	public String getNegotiationId() {
		return negotiationId;
	}
	
	public void setNegotiationId(String negotiationId) {
		this.negotiationId = negotiationId;
	}
	
	public String getWorkflowFromStateId() {
		return workflowFromStateId;
	}
	
	public void setWorkflowFromStateId(String workflowFromStateId) {
		this.workflowFromStateId = workflowFromStateId;
	}
	
	public String getWorkflowFromStateName() {
		return workflowFromStateName;
	}
	
	public void setWorkflowFromStateName(String workflowFromStateName) {
		this.workflowFromStateName = workflowFromStateName;
	}
	
	public String getWorkflowToStateId() {
		return workflowToStateId;
	}
	
	public void setWorkflowToStateId(String workflowToStateId) {
		this.workflowToStateId = workflowToStateId;
	}
	
	public String getWorkflowToStateName() {
		return workflowToStateName;
	}
	
	public void setWorkflowToStateName(String workflowToStateName) {
		this.workflowToStateName = workflowToStateName;
	}
	
	public String getActionId() {
		return actionId;
	}
	
	public void setActionId(String actionId) {
		this.actionId = actionId;
	}
	
	public String getActionName() {
		return actionName;
	}
	
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	
	public NegotiationOptionValues getBeforeOptionValues() {
		return beforeOptionValues;
	}
	
	public void setBeforeOptionValues(NegotiationOptionValues beforeOptionValues) {
		this.beforeOptionValues = beforeOptionValues;
	}
	
	public NegotiationOptionValues getAfterOptionValues() {
		return afterOptionValues;
	}
	
	public void setAfterOptionValues(NegotiationOptionValues afterOptionValues) {
		this.afterOptionValues = afterOptionValues;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setUrlKey(String urlKey) { this.urlKey = urlKey; }

	public String getUrlKey(){ return urlKey; }
}
