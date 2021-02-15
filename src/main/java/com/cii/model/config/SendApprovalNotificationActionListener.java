package com.cii.model.config;

public class SendApprovalNotificationActionListener extends ActionListener {
	private Boolean approve = true;
	private String templateName;
	
	public Boolean getApprove() {
		return approve;
	}

	public void setApprove(Boolean approve) {
		this.approve = approve;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
}
