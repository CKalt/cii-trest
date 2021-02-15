package com.cii.question;

import java.util.ArrayList;

public class AnswerPage {
    private String id;
    private ArrayList<Answer> answers;

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    public String getId() {
        return id;
    }

    public void setId(String pageId) {
        this.id = pageId;
    }
}
