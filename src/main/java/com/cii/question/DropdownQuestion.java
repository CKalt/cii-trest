package com.cii.question;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class DropdownQuestion extends Question {
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
    public DropdownQuestion getDropdownQuestion() {
        return this;
    }
}
