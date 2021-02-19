package com.cii.model.config;

import com.cii.model.negotiation.Negotiation;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Map;

public class NegotiationOption {
	protected boolean required;
	protected Map<String, Boolean> conditions;
	protected int weight;
	private boolean updateSubCases;
	private boolean savePartiesInvolvedToNegotiation;

	@JsonIgnore
	protected String negotiationId;
	@JsonIgnore
	protected String baseUrl;
	@JsonIgnore
	private String fullPath;
	@JsonIgnore
	protected String actionId;
	@JsonIgnore
	protected String filterString;
	@JsonIgnore
	private Negotiation negotiation;

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public int getWeight() { return weight; }

	public void setWeight(int weight) { this.weight = weight; }

	public String getNegotiationId() {
		return negotiationId;
	}

	public void setNegotiationId(String negotiationId) {
		this.negotiationId = negotiationId;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String url) {
		this.baseUrl = url;
	}

	public String getActionId() {
		return actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public String getFilterString() {
		return filterString;
	}

	public void setFilterString(String filterString) {
		this.filterString = filterString;
	}

	public Map<String, Boolean> getConditions() {
		return conditions;
	}

	public void setConditions(Map<String, Boolean> conditions) {
		this.conditions = conditions;
	}

	public String getFullPath() {
		return fullPath;
	}

	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}

	public boolean isUpdateSubCases() {
		return updateSubCases;
	}

	public void setUpdateSubCases(boolean updateSubCases) {
		this.updateSubCases = updateSubCases;
	}

	public Negotiation getNegotiation() {
		return negotiation;
	}

	public void setNegotiation(Negotiation negotiation) {
		this.negotiation = negotiation;
	}

	public boolean isSavePartiesInvolvedToNegotiation() {
		return savePartiesInvolvedToNegotiation;
	}

	public void setSavePartiesInvolvedToNegotiation(boolean savePartiesInvolvedToNegotiation) {
		this.savePartiesInvolvedToNegotiation = savePartiesInvolvedToNegotiation;
	}
}
