package com.cii.model.config;

import java.util.List;
import java.util.Map;

public class AddCaseDetailsHistoryItemActionListener extends ActionListener {
	private Map<String, List<String>> access;

	public Map<String, List<String>> getAccess() {
		return access;
	}

	public void setAccess(Map<String, List<String>> access) {
		this.access = access;
	}
}
