package com.cii.model.config;

public class SetCaseTypeActionListener extends ActionListener {
	private String caseType;
	private String caseSubType;
	private boolean showCaseType = true;
	
	public String getCaseType() {
		return caseType;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public String getCaseSubType() {
		return caseSubType;
	}

	public void setCaseSubType(String caseSubType) {
		this.caseSubType = caseSubType;
	}

	public boolean getShowCaseType() {
		return showCaseType;
	}

	public void setShowCaseType(boolean showCaseType) {
		this.showCaseType = showCaseType;
	}
}
