package com.cii.model.config;

public abstract class NotificationStateListener extends StateListener {
	private int offsetDays = 0;
	private String templateName;
	private String flag;

	public int getOffsetDays() {
		return offsetDays;
	}

	public void setOffsetDays(int offsetDays) {
		this.offsetDays = offsetDays;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String template) {
		this.templateName = template;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
}
