package com.cii.question;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuestionPage {
    
    private String id;
    private String name;
    private List<Question> questions;

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getId() {
        return id;
    }

    public void setId(String pageId) {
        this.id = pageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String pageName) {
        this.name = pageName;
    }
}
