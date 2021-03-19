package com.cii.model.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cii.model.courtcase.CaseStatus;
import com.cii.model.event.EventData;
import com.cii.model.negotiation.Negotiation;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkflowState {
	private String id;
	private String type;
	private String statusMessage;
	private List<Action> actions;
	private String name;
	private Map<String, List<String>> access;
	private CaseStatus caseStatus;
	private boolean endState;
	private List<StateListener> listeners;
	private List<EventData> events;
	private boolean excludedFromCount;

	public boolean isExcludedFromCount() {
		return excludedFromCount;
	}

	public void setExcludedFromCount(boolean excludedFromCount) {
		this.excludedFromCount = excludedFromCount;
	}

	public WorkflowState() {}
	
	public Map<String, List<String>> getAccess() {
		return access;
	}

	public void setAccess(Map<String, List<String>> access) {
		this.access = access;
	}

	public boolean isEndState() {
		return endState;
	}
	
	public void setEndState(boolean endState) {
		this.endState = endState;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CaseStatus getCaseStatus() {
		return caseStatus;
	}

	public void setCaseStatus(CaseStatus caseStatus) {
		this.caseStatus = caseStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() { return type; }

	public void setType(String type) { this.type = type; }

	public String getStatusMessage() { return statusMessage; }

	public void setStatusMessage(String statusMessage) { this.statusMessage = statusMessage; }

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

    public List<StateListener> getListeners() {
        return listeners;
    }

    public void setListeners(List<StateListener> listeners) {
        this.listeners = listeners;
    }

	public List<EventData> getEvents() {
		return events;
	}

	public void setEvents(List<EventData> events) {
		this.events = events;
	}
}
