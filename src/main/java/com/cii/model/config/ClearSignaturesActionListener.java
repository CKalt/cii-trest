package com.cii.model.config;

import java.util.List;

public class ClearSignaturesActionListener extends ActionListener {
	private List<String> forms;
	private List<String> partyNames;
	
	public List<String> getForms() {
		return forms;
	}

	public void setForms(List<String> forms) {
		this.forms = forms;
	}

	public List<String> getPartyNames() {
		return partyNames;
	}

	public void setPartyNames(List<String> partyNames) {
		this.partyNames = partyNames;
	}
}
