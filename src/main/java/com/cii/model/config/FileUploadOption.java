package com.cii.model.config;

import java.util.List;
import java.util.Map;

public class FileUploadOption extends NegotiationOption {
	private String label = "";
	private Map<String, List<String>> access;
	private boolean hasToken;
	private int index = 0;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Map<String, List<String>> getAccess() {
		return access;
	}

	public void setAccess(Map<String, List<String>> access) {
		this.access = access;
	}

	public boolean isHasToken() {
		return hasToken;
	}

	public void setHasToken(boolean hasToken) {
		this.hasToken = hasToken;
	}

	public int getIndex() {
       return this. index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
