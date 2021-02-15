package com.cii.model.structurednegotiation;

import java.math.BigDecimal;
import java.util.Date;

public class DefendantProposal {
    private BigDecimal goal;
    private BigDecimal maximum;
    private Date submitted;

    public BigDecimal getGoal() {
        return goal;
    }

    public void setGoal(BigDecimal goal) {
        this.goal = goal;
    }

    public BigDecimal getMaximum() {
        return maximum;
    }

    public void setMaximum(BigDecimal maximum) {
        this.maximum = maximum;
    }

    public Date getSubmitted() {
        return submitted;
    }

    public void setSubmitted(Date submitted) {
        this.submitted = submitted;
    }
}
