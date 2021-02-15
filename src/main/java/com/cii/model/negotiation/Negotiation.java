package com.cii.model.negotiation;

import com.cii.jwt.JwtClaim;
import com.cii.model.config.NegotiationOptionValues;
import com.cii.model.incident.Incident;
import com.cii.model.payment.PaymentStub;
import com.cii.model.sos.SosResponse;
import com.cii.question.QuestionAnswers;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class Negotiation {
  
    @Id
    protected String id;
    protected String ipAddress;
    protected String userAgent;
    private Date createDate;
    private Date updateDate;
    private String handle;
    protected String email;
    protected String phone;
    protected List<NegotiationParty> parties;
    private String urlKey;
    protected String workflowStateId;
    protected Incident incident;
    protected SosResponse dmvInfo;
    protected String caseType;
    private JwtClaim defendantToken;
    private JwtClaim paymentToken;
    private boolean exported;
    protected String caseSubType;
    private NegotiationOptionValues optionValues;

    private List<PaymentStub> payments;
    
    private Boolean approveRecommended = null;

    // NOTE: For Judges - null = no approval, true = approved, false = rejected
    private Boolean approved = null;

    // NOTE: For Defendants - null = not accepted/rejected, true = accepted,
    // false = rejected
    private Boolean accepted = null;

    private boolean closed;
    
    private String configurationId;
    private QuestionAnswers questionAnswers;

    private List<FormContainer> formList;
    private List<PartyContainer> partyList;

    @Transient
    private boolean hasUnreadMessages = false;

    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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

    public String getCaseSubType() {
        return caseSubType;
    }

    public void setCaseSubType(String childCaseType) {
        this.caseSubType = childCaseType;
    }

    public Incident getIncident() {
    	return incident;
    }

    public void setIncident(Incident incident) {
        this.incident = incident;
    }

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Boolean getApproveRecommended() {
        return approveRecommended;
    }

    public void setApproveRecommended(Boolean approveRecommended) {
        this.approveRecommended = approveRecommended;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public String getWorkflowStateId() {
        return workflowStateId;
    }

    public void setWorkflowStateId(String workflowStateId) {
        this.workflowStateId = workflowStateId;
    }

    public NegotiationOptionValues getOptionValues() {
        return optionValues;
    }

    public void setOptionValues(NegotiationOptionValues values) {
        this.optionValues = values;
    }

    public SosResponse getDmvInfo() {
        return dmvInfo;
    }

    public void setDmvInfo(SosResponse dmvInfo) {
        this.dmvInfo = dmvInfo;
    }

    public QuestionAnswers getQuestionAnswers() {
        return questionAnswers;
    }

    public void setQuestionAnswers(QuestionAnswers questionnaireAnswers) {
        this.questionAnswers = questionnaireAnswers;
    }
    
    public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public boolean getClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	public List<NegotiationParty> getParties() {
		return parties;
	}

	public void setParties(List<NegotiationParty> parties) {
		this.parties = parties;
	}
	
	public boolean getHasUnreadMessages() {
		return hasUnreadMessages;
	}

	public void setHasUnreadMessages(boolean hasUnreadMessages) {
		this.hasUnreadMessages = hasUnreadMessages;
	}

    public List<FormContainer> getFormList() { return this.formList; }

    public void setFormList(List<FormContainer> formList) { this.formList = formList; }

    public List<PartyContainer> getPartyList() { return this.partyList; }

    public void setPartyList(List<PartyContainer> partyList) { this.partyList = partyList; }

    public List<PaymentStub> getPayments() {
        return payments;
    }

    public void setPayments(List<PaymentStub> payments) {
        this.payments = payments;
    }

    public JwtClaim getDefendantToken() {
        return defendantToken;
    }

    public void setDefendantToken(JwtClaim defendantToken) {
        this.defendantToken = defendantToken;
    }

    public boolean isExported() {
        return exported;
    }

    public void setExported(boolean exported) {
        this.exported = exported;
    }

    public JwtClaim getPaymentToken() {
        return paymentToken;
    }

    public void setPaymentToken(JwtClaim paymentToken) {
        this.paymentToken = paymentToken;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }
}
