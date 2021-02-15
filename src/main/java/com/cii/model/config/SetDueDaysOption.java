package com.cii.model.config;

public class SetDueDaysOption extends NegotiationOption {
    private String label = "Due Date";
    private boolean skipWeekends = true;
	
	public SetDueDaysOption(boolean required) {
		setRequired(required);
	}

	public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean getSkipWeekends() {
		return skipWeekends;
	}

	public void setSkipWeekends(boolean skipWeekends) {
		this.skipWeekends = skipWeekends;
	}
}
