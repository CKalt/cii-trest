package com.cii.question;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class QuestionAnswers {
    @Id
    private String id;
    private String actionId;
    private String questionnaireConfigurationId;
    private Boolean questionnaireCompleted;
    private List<AnswerSection> sections;
    private Map<String, BigDecimal> results;
    
    public List<AnswerSection> getSections() {
        return sections;
    }

    public void setSections(List<AnswerSection> answerSections) {
        this.sections = answerSections;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestionnaireConfigurationId() {
        return questionnaireConfigurationId;
    }

    public void setQuestionnaireConfigurationId(String questionnaireConfigurationId) {
        this.questionnaireConfigurationId = questionnaireConfigurationId;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public Boolean getQuestionnaireCompleted() {
        return questionnaireCompleted;
    }

    public void setQuestionnaireCompleted(Boolean questionnaireCompleted) {
        this.questionnaireCompleted = questionnaireCompleted;
    }

    public Map<String, BigDecimal> getResults() {
        return results;
    }

    public void setResults(Map<String, BigDecimal> results) {
        this.results = results;
    }
}
