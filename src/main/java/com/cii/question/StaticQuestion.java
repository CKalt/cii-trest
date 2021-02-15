package com.cii.question;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import java.util.Map;

public class StaticQuestion extends Question {
    private boolean useOptionValueMap;
    private String propertyName;
    private List<Map<String, String>> chargeInstructions;
    private boolean displayChargesTable;

    @JsonIgnore
    public StaticQuestion getStaticQuestion() {
        return this;
    }

    public boolean getUseOptionValueMap() {
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

    public List<Map<String, String>> getChargeInstructions() {
        return chargeInstructions;
    }

    public void setChargeInstructions(List<Map<String, String>> chargeInstructions) {
        this.chargeInstructions = chargeInstructions;
    }

    public boolean isDisplayChargesTable() {
        return displayChargesTable;
    }

    public void setDisplayChargesTable(boolean displayChargesTable) {
        this.displayChargesTable = displayChargesTable;
    }

}
