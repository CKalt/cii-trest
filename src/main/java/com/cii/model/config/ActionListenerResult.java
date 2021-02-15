package com.cii.model.config;

import java.util.ArrayList;
import java.util.List;

import com.cii.model.negotiation.HistoryItem;

public class ActionListenerResult {
	private boolean sentNotification = false;
	private boolean stopEvaluation = false;
	private String toStateId;
	private String status;
	private String template;
	private List<HistoryItem> historyItems;
		
	public boolean getSentNotification() {
		return sentNotification;
	}
	
	public void setSentNotification(boolean sentNotification) {
		this.sentNotification = sentNotification;
	}
	
	public boolean getStopEvaluation() {
		return stopEvaluation;
	}
	
	public void setStopEvaluation(boolean stopEvaluation) {
		this.stopEvaluation = stopEvaluation;
	}

	public String getToStateId() {
		return toStateId;
	}

	public void setToStateId(String toStateId) {
		this.toStateId = toStateId;
	}

	public List<HistoryItem> getHistoryItems() {
		return historyItems;
	}

	public void setHistoryItems(List<HistoryItem> historyItems) {
		this.historyItems = historyItems;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}
}
