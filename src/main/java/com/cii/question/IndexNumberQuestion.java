package com.cii.question;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class IndexNumberQuestion  extends Question {
    @JsonIgnore
    public IndexNumberQuestion getIndexNumberQuestion() {
        return this;
    }
}
