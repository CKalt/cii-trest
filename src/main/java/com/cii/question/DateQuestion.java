package com.cii.question;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class DateQuestion extends Question {
	
	private boolean requireFutureDate = false;

    @JsonIgnore
    public DateQuestion getDateQuestion() {
        return this;
    }

	public boolean getRequireFutureDate() {
		return requireFutureDate;
	}

	public void setRequireFutureDate(boolean date) {
		this.requireFutureDate = date;
	}
}
