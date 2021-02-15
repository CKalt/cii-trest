package com.cii.model.structurednegotiation;

import java.math.BigDecimal;
import java.util.Date;

public class ClaimantProposal {
    private BigDecimal goal;
    private BigDecimal minimum;
    private Date submitted;

    public BigDecimal getGoal() {
        return goal;
    }

    public void setGoal(BigDecimal goal) {
        this.goal = goal;
    }

    public BigDecimal getMinimum() {
        return minimum;
    }

    public void setMinimum(BigDecimal minimum) {
        this.minimum = minimum;
    }

    public Date getSubmitted() {
        return submitted;
    }

    public void setSubmitted(Date submitted) {
        this.submitted = submitted;
    }
}
