package com.cii.model.notification;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.cii.bean.ModelWithIdAccess;
import com.cii.model.notification.NotificationStatus;

import java.util.Date;
import java.util.List;

@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = EmailNotification.class, name = "EMAIL"),
  @JsonSubTypes.Type(value = SMSNotification.class, name = "SMS"),
})
@Document
public abstract class Notification extends ModelWithIdAccess {

	@Id
	private String id;
	private String urlKey;
	private String body;
	private String to;
	private List<String> bcc;
	private MessageType type;
	private NotificationStatus status;
	private ContentType contentType;
	private String errorMessage;

	private String negotiationId;
	
	private Date createDate;
	private Date sentDate;
	
	
	public Date getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public String getUrlKey() {
		return urlKey;
	}
	
	public void setUrlKey(String urlKey) {
		this.urlKey = urlKey;
	}
	
	public String getNegotiationId() {
		return negotiationId;
	}
	
	public void setNegotiationId(String negotiationId) {
		this.negotiationId = negotiationId;
	}
	
	public String getId() {
		return id;
	}
	
	public final void setId(String id) {
		this.id = id;
	}
	
	public final String getTo() {
		return to;
	}
	
	public final void setTo(String to) {
		this.to = to;
	}
	
	public void setType(MessageType type) {
		this.type = type;
	}

	public MessageType getType() {
		return type;
	}
	
	public final String getBody() {
		return body;
	}
	
	public final void setBody(String body) {
		this.body = body;
	}
	
	public final NotificationStatus getStatus() {
		return status;
	}
	
	public final void setStatus(NotificationStatus status) {
		this.status = status;
	}
	
	public final ContentType getContentType() {
		return contentType;
	}
	
	public final void setContentType(ContentType contentType) {
		this.contentType = contentType;
	}

	public Date getSentDate() {
		return sentDate;
	}

	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<String> getBcc() {
		return bcc;
	}

	public void setBcc(List<String> bcc) {
		this.bcc = bcc;
	}
}
