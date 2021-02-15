package com.cii.question;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AddressQuestion extends Question {
    @JsonIgnore
    public AddressQuestion getAddressQuestion() {
        return this;
    }
}
