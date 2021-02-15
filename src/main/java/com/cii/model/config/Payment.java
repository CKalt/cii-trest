package com.cii.model.config;

import java.math.BigDecimal;
import java.util.List;

public class Payment {
    private List<String> partyTypes;
    private String status;
    private BigDecimal claimMinimum;
    private BigDecimal claimMaximum;
    private BigDecimal amount;
    private String description;
    private String returnStatus;
    private String property;
    private String toStateId;
    private boolean useOptionValue;
    private boolean useAmountDue;
    private String optionValue;
    private boolean useOfferFine;
    private boolean useMatterhornPayee;
    private boolean useHcsPayments = false;
    private boolean showInModal;
    private String url;

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

    public List<String> getPartyTypes() {
        return partyTypes;
    }

    public void setPartyTypes(List<String> partyTypes) {
        this.partyTypes = partyTypes;
    }

    public BigDecimal getClaimMinimum() {
        return claimMinimum;
    }

    public void setClaimMinimum(BigDecimal claimMinimum) {
        this.claimMinimum = claimMinimum;
    }

    public BigDecimal getClaimMaximum() {
        return claimMaximum;
    }

    public void setClaimMaximum(BigDecimal claimMaximum) {
        this.claimMaximum = claimMaximum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isUseOptionValue() {
        return useOptionValue;
    }

    public void setUseOptionValue(boolean useOptionValue) {
        this.useOptionValue = useOptionValue;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public boolean isUseOfferFine() {
        return useOfferFine;
    }

    public void setUseOfferFine(boolean useOfferFine) {
        this.useOfferFine = useOfferFine;
    }

    public boolean isUseAmountDue() {
        return useAmountDue;
    }

    public void setUseAmountDue(boolean useAmountDue) {
        this.useAmountDue = useAmountDue;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
