package com.cii.question;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class TextAreaQuestion extends Question {
    @JsonIgnore
    public TextAreaQuestion getTextAreaQuestion() {
        return this;
    }
}
