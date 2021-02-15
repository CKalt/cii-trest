package com.cii.model.config;

import java.math.BigDecimal;

public class SetPaymentPlanActionListener extends ActionListener {
	private boolean remainder;
	private BigDecimal amount;
	private int days;
	private int hourOfDay;
	private int minuteOfHour;
	private String frequency;
	
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getHourOfDay() {
		return hourOfDay;
	}

	public void setHourOfDay(int hourOfDay) {
		this.hourOfDay = hourOfDay;
	}

	public int getMinuteOfHour() {
		return minuteOfHour;
	}

	public void setMinuteOfHour(int minuteOfHour) {
		this.minuteOfHour = minuteOfHour;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
}
