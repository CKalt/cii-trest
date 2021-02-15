package com.cii.model.config;

public class PreTrialDateOption extends NegotiationOption {
	private String label = "Pre-trial Hearing Date";
	private boolean showTime = true;
	private boolean requireFutureDate = true;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean getShowTime() {
		return showTime;
	}

	public void setShowTime(boolean showTime) {
		this.showTime = showTime;
	}

	public boolean getRequireFutureDate() {
		return requireFutureDate;
	}

	public void setRequireFutureDate(boolean requireFutureDate) {
		this.requireFutureDate = requireFutureDate;
	}
}
