package com.cii.model.payment;

import com.cii.jwt.JwtClaim;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PaymentStub {
    private String partyType;
    private String status;
    private String transactionId;
    private String url;
    private String property;
    private BigDecimal amount;
    private BigDecimal claimMinimum;
    private String returnStatus;
    private String toStateId;
    private boolean paid;
    private boolean useMatterhornGuid;
    private boolean useMatterhornPayee;
    private boolean showInModal;
    private boolean useHcsPayments;
    private List<String> approvalStatus;
    private List<String> approvalText;
    private Date transactionIdCreated;
    private JwtClaim returnToken;
    private boolean subCasePayment;

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public BigDecimal getClaimMinimum() {
        return claimMinimum;
    }

    public void setClaimMinimum(BigDecimal claimMinimum) {
        this.claimMinimum = claimMinimum;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public boolean isUseMatterhornGuid() {
        return useMatterhornGuid;
    }

    public void setUseMatterhornGuid(boolean useMatterhornGuid) {
        this.useMatterhornGuid = useMatterhornGuid;
    }

    public boolean isUseMatterhornPayee() {
        return useMatterhornPayee;
    }

    public void setUseMatterhornPayee(boolean useMatterhornPayee) {
        this.useMatterhornPayee = useMatterhornPayee;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getToStateId() {
        return toStateId;
    }

    public void setToStateId(String toStateId) {
        this.toStateId = toStateId;
    }

    public boolean isShowInModal() {
        return showInModal;
    }

    public void setShowInModal(boolean showInModal) {
        this.showInModal = showInModal;
    }

    public boolean isUseHcsPayments() {
        return useHcsPayments;
    }

    public void setUseHcsPayments(boolean useHcsPayments) {
        this.useHcsPayments = useHcsPayments;
    }

    public List<String> getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(List<String> approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public List<String> getApprovalText() {
        return approvalText;
    }

    public void setApprovalText(List<String> approvalText) {
        this.approvalText = approvalText;
    }

    public Date getTransactionIdCreated() {
        return transactionIdCreated;
    }

    public void setTransactionIdCreated(Date transactionIdCreated) {
        this.transactionIdCreated = transactionIdCreated;
    }

    public JwtClaim getReturnToken() {
        return returnToken;
    }

    public void setReturnToken(JwtClaim returnToken) {
        this.returnToken = returnToken;
    }

    public boolean isSubCasePayment() {
        return subCasePayment;
    }

    public void setSubCasePayment(boolean subCasePayment) {
        this.subCasePayment = subCasePayment;
    }
}

