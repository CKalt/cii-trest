package com.cii.model.config;

import java.util.List;

public class PaymentPlanOption extends NegotiationOption {
	private List<String> frequencies;
	private boolean showDownPayment = false;

	public PaymentPlanOption(boolean required) {
		setRequired(required);
	}

	public List<String> getFrequencies() {
		return frequencies;
	}

	public void setFrequencies(List<String> frequencies) {
		this.frequencies = frequencies;
	}
}
