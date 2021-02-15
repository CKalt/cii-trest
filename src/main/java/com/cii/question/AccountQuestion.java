package com.cii.question;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AccountQuestion extends Question {
    private String name;

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @JsonIgnore
    public AccountQuestion getAccountQuestion(){
        return this;
    }
}
