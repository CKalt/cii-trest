package com.cii.model.user;

import java.io.Serializable;

public class responseTemplate implements Serializable {
	private String name;
	private String body;
	
	public responseTemplate() {}
	
	public responseTemplate(String name_in, String body_in) {
		this.name = name_in;
		this.body = body_in;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
}
