package com.cii.model.config;

public class SetAcceptanceActionListener extends ActionListener {
	private boolean accept;
	private String label;
	
	public boolean getAccept() {
		return accept;
	}

	public void setAccept(boolean accept) {
		this.accept = accept;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
