package com.cii.model.config;

import java.util.Date;
import java.util.List;

import com.cii.model.event.EventData;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkflowConfiguration {
	private String name;
	private Date createDate;
	private List<WorkflowState> workflowStates;
	private List<ActionListener> listeners;
	private String startStateId;
	private String expiredStateId;
	private String finalStateId;
	private String workflowType;
	private List<EventData> events;
	
	public String getStartStateId() {
		return startStateId;
	}
	
	public void setStartStateId(String startStateId) {
		this.startStateId = startStateId;
	}
	
	public String getExpiredStateId() {
		return expiredStateId;
	}

	public void setExpiredStateId(String expiredStateId) {
		this.expiredStateId = expiredStateId;
	}

	public String getFinalStateId() {
		return finalStateId;
	}

	public void setFinalStateId(String finalStateId) {
		this.finalStateId = finalStateId;
	}

	public List<WorkflowState> getWorkflowStates() {
		return workflowStates;
	}
	
	public void setWorkflowStates(List<WorkflowState> workflowStates) {
		this.workflowStates = workflowStates;
	}

	public String getWorkflowType() { return workflowType; }

	public void setWorkflowType(String workflowType) { this.workflowType = workflowType; }

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

    public List<ActionListener> getListeners() {
        return listeners;
    }

    public void setListeners(List<ActionListener> listeners) {
        this.listeners = listeners;
    }
    
	public List<EventData> getEvents() {
		return events;
	}

	public void setEvents(List<EventData> events) {
		this.events = events;
	}
}
