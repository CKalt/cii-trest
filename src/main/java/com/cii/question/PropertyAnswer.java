package com.cii.question;

public class PropertyAnswer extends Answer {
	private String propertyDescription;
	private String propertyValue;
	private String amountOwed;

	public String getValue() {
		return propertyDescription + propertyValue + amountOwed;
	}

	public String getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	public String getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	public String getAmountOwed() {
		return amountOwed;
	}

	public void setAmountOwed(String amountOwedValue) {
		this.amountOwed = amountOwedValue;
	}
}
