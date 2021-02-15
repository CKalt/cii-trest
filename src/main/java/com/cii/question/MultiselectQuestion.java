package com.cii.question;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MultiselectQuestion extends Question {
    private List<QuestionOption> options;

    @Override
    public List<QuestionOption> getOptions() {
        return options;
    }

    @Override
    public void setOptions(List<QuestionOption> options) {
        this.options = options;
    }

    @JsonIgnore
    public MultiselectQuestion getMultiselectQuestion() {
        return this;
    }
}
