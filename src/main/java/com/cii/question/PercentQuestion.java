package com.cii.question;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PercentQuestion extends Question  {
    @JsonIgnore
    public PercentQuestion getPercentQuestion() { return this; }
}
