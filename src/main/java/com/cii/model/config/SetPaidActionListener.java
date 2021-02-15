package com.cii.model.config;

public class SetPaidActionListener extends ActionListener {
	private boolean paid;
	private String label;
	
	public boolean getPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
