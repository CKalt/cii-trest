package com.cii.model.config;

public class SetDueDateActionListener extends ActionListener {
	private String dateParam;
	private boolean reset = false;
	private int days;
	private int hourOfDay;
	private int minuteOfHour;
	
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
	
	public String getDateParam() {
		return dateParam;
	}
	
	public void setDateParam(String dateParam) {
		this.dateParam = dateParam;
	}

	public boolean getReset() {
		return reset;
	}

	public void setReset(boolean reset) {
		this.reset = reset;
	}
}
