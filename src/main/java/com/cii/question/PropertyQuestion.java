package com.cii.question;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PropertyQuestion extends Question {
    @JsonIgnore
    public PropertyQuestion getPropertyQuestion() {
        return this;
    }
}
