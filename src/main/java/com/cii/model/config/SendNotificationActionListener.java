package com.cii.model.config;

public class SendNotificationActionListener extends ActionListener {	
	private String party = "DEFENDANT";
	private String template;
	
	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}
}
