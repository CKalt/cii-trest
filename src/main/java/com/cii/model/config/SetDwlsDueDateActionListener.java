package com.cii.model.config;

public class SetDwlsDueDateActionListener extends ActionListener {
	private Integer days;
	private Integer hourOfDay;
	private Integer minuteOfHour;
	
	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Integer getHourOfDay() {
		return hourOfDay;
	}

	public void setHourOfDay(Integer hourOfDay) {
		this.hourOfDay = hourOfDay;
	}

	public Integer getMinuteOfHour() {
		return minuteOfHour;
	}

	public void setMinuteOfHour(Integer minuteOfHour) {
		this.minuteOfHour = minuteOfHour;
	}
}
