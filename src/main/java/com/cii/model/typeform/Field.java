package com.cii.model.typeform;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy.class)
public class Field {
    private String id;
    private String title;
    private String type;
    private String ref;
//
// properties member being left out of this model for now
// because it is currently an empty class and causes 
// exception serializing an empty bean.
//
//    private Properties properties; 
    private List<Choice> choices = null;
    private Boolean allowOtherChoice;
    private Boolean allowMultipleSelections;
}
