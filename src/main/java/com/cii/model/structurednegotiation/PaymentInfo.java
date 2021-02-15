package com.cii.model.structurednegotiation;

import java.math.BigDecimal;

public class PaymentInfo {
    private BigDecimal settlement;
    private String type;
    private String plan;
    private String firstPayment;
    private Integer numberOfPayments;
    private BigDecimal eachPayment;
    private String lastPayment;
    private String defaultOption;

    public BigDecimal getSettlement() {
        return settlement;
    }

    public void setSettlement(BigDecimal settlement) {
        this.settlement = settlement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getFirstPayment() {
        return firstPayment;
    }

    public void setFirstPayment(String firstPayment) {
        this.firstPayment = firstPayment;
    }

    public Integer getNumberOfPayments() {
        return numberOfPayments;
    }

    public void setNumberOfPayments(Integer numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    public BigDecimal getEachPayment() {
        return eachPayment;
    }

    public void setEachPayment(BigDecimal eachPayment) {
        this.eachPayment = eachPayment;
    }

    public String getLastPayment() {
        return lastPayment;
    }

    public void setLastPayment(String lastPayment) {
        this.lastPayment = lastPayment;
    }

    public String getDefaultOption() {
        return defaultOption;
    }

    public void setDefaultOption(String defaultOption) {
        this.defaultOption = defaultOption;
    }
}
