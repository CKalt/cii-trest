package com.cii.question;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CheckboxAnswer extends Answer {
    private boolean isChecked;
}
