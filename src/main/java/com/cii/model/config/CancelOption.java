package com.cii.model.config;

import java.util.List;

public class CancelOption extends NegotiationOption {
	private List<String> cancelReasons;

	public List<String> getCancelReasons() {
		return cancelReasons;
	}

	public void setCancelOptions(List<String> cancelReasons) {
		this.cancelReasons = cancelReasons;
	}
}
