package com.cii.model.config;

public class SetRecommendationActionListener extends ActionListener {
	private boolean approve;
	private String label;

	public boolean getApprove() {
		return approve;
	}

	public void setApprove(boolean approve) {
		this.approve = approve;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
