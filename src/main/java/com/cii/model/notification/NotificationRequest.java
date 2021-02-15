package com.cii.model.notification;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class NotificationRequest {

	@Id
	private String id;
	private String urlKey;
	private String dln;
	private String dlState;
    private String lpn;
    private String lpState;
	private Date dob;
	private String caseType;
	private String email;
	private String phone;
	
	private Date createDate;
	private NotificationRequestStatus status;
	private Date sent;

	public String getCaseType() {
		return caseType;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public Date getSent() {
		return sent;
	}
	public void setSent(Date sent) {
		this.sent = sent;
	}
	
	public NotificationRequestStatus getStatus() {
		return status;
	}

	public void setStatus(NotificationRequestStatus status) {
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getUrlKey() {
		return urlKey;
	}

	public void setUrlKey(String urlKey) {
		this.urlKey = urlKey;
	}

	public String getDln() {
		return dln;
	}

	public void setDln(String dln) {
		this.dln = dln.toUpperCase();
	}

	public String getDlState() {
		return dlState;
	}

	public void setDlState(String dlState) {
		this.dlState = dlState;
	}

	public String getLpn() {
        return lpn;
    }

    public void setLpn(String lpn) {
        this.lpn = lpn;
    }

    public String getLpState() {
        return lpState;
    }

    public void setLpState(String lpState) {
        this.lpState = lpState;
    }

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
