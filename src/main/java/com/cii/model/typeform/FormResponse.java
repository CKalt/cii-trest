package com.cii.model.typeform;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy.class)
public class FormResponse {
    @SerializedName("form_id")
    private String formId;
    private String token;
    private String landedAt;
    private String submittedAt;
    private Hidden hidden;
    private Definition definition;
    private List<Answer> answers;
}
