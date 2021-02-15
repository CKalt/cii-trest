package com.cii.question;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PhoneQuestion extends Question {
    @JsonIgnore
    public PhoneQuestion getPhoneQuestion() {
        return this;
    }

}
