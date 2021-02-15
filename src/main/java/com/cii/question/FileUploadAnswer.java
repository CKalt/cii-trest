package com.cii.question;

import com.cii.model.config.AnswerDTO;

import java.util.List;
import java.util.Map;

public class FileUploadAnswer extends Answer {
	private List<String> fileIds;
	private AnswerDTO answerDTO;
	private FileUploadQuestion fileUploadQuestion;

	private Map<String, List<String>> access;

	public List<String> getFileIds() {
		return fileIds;
	}

	public void setFileIds(List<String> fileIds) {
		this.fileIds = fileIds;
	}

	public Map<String, List<String>> getAccess() {
		return access;
	}

	public void setAccess(Map<String, List<String>> access) {
		this.access = access;
	}

	public AnswerDTO getAnswerDTO() {
		return answerDTO;
	}

	public void setAnswerDTO(AnswerDTO answerDTO) {
		this.answerDTO = answerDTO;
	}

	public FileUploadQuestion getFileUploadQuestion() {
		return fileUploadQuestion;
	}

	public void setFileUploadQuestion(FileUploadQuestion fileUploadQuestion) {
		this.fileUploadQuestion = fileUploadQuestion;
	}
}



