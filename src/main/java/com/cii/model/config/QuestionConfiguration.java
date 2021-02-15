package com.cii.model.config;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;

import com.cii.question.QuestionSection;
import com.cii.question.calculation.Calculation;
import com.cii.question.calculation.CalculationResult;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuestionConfiguration {
    @Id
    private String id;
    private String configurationId;
    private Date createDate;
    private String name;
    private boolean allowResubmission;
    private List<QuestionSection> sections;
    private List<Calculation> calculations;
    private List<CalculationResult> summaryPage;
    private Map<String, List<String>> access;

    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<QuestionSection> getSections() {
        return sections;
    }

    public void setSections(List<QuestionSection> questionSections) {
        this.sections = questionSections;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Calculation> getCalculations() {
        return calculations;
    }

    public void setCalculations(List<Calculation> calculations) {
        this.calculations = calculations;
    }

    public List<CalculationResult> getSummaryPage() {
        return summaryPage;
    }

    public void setSummaryPage(List<CalculationResult> summaryPage) {
        this.summaryPage = summaryPage;
    }

    public boolean isAllowResubmission() {
        return allowResubmission;
    }

    public void setAllowResubmission(boolean allowResubmission) {
        this.allowResubmission = allowResubmission;
    }

    public Map<String, List<String>> getAccess() {
        return access;
    }

    public void setAccess(Map<String, List<String>> access) {
        this.access = access;
    }
}
