package com.cii.question;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuestionSection {
    
    private String id;
    private String name;
    private List<QuestionPage> pages;

    public List<QuestionPage> getPages() {
        return pages;
    }

    public void setPages(List<QuestionPage> questionnairePages) {
        this.pages = questionnairePages;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String sectionName) {
        this.name = sectionName;
    }

}
