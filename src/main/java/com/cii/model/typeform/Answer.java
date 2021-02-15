package com.cii.model.typeform;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy.class)
public class Answer {
    private String type;
    private Integer number;
    private Field field;
    private Choice choice;
    @SerializedName("boolean")
    private Boolean _boolean;
    private String text;
    private Choices choices;
}
