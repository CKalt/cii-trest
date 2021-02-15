package com.cii.model.config;

import java.util.List;
import java.util.Map;

public class SelectOption extends NegotiationOption {
	private String label = "";
	private List<String> selections;	
	private String variable = "selection";
	private Map<String, List<String>> access;

	public List<String> getSelections() {
		return selections;
	}

	public void setSelections(List<String> selections) {
		this.selections = selections;
	}
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public Map<String, List<String>> getAccess() {
		return access;
	}

	public void setAccess(Map<String, List<String>> access) {
		this.access = access;
	}
}
