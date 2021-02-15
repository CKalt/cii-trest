package com.cii.question;

import java.util.ArrayList;
import java.util.List;

public class AnswerSection {
    private String id;
    private List<AnswerPage> pages;
    
    public List<AnswerPage> getPages() {
        return pages;
    }

    public void setPages(List<AnswerPage> answerPages) {
        this.pages = answerPages;
    }

    public String getId() {
        return id;
    }

    public void setId(String sectionId) {
        this.id = sectionId;
    }
}
