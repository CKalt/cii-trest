package com.cii.model.config;

public class AckOption extends NegotiationOption {
	private String label = "";
	private String attribute;
	private int index;

	public String getLabel() {
	    return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
