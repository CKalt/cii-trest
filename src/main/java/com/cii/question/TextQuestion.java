package com.cii.question;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class TextQuestion extends Question {
    @JsonIgnore
    public TextQuestion getTextQuestion() {
        return this;
    }
}
