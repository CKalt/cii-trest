package com.cii.question;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class NameQuestion extends Question {
    @JsonIgnore
    public NameQuestion getNameQuestion() {
        return this;
    }
}
