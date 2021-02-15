package com.cii.model.notification;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EmailNotification extends Notification {

	private String subject;
	private boolean useCustomEmailAddress;

	public EmailNotification() {
		super();
		this.setType(MessageType.EMAIL);
	}

	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public boolean isUseCustomEmailAddress() {
		return useCustomEmailAddress;
	}

	public void setUseCustomEmailAddress(boolean useCustomEmailAddress) {
		this.useCustomEmailAddress = useCustomEmailAddress;
	}
}
