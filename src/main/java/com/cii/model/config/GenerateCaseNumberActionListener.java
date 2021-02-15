package com.cii.model.config;

public class GenerateCaseNumberActionListener extends ActionListener  {
	private String prefix = "";
	private boolean generateCitizenCaseNumberOnly = false;
	
	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String caseNumberPrefix) {
		this.prefix = caseNumberPrefix;
	}

	public boolean isGenerateCitizenCaseNumberOnly() {
		return generateCitizenCaseNumberOnly;
	}

	public void setGenerateCitizenCaseNumberOnly(boolean generateCitizenCaseNumberOnly) {
		this.generateCitizenCaseNumberOnly = generateCitizenCaseNumberOnly;
	}
}
