package com.cii.model.config;

import java.util.List;

public class PaymentPlanAndCommunityServiceOption extends NegotiationOption{
    private List<String> frequencies;
    
    public List<String> getFrequencies() {
        return frequencies;
    }

    public void setFrequencies(List<String> frequencies) {
        this.frequencies = frequencies;
    }
}
