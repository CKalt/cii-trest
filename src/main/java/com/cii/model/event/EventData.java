package com.cii.model.event;

import com.cii.model.config.ActionListenerResult;
import com.cii.model.config.BulkWorkflowStateMove;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class EventData {
    private String className;
    private String partyType;
    private String template;
    private List<String> operands;
    private String logic;
    private String toStateId;
    private String status;
    private String content;
    private Map<String, List<String>> access;
    private String conditionalFlag;
    private ActionListenerResult result;
    private Boolean approve;
    private String templateName;
    private int offsetDays;
    private String flag;
    private String fromBucket;
    private String toBucket;
    private String toFolder;
    private String fromFolder;
    private int formIndex;
    private Date created;
    private String originalPdf;
    private String configurationId;
    private String htmlFormTemplateId;
    private String agreementName;
    private String filingStatus;
    private String type;
    private boolean showPartyInfo;
    private boolean updatePartyContainer;
    private List<String> partyTypes;
    private List<String> sendPartyNotifications;
    private BulkWorkflowStateMove bulkWorkflowStateMove;
    private Map<String, Object> data;
    private boolean sendEmail;
    private boolean sendAddress;
    private boolean sendPhone;
    private boolean override;
    private boolean pdfFormSubCaseRequest;
    private boolean partyAnswer;
    private boolean sendDataToBCC;

    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public String getHtmlFormTemplateId() {
        return htmlFormTemplateId;
    }

    public void setHtmlFormTemplateId(String htmlFormTemplateId) {
        this.htmlFormTemplateId = htmlFormTemplateId;
    }

    public String getFromBucket() {
        return fromBucket;
    }

    public void setFromBucket(String fromBucket) {
        this.fromBucket = fromBucket;
    }

    public String getToBucket() {
        return toBucket;
    }

    public void setToBucket(String toBucket) {
        this.toBucket = toBucket;
    }

    public String getToFolder() {
        return toFolder;
    }

    public void setToFolder(String toFolder) {
        this.toFolder = toFolder;
    }

    public String getFromFolder() {
        return fromFolder;
    }

    public void setFromFolder(String fromFolder) {
        this.fromFolder = fromFolder;
    }

    public int getFormIndex() {
        return formIndex;
    }

    public void setFormIndex(int formIndex) {
        this.formIndex = formIndex;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getOriginalPdf() {
        return originalPdf;
    }

    public void setOriginalPdf(String originalPdf) {
        this.originalPdf = originalPdf;
    }

    public String getDateParam() {
        return dateParam;
    }

    public void setDateParam(String dateParam) {
        this.dateParam = dateParam;
    }

    private String dateParam;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public List<String> getOperands() {
        return operands;
    }

    public void setOperands(List<String> operands) {
        this.operands = operands;
    }

    public String getToStateId() {
        return toStateId;
    }

    public void setToStateId(String toStateId) {
        this.toStateId = toStateId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLogic() {
        return logic;
    }

    public void setLogic(String logic) {
        this.logic = logic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Map<String, List<String>> getAccess() {
        return access;
    }

    public void setAccess(Map<String, List<String>> access) {
        this.access = access;
    }

    public String getConditionalFlag() {
        return conditionalFlag;
    }

    public void setConditionalFlag(String conditionalFlag) {
        this.conditionalFlag = conditionalFlag;
    }

    public ActionListenerResult getResult() {
        return result;
    }

    public void setResult(ActionListenerResult result) {
        this.result = result;
    }

    public Boolean getApprove() {
        return approve;
    }

    public void setApprove(Boolean approve) {
        this.approve = approve;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public int getOffsetDays() {
        return offsetDays;
    }

    public void setOffsetDays(int offsetDays) {
        this.offsetDays = offsetDays;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getFilingStatus() {
        return filingStatus;
    }

    public void setType(String type) { this.type = type; }

    public String getType() { return type; }

    public void setFilingStatus(String filingStatus) {
        this.filingStatus = filingStatus;
    }

    public boolean isShowPartyInfo() {
        return showPartyInfo;
    }

    public void setShowPartyInfo(boolean showPartyInfo) {
        this.showPartyInfo = showPartyInfo;
    }

    public List<String> getPartyTypes() {
        return partyTypes;
    }

    public void setPartyTypes(List<String> partyTypes) {
        this.partyTypes = partyTypes;
    }

    public boolean isUpdatePartyContainer() {
        return updatePartyContainer;
    }

    public void setUpdatePartyContainer(boolean updatePartyContainer) {
        this.updatePartyContainer = updatePartyContainer;
    }

    public BulkWorkflowStateMove getBulkWorkflowStateMove() {
        return bulkWorkflowStateMove;
    }

    public void setBulkWorkflowStateMove(BulkWorkflowStateMove bulkWorkflowStateMove) {
        this.bulkWorkflowStateMove = bulkWorkflowStateMove;
    }

    public String getAgreementName() {
        return agreementName;
    }

    public void setAgreementName(String agreementName) {
        this.agreementName = agreementName;
    }

    public Map<String, Object> getData() { return data; }

    public void setData(Map<String, Object> data) { this.data = data; }

    public boolean isSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public boolean isSendAddress() {
        return sendAddress;
    }

    public void setSendAddress(boolean sendAddress) {
        this.sendAddress = sendAddress;
    }

    public boolean isSendPhone() {
        return sendPhone;
    }

    public void setSendPhone(boolean sendPhone) {
        this.sendPhone = sendPhone;
    }

    public boolean isOverride() {
        return override;
    }

    public void setOverride(boolean override) {
        this.override = override;
    }

    public List<String> getSendPartyNotifications() {
        return sendPartyNotifications;
    }

    public void setSendPartyNotifications(List<String> sendPartyNotifications) {
        this.sendPartyNotifications = sendPartyNotifications;
    }

    public boolean isPdfFormSubCaseRequest() {
        return pdfFormSubCaseRequest;
    }

    public void setPdfFormSubCaseRequest(boolean pdfFormSubCaseRequest) {
        this.pdfFormSubCaseRequest = pdfFormSubCaseRequest;
    }

    public boolean isPartyAnswer() {
        return partyAnswer;
    }

    public void setPartyAnswer(boolean partyAnswer) {
        this.partyAnswer = partyAnswer;
    }

    public boolean isSendDataToBCC() {
        return sendDataToBCC;
    }

    public void setSendDataToBCC(boolean sendDataToBCC) {
        this.sendDataToBCC = sendDataToBCC;
    }
}
