package com.cii.model.config;

public abstract class ExpirationStateListener extends WorkflowStateListener {
	private boolean expired = true;
	private String templateName;

	public boolean getExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}
}
