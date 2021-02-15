package com.cii.model.config;

public class SetDueDateOption extends NegotiationOption {
    private String label = "Due Date";
    private boolean requireFutureDate = true;
	
	public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean getRequireFutureDate() {
        return requireFutureDate;
    }

    public void setRequireFutureDate(boolean requireFutureDate) {
        this.requireFutureDate = requireFutureDate;
    }
}
