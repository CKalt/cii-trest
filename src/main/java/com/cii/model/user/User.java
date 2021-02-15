package com.cii.model.user;

import java.util.*;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Transient;

@Document
public class User {
	private String id;
	@Indexed
	private String urlKey;
	private String businessName;
	private String firstname;
	private String lastname;
	private String middlename;
	
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;

	private String username;
	private String password;
	private String phone;
	private boolean isMobilePhone;
	private boolean isMobilePhoneTemporary;
	private String title;
	private boolean locked;
	private Role role;
	private String access;
	private String passwordToken;
	private Date passwordTokenExpires;
	private Date lastLogin;
	private ArrayList<responseTemplate> templates;
	private Map<String, Object> settings;

	private String temporaryUsername;
	private String temporaryPhone;

	private String phoneToken;
	private Date phoneTokenExpires;

	private String usernameToken;
	private Date usernameTokenExpires;

	private List<String> courtCodes;
	private List<String> policeAgencies;
	private List<String> caseTypes;
	private List<String> mediationCenters;
	private List<String> judgeNames;

	private List<String> partyIds;

	private String partyId;

	private String judgeName;
	private String zoomUserId;

	
	public User() {
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrlKey() {
		return urlKey;
	}

	public void setUrlKey(String urlKey) {
		this.urlKey = urlKey;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean getIsMobilePhone() {
		return isMobilePhone;
	}

	public void setIsMobilePhone(boolean isMobilePhone) {
		this.isMobilePhone = isMobilePhone;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip == null ? "" : zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		String trimmedUsername = username.trim().toLowerCase();
		this.username = trimmedUsername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordToken() {
		return passwordToken;
	}

	public void setPasswordToken(String passwordToken) {
		this.passwordToken = passwordToken;
	}

	public Date getPasswordTokenExpires() {
		return passwordTokenExpires;
	}

	public void setPasswordTokenExpires(Date passwordTokenExpires) {
		this.passwordTokenExpires = passwordTokenExpires;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}
	
	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public ArrayList<responseTemplate> getTemplates() {
		return templates;
	}

	public void setTemplates(ArrayList<responseTemplate> templates) {
		this.templates = templates;
	}
	
	public Map<String, Object> getSettings() {
		return settings;
	}

	public void setSettings(Map<String, Object> settings) {
		this.settings = settings;
	}

	public Object getSetting(String key) {
		return (settings != null) ? settings.get(key) : null;
	}
	
	public void setSetting(String key, Object value) {
		if (settings == null) {
			settings = new HashMap<String, Object>();
		}
		settings.put(key, value);
	}
	
	public String getTemporaryUsername() {
		return temporaryUsername;
	}

	public void setTemporaryUsername(String temporaryUsername) {
		this.temporaryUsername = temporaryUsername;
	}

	public String getTemporaryPhone() {
		return temporaryPhone;
	}

	public void setTemporaryPhone(String temporaryPhone) {
		this.temporaryPhone = temporaryPhone;
	}

	public String getPhoneToken() {
		return phoneToken;
	}

	public void setPhoneToken(String phoneToken) {
		this.phoneToken = phoneToken;
	}

	public Date getPhoneTokenExpires() {
		return phoneTokenExpires;
	}

	public void setPhoneTokenExpires(Date phoneTokenExpires) {
		this.phoneTokenExpires = phoneTokenExpires;
	}

	public String getUsernameToken() {
		return usernameToken;
	}

	public void setUsernameToken(String usernameToken) {
		this.usernameToken = usernameToken;
	}

	public Date getUsernameTokenExpires() {
		return usernameTokenExpires;
	}

	public void setUsernameTokenExpires(Date usernameTokenExpires) {
		this.usernameTokenExpires = usernameTokenExpires;
	}

	public boolean isMobilePhoneTemporary() {
		return isMobilePhoneTemporary;
	}

	public void setMobilePhoneTemporary(boolean mobilePhoneTemporary) {
		isMobilePhoneTemporary = mobilePhoneTemporary;
	}

	public List<String> getCourtCodes() {
		return courtCodes;
	}

	public void setCourtCodes(List<String> courtCodes) {
		this.courtCodes = courtCodes;
	}

	public List<String> getPoliceAgencies() {
		return policeAgencies;
	}

	public void setPoliceAgencies(List<String> policeAgencies) {
		this.policeAgencies = policeAgencies;
	}

	public List<String> getCaseTypes() {
		return caseTypes;
	}

	public void setCaseTypes(List<String> caseTypes) {
		this.caseTypes = caseTypes;
	}

	public List<String> getMediationCenters() {
		return mediationCenters;
	}

	public void setMediationCenters(List<String> mediationCenters) {
		this.mediationCenters = mediationCenters;
	}

	public List<String> getPartyIds() {
		return partyIds;
	}

	public void setPartyIds(List<String> partyIds) {
		this.partyIds = partyIds;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getPartyId() {
		return partyId;
	}

	public String getJudgeName() {
		return judgeName;
	}

	public void setJudgeName(String judgeName) {
		this.judgeName = judgeName;
	}

	public List<String> getJudgeNames() {
		return judgeNames;
	}

	public void setJudgeNames(List<String> judgeNames) {
		this.judgeNames = judgeNames;
	}

	public String getZoomUserId() {
		return zoomUserId;
	}

	public void setZoomUserId(String zoomUserId) {
		this.zoomUserId = zoomUserId;
	}
}
