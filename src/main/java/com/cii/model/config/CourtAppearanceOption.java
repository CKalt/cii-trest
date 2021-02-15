package com.cii.model.config;

public class CourtAppearanceOption extends NegotiationOption {
	private String label = "Hearing Date";
	private boolean showJudge = true;
	private boolean showTime = true;
	private boolean requireFutureDate = true;
	private String attribute;

	public boolean getShowJudge() {
		return showJudge;
	}

	public void setShowJudge(boolean showJudge) {
		this.showJudge = showJudge;
	}

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

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
}
