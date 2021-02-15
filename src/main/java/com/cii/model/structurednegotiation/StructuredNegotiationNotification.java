package com.cii.model.structurednegotiation;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StructuredNegotiationNotification {
    @Id
    private String id;
    private String claimantEmailSubject;
    private String claimantEmailMessage;
    private String claimantSMSMessage;
    private String defendantEmailSubject;
    private String defendantEmailMessage;
    private String defendantSMSMessage;
    private String claimantScreenMessage;
    private String defendantScreenMessage;
    private String historyItemText;
    private boolean sendDefendantMessage;
    private boolean sendClaimantMessage;
    private boolean sendCourtMessage;
    private String courtGroupEmailAddress;
    private String courtGroupEmailSubject;
    private String courtGroupEmailMessage;
    private String status;
    private String urlKey;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClaimantEmailMessage() {
        return claimantEmailMessage;
    }

    public void setClaimantEmailMessage(String claimantEmailMessage) {
        this.claimantEmailMessage = claimantEmailMessage;
    }

    public String getClaimantSMSMessage() {
        return claimantSMSMessage;
    }

    public void setClaimantSMSMessage(String claimantSMSMessage) {
        this.claimantSMSMessage = claimantSMSMessage;
    }

    public String getDefendantEmailMessage() {
        return defendantEmailMessage;
    }

    public void setDefendantEmailMessage(String defendantEmailMessage) {
        this.defendantEmailMessage = defendantEmailMessage;
    }

    public String getDefendantSMSMessage() {
        return defendantSMSMessage;
    }

    public void setDefendantSMSMessage(String defendantSMSMessage) {
        this.defendantSMSMessage = defendantSMSMessage;
    }

    public boolean isSendDefendantMessage() {
        return sendDefendantMessage;
    }

    public void setSendDefendantMessage(boolean sendDefendantMessage) {
        this.sendDefendantMessage = sendDefendantMessage;
    }

    public boolean isSendClaimantMessage() {
        return sendClaimantMessage;
    }

    public void setSendClaimantMessage(boolean sendClaimantMessage) {
        this.sendClaimantMessage = sendClaimantMessage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrlKey() {
        return urlKey;
    }

    public void setUrlKey(String urlKey) {
        this.urlKey = urlKey;
    }

    public String getClaimantEmailSubject() {
        return claimantEmailSubject;
    }

    public void setClaimantEmailSubject(String claimantEmailSubject) {
        this.claimantEmailSubject = claimantEmailSubject;
    }

    public String getDefendantEmailSubject() {
        return defendantEmailSubject;
    }

    public void setDefendantEmailSubject(String defendantEmailSubject) {
        this.defendantEmailSubject = defendantEmailSubject;
    }

    public String getDefendantScreenMessage() {
        return defendantScreenMessage;
    }

    public void setDefendantScreenMessage(String defendantScreenMessage) {
        this.defendantScreenMessage = defendantScreenMessage;
    }

    public String getClaimantScreenMessage() {
        return claimantScreenMessage;
    }

    public void setClaimantScreenMessage(String claimantScreenMessage) {
        this.claimantScreenMessage = claimantScreenMessage;
    }

    public String getHistoryItemText() {
        return historyItemText;
    }

    public void setHistoryItemText(String historyItemText) {
        this.historyItemText = historyItemText;
    }

    public boolean isSendCourtMessage() {
        return sendCourtMessage;
    }

    public void setSendCourtMessage(boolean sendCourtMessage) {
        this.sendCourtMessage = sendCourtMessage;
    }

    public String getCourtGroupEmailAddress() {
        return courtGroupEmailAddress;
    }

    public void setCourtGroupEmailAddress(String courtGroupEmailAddress) {
        this.courtGroupEmailAddress = courtGroupEmailAddress;
    }

    public String getCourtGroupEmailSubject() {
        return courtGroupEmailSubject;
    }

    public void setCourtGroupEmailSubject(String courtGroupEmailSubject) {
        this.courtGroupEmailSubject = courtGroupEmailSubject;
    }

    public String getCourtGroupEmailMessage() {
        return courtGroupEmailMessage;
    }

    public void setCourtGroupEmailMessage(String courtGroupEmailMessage) {
        this.courtGroupEmailMessage = courtGroupEmailMessage;
    }
}
