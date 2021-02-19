package com.cii.model.config;

import java.util.List;
import java.util.Map;

import com.cii.model.event.EventData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Action {
	private String id;
	private String toStateId;
	private Map<String, List<String>> access;
	private String name;
	private String caption;
	private boolean shouldNotNotifyDefendant = false;
	private boolean hidden = false;
	private String displayType;
    private List<NegotiationOption> options;
	private List<ActionListener> listeners;
	private boolean isAngular = false;

	private List<EventData> events;

	public boolean getIsAngular() {
		return isAngular;
	}

	public void setIsAngular(boolean angular) {
		this.isAngular = angular;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getToStateId() {
		return toStateId;
	}
	
	public void setToStateId(String toStateName) {
		this.toStateId = toStateName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
    
    public boolean getShouldNotNotifyDefendant() {
        return shouldNotNotifyDefendant;
    }

    public void setShouldNotNotifyDefendant(boolean notifyDefendant) {
        this.shouldNotNotifyDefendant = notifyDefendant;
    }

	public Map<String, List<String>> getAccess() {
		return access;
	}

	public void setAccess(Map<String, List<String>> access) {
		this.access = access;
	}

	public List<NegotiationOption> getOptions() {
        return options;
    }

    public void setOptions(List<NegotiationOption> options) {
        this.options = options;
    }

    public boolean getHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

	public String getDisplayType() { return this.displayType; }

	public void setDisplayType(String displayType) { this.displayType = displayType; }

    public List<ActionListener> getListeners() {
		return listeners;
	}

    @JsonSetter
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

