package com.cii.question.calculation;

import java.util.List;

public abstract class Calculation {
    String result;
    List<String> operands;
    
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<String> getOperands() {
        return operands;
    }

    public void setOperands(List<String> operands) {
        this.operands = operands;
    }
}
