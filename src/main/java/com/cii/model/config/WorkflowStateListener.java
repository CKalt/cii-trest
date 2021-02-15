package com.cii.model.config;

public abstract class WorkflowStateListener extends StateListener {
	private int offsetDays = 0;
	//private String templateName;
	private String toState;
	private String status;

	public int getOffsetDays() {
		return offsetDays;
	}

	public void setOffsetDays(int offsetDays) {
		this.offsetDays = offsetDays;
	}

	public String getToState() {
		return toState;
	}

	public void setToState(String toState) {
		this.toState = toState;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
