package com.cii.model.conversation;

import com.cii.model.negotiation.NegotiationParty;
import com.cii.model.zoom.MeetingInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Conversation {

	@Id
	private String id;

	@Indexed
	private String negotiationId;

	private String name;
	private String placeholderMessage;
	private String initialMessage;
	private String uuid;
	private String urlKey;
	private String caseType;
	private Date createDate;

	private Date lastMessageDate;
	private List<String> roles;
	private List<String> privilegedRoles;
	private List<NegotiationParty> parties;
	private List<NegotiationParty> optionalParties;
	private Map<String, Date> readByRole;
	private Map<String, Date> readByParty;
	private Map<String, Boolean> conditions;
	private List<String> access;
	private List<String> readOnlyRoles;
	private MeetingInfo zoomMeeting;

	@Transient
	private boolean hasUnreadMessages;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUrlKey() {
		return urlKey;
	}

	public void setUrlKey(String urlKey) {
		this.urlKey = urlKey;
	}

	public String getCaseType() {
		return caseType;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastMessageDate() {
		return lastMessageDate;
	}

	public void setLastMessageDate(Date msgDate) {
		this.lastMessageDate = msgDate;
	}

	public String getPlaceholderMessage() {
		return placeholderMessage;
	}

	public void setPlaceholderMessage(String placeholderMessage) {
		this.placeholderMessage = placeholderMessage;
	}

	public String getInitialMessage() {
		return initialMessage;
	}

	public void setInitialMessage(String initialMessage) {
		this.initialMessage = initialMessage;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public List<NegotiationParty> getParties() {
		return parties;
	}

	public void setParties(List<NegotiationParty> parties) {
		this.parties = parties;
	}

	public List<NegotiationParty> getOptionalParties() {
		return optionalParties == null ? new ArrayList<NegotiationParty>() : optionalParties;
	}

	public void setOptionalParties(List<NegotiationParty> parties) {
		this.optionalParties = parties;
	}

	public Map<String, Date> getReadByRole() {
		return readByRole;
	}

	public void setReadByRole(Map<String, Date> readByRole) {
		this.readByRole = readByRole;
	}

	public Map<String, Date> getReadByParty() {
		return readByParty;
	}

	public void setReadByParty(Map<String, Date> readByParty) {
		this.readByParty = readByParty;
	}

	public boolean getHasUnreadMessages() {
		return hasUnreadMessages;
	}

	public void setHasUnreadMessages(boolean hasUnreadMessages) {
		this.hasUnreadMessages = hasUnreadMessages;
	}

	public List<String> getReadOnlyRoles() {
		return readOnlyRoles;
	}

	public void setReadOnlyRoles(List<String> readOnlyRoles) {
		this.readOnlyRoles = readOnlyRoles;
	}

	public List<String> getAccess() {
		return access;
	}

	public void setAccess(List<String> access) {
		this.access = access;
	}

	public List<String> getPrivilegedRoles() {
		return privilegedRoles;
	}

	public void setPrivilegedRoles(List<String> privilegedRoles) {
		this.privilegedRoles = privilegedRoles;
	}

	public Map<String, Boolean> getConditions() {
		return conditions;
	}

	public void setConditions(Map<String, Boolean> conditions) {
		this.conditions = conditions;
	}

	public MeetingInfo getZoomMeeting() {
		return zoomMeeting;
	}

	public void setZoomMeeting(MeetingInfo zoomMeeting) {
		this.zoomMeeting = zoomMeeting;
	}
}
