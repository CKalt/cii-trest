package com.cii.model.config;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrafficOffer {
	private String description;
	private BigDecimal fine;
	private Integer points;
	private String stateCode;
	private String localCode;
	private String caption;
	private BigDecimal surchargeAmount;
	private BigDecimal courtCostsAmount;
	
	public void setPoints(Integer points) {
		this.points = points;
	}

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
	
	public BigDecimal getFine() {
		return fine;
	}
	
	public void setFine(BigDecimal fine) {
		this.fine = fine;
	}
	
	public Integer getPoints() {
		return points;
	}
	
	public String getStateCode() {
		return stateCode;
	}
	
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	
	public String getLocalCode() {
		return localCode;
	}
	
	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}

	public BigDecimal getSurchargeAmount() {
		return surchargeAmount;
	}

	public void setSurchargeAmount(BigDecimal surchargeAmount) {
		this.surchargeAmount = surchargeAmount;
	}

	public BigDecimal getCourtCostsAmount() {
		return courtCostsAmount;
	}

	public void setCourtCostsAmount(BigDecimal courtCostsAmount) {
		this.courtCostsAmount = courtCostsAmount;
	}
}
