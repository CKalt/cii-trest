package com.cii.model.config;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class StaticContentOption extends NegotiationOption {
	private String content = "";
	private boolean displayChargesTable;
	private boolean displayOutcome;
	private boolean useNegotiationData;
	private boolean useOptionValueMap;
	private boolean useConditional;
	private String propertyName;
	private String dateFormat;
	private String label;
	private List<Map<String, String>> chargeInstructions;
	private List<Map<String, String>> columns;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isUseNegotiationData() {
		return useNegotiationData;
	}

	public void setUseNegotiationData(boolean useNegotiationData) {
		this.useNegotiationData = useNegotiationData;
	}

	public boolean isUseOptionValueMap() {
		return useOptionValueMap;
	}

	public void setUseOptionValueMap(boolean useOptionValueMap) {
		this.useOptionValueMap = useOptionValueMap;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public boolean isUseConditional() {
		return useConditional;
	}

	public void setUseConditional(boolean useConditional) {
		this.useConditional = useConditional;
	}

	public String getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public boolean getDisplayChargesTable() {
		return displayChargesTable;
	}

	public void setDisplayChargesTable(boolean displayChargesTable) {
		this.displayChargesTable = displayChargesTable;
	}

	public List<Map<String, String>> getChargeInstructions() {
		return chargeInstructions;
	}

	public void setChargeInstructions(List<Map<String, String>> chargeInstructions) {
		this.chargeInstructions = chargeInstructions;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isDisplayOutcome() {
		return displayOutcome;
	}

	public void setDisplayOutcome(boolean displayOutcome) {
		this.displayOutcome = displayOutcome;
	}

	public List<Map<String, String>> getColumns() {
		return columns;
	}

	public void setColumns(List<Map<String, String>> columns) {
		this.columns = columns;
	}
}
