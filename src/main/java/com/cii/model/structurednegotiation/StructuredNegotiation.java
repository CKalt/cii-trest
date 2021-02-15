package com.cii.model.structurednegotiation;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Document
public class StructuredNegotiation {
    @Id
    private String id;
    private String caseNumber;

    private StructuredNegotiationParty claimant;
    private StructuredNegotiationParty defendant;

    private List<ClaimantProposal> claimantProposals;
    private List<DefendantProposal> defendantProposals;

    private String status;
    private String negotiationId;
    private String county;
    private String urlKey;

    private String agreement;
    private String roundFailureMsg;
    private PaymentInfo paymentInfo;
    private String roundResultText;
    private BigDecimal calculatedProposal;

    private String claimantSignature;
    private String defendantSignature;

    private boolean defendantSigned;
    private boolean claimantSigned;
    private Date claimantSignedDate;
    private Date defendantSignedDate;
    private String hashString;

    private Integer round;

    private BigDecimal claimAmount;

    private boolean calculate;

    private boolean returnFromConversation;

    private List<PaymentItem> negotiationPaymentInfo;

    private boolean viewRequest;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public List<ClaimantProposal> getClaimantProposals() {
        return claimantProposals;
    }

    public void setClaimantProposals(List<ClaimantProposal> claimantProposals) {
        this.claimantProposals = claimantProposals;
    }

    public List<DefendantProposal> getDefendantProposals() {
        return defendantProposals;
    }

    public void setDefendantProposals(List<DefendantProposal> defendantProposals) {
        this.defendantProposals = defendantProposals;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRoundFailureMsg() {
        return roundFailureMsg;
    }

    public void setRoundFailureMsg(String roundFailureMsg) {
        this.roundFailureMsg = roundFailureMsg;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public String getRoundResultText() {
        return roundResultText;
    }

    public void setRoundResultText(String roundResultText) {
        this.roundResultText = roundResultText;
    }

    public BigDecimal getCalculatedProposal() {
        return calculatedProposal;
    }

    public void setCalculatedProposal(BigDecimal calculatedProposal) {
        this.calculatedProposal = calculatedProposal;
    }

    public String getNegotiationId() {
        return negotiationId;
    }

    public void setNegotiationId(String negotiationId) {
        this.negotiationId = negotiationId;
    }

    public StructuredNegotiationParty getDefendant() {
        return defendant;
    }

    public void setDefendant(StructuredNegotiationParty defendant) {
        this.defendant = defendant;
    }

    public StructuredNegotiationParty getClaimant() {
        return claimant;
    }

    public void setClaimant(StructuredNegotiationParty claimant) {
        this.claimant = claimant;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    public boolean isDefendantSigned() {
        return defendantSigned;
    }

    public void setDefendantSigned(boolean defendantSigned) {
        this.defendantSigned = defendantSigned;
    }

    public boolean isClaimantSigned() {
        return claimantSigned;
    }

    public void setClaimantSigned(boolean claimantSigned) {
        this.claimantSigned = claimantSigned;
    }

    public String getClaimantSignature() {
        return claimantSignature;
    }

    public void setClaimantSignature(String claimantSignature) {
        this.claimantSignature = claimantSignature;
    }

    public String getDefendantSignature() {
        return defendantSignature;
    }

    public void setDefendantSignature(String defendantSignature) {
        this.defendantSignature = defendantSignature;
    }

    public Date getClaimantSignedDate() {
        return claimantSignedDate;
    }

    public void setClaimantSignedDate(Date claimantSignedDate) {
        this.claimantSignedDate = claimantSignedDate;
    }

    public Date getDefendantSignedDate() {
        return defendantSignedDate;
    }

    public void setDefendantSignedDate(Date defendantSignedDate) {
        this.defendantSignedDate = defendantSignedDate;
    }

    public String getHashString() {
        return hashString;
    }

    public void setHashString(String hashString) {
        this.hashString = hashString;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public boolean isCalculate() {
        return calculate;
    }

    public void setCalculate(boolean calculate) {
        this.calculate = calculate;
    }

    public String getUrlKey() {
        return urlKey;
    }

    public void setUrlKey(String urlKey) {
        this.urlKey = urlKey;
    }

    public BigDecimal getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(BigDecimal claimAmount) {
        this.claimAmount = claimAmount;
    }

    public boolean isReturnFromConversation() {
        return returnFromConversation;
    }

    public void setReturnFromConversation(boolean returnFromConversation) {
        this.returnFromConversation = returnFromConversation;
    }

    public List<PaymentItem> getNegotiationPaymentInfo() {
        return negotiationPaymentInfo;
    }

    public void setNegotiationPaymentInfo(List<PaymentItem> negotiationPaymentInfo) {
        this.negotiationPaymentInfo = negotiationPaymentInfo;
    }

    public boolean isViewRequest() {
        return viewRequest;
    }

    public void setViewRequest(boolean viewRequest) {
        this.viewRequest = viewRequest;
    }
}
