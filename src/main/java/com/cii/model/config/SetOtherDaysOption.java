package com.cii.model.config;

public class SetOtherDaysOption extends NegotiationOption {
    private String label = "Date";
    private String dateParam = "otherDate";
    private boolean skipWeekends = true;
	
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

	public String getDateParam() {
        return dateParam;
    }

    public void setDateParam(String dateParam) {
        this.dateParam = dateParam;
    }
}
