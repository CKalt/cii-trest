package com.cii.model.negotiation;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class NegotiationParty {
	private String partyId;
	private String userId;
	private String type;
	private String name;
	
	public String getType() {
		return type == null ? "" : type;
	}

	public void setType(String partyType) {
		this.type = partyType.toUpperCase();
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String id) {
		this.partyId = id;
	}

	public String getName() {
		return name == null ? "" : name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
