package com.cii.model.court;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CaseTypeConfig {
	private List<String> subTypes = new ArrayList<>();
	private Date startDate;
	private Date endDate;
	private String caption;
	
	public CaseTypeConfig () {
	}

	public List<String> getSubTypes() {
		return subTypes;
	}

	public void setSubTypes(List<String> subTypes) {
		this.subTypes = subTypes;
	}
	
	public void addSubType(String subType) {
		this.subTypes.add(subType);
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public boolean isValid() {
        Calendar now = Calendar.getInstance();
        Date today = now.getTime();
        
		boolean isExpired;     
        if (endDate == null) {
			isExpired = false;
		}
		else {
			isExpired = today.after(endDate);
		}
        
        boolean isStarted = false;
        if (startDate == null) {
        	isStarted = true;
        }
        else {
        	isStarted = today.after(startDate);
        }
		
        return !isExpired && isStarted;
	}
	
}
