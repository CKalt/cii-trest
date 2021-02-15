package com.cii.question;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class DlnQuestion extends Question {
    @JsonIgnore
    public DlnQuestion getDlnQuestion() {
        return this;
    }
}
