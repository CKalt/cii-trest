package com.cii.model.conversation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Message {

	@Id
	private String id;
	
	@Indexed
	private String conversationId;
	
	private String negotiationId;
	private String userId;
	private List<Map<String, String>> files;
	private String urlKey;
	private Date createDate;
	private String message;
	
	@Transient
	private boolean isThisUser;
	
	@Transient
	private String userNameBubble;
	
	@Transient
	private String userName;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNegotiationId() {
		return negotiationId;
	}

	public void setNegotiationId(String negotiationId) {
		this.negotiationId = negotiationId;
	}

	public String getUrlKey() {
		return urlKey;
	}

	public void setUrlKey(String urlKey) {
		this.urlKey = urlKey;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<Map<String, String>> getFiles() {
		return files;
	}

	public void setFiles(List<Map<String, String>> files) {
		this.files = files;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean getIsThisUser() {
		return isThisUser;
	}

	public void setIsThisUser(boolean isThisUser) {
		this.isThisUser = isThisUser;
	}

	public String getUserNameBubble() {
		return userNameBubble;
	}

	public void setUserNameBubble(String userName) {
		this.userNameBubble = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
