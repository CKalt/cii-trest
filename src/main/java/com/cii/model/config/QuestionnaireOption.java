package com.cii.model.config;

public class QuestionnaireOption extends NegotiationOption{
    private String completedLabel = "";
    private String buttonText = "";
    private String notCompletedLabel = "";
    private String questionConfigurationId = "";
    private String answerSetName = "";
    private boolean allowResubmission;
    private int index;

    public String getCompletedLabel() {
        return completedLabel;
    }

    public void setCompletedLabel(String formCompletedLabel) {
        this.completedLabel = formCompletedLabel;
    }

    public String getNotCompletedLabel() {
        return notCompletedLabel;
    }

    public void setNotCompletedLabel(String formNotCompletedLabel) {
        this.notCompletedLabel = formNotCompletedLabel;
    }

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getQuestionConfigurationId() {
		return questionConfigurationId;
	}

	public void setQuestionConfigurationId(String questionConfigurationId) {
		this.questionConfigurationId = questionConfigurationId;
	}

	public String getAnswerSetName() {
		return answerSetName;
	}

	public void setAnswerSetName(String answerSetName) {
		this.answerSetName = answerSetName;
	}

	public String getButtonText() {
		return buttonText;
	}

	public void setButtonText(String buttonText) {
		this.buttonText = buttonText;
	}

    public boolean isallowResubmission() {
        return allowResubmission;
    }

    public void setallowResubmission(boolean allowResubmission) {
        this.allowResubmission = allowResubmission;
    }
}
