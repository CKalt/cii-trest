package com.cii.model.notification;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SMSNotification extends Notification {
	public SMSNotification() {
		super();
		this.setType(MessageType.SMS);
	}
}
