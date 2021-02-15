package com.cii.question;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;

public class AmountQuestion extends Question {
    private String name;
    private BigDecimal limitMinimum;
    private BigDecimal limitMaximum;
    
    @JsonIgnore
    public AmountQuestion getAmountQuestion() {
        return this;
    }

    public BigDecimal getLimitMinimum() {
        return limitMinimum;
    }

    public void setLimitMinimum(BigDecimal limitMinimum) {
        this.limitMinimum = limitMinimum;
    }

    public BigDecimal getLimitMaximum() {
        return limitMaximum;
    }

    public void setLimitMaximum(BigDecimal limitMaximum) {
        this.limitMaximum = limitMaximum;
    }
}
