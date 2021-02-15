package com.cii.model.config;

import java.math.BigDecimal;

public class DWLSOffer {
	private String description;
	private BigDecimal fineFrom, fineTo;
	private Integer points;
	private boolean isEditable = false;
	private String caption;
	
	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public BigDecimal getFineFrom() {
		return fineFrom;
	}
	
	public void setFineFrom(BigDecimal fine) {
		this.fineFrom = fine;
	}
    
    public BigDecimal getFineTo() {
        return fineTo;
    }
    
    public void setFineTo(BigDecimal fine) {
        this.fineTo = fine;
    }

    public boolean getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(boolean isEditable) {
        this.isEditable = isEditable;
    }
}
