package com.cii.model.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistoryActionListener extends ActionListener {
	private String content = "";
	private Map<String, List<String>> access;
	private String conditionalFlag;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Map<String, List<String>> getAccess() {
		return access;
	}

	public void setAccess(Map<String, List<String>> access) {
		this.access = access;
	}

	public String getConditionalFlag() {
		return conditionalFlag;
	}

	public void setConditionalFlag(String conditionalFlag) {
		this.conditionalFlag = conditionalFlag;
	}
}
