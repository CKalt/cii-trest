package com.cii.model.config;

import java.math.BigDecimal;

public class SetBondAmountActionListener extends ActionListener {
    private BigDecimal amount;
    private boolean isFixed = true;
    private String label = "";
    
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean getIsFixed() {
        return isFixed;
    }

    public void setIsFixed(boolean isFixed) {
        this.isFixed = isFixed;
    }
}
