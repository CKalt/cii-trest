package com.cii.model.config;

public class SetOtherDateOption extends NegotiationOption {
    private String label = "Date";
    private boolean requireFutureDate = false;
    private String dateParam = "otherDate";

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

    public String getDateParam() {
        return dateParam;
    }

    public void setDateParam(String dateParam) {
        this.dateParam = dateParam;
    }
}
