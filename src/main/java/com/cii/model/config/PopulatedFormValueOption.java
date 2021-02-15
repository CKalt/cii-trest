package com.cii.model.config;

import lombok.Data;

@Data
public class PopulatedFormValueOption extends NegotiationOption {
    private String label;
    private String fieldName;
    private String value;
    private String propertyName;
    private Boolean useNegotiationData = false;
    private Boolean mapOptionValues = false;
    private Boolean mapIncidentValues = false;
    private Boolean mapSubIncidentValues = false;
    private Boolean mapTopLevelNegotiation;
    private Boolean useRole = false;
    private Boolean useOther = false;
    private String partyType;
    private int userIndex;
}
