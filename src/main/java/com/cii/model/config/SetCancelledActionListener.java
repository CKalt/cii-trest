package com.cii.model.config;

public class SetCancelledActionListener extends ActionListener {
	private boolean cancel;
	private String reason;
	
	public boolean getCancel() {
		return cancel;
	}

	public void setCancel(boolean cancel) {
		this.cancel = cancel;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
