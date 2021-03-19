package com.cii.model.config;

import com.cii.bean.ModelWithIdAccess;
import com.cii.model.negotiation.NegotiationConversation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Configuration extends com.cii.bean.ModelWithIdAccess {

    @Id
    private String id;
    private String name;
    private String caseType;
    private String configType;
    private Date createDate;
    private String awsUploadFolder;
    private String awsUploadBucket;
    private boolean hasMediationChoice;
    private boolean isPNGSignature;
    private CourtIntakeFormProperties courtIntakeFormProperties;
    private boolean hasConfigurableCourtIntake;
    private boolean hasChargesTable = false;
    private String createConversationsButtonText;

    private List<Payment> payments;

    private String courtStaffGroupEmail;

    private Map<String, Object> configValues = new HashMap<>();
    private List<NegotiationConversation> conversations;
    private Map<String, String> messages;
    private Map<String, String> notificationTemplates = new HashMap<String, String>();
    private FormConfiguration formConfiguration = new FormConfiguration();
    private WorkflowConfiguration workflowConfiguration;
    private QuestionConfiguration questionConfiguration;
    private QuestionConfiguration registrationQuestionConfiguration;

    private String zoomLinkText;
    private String zoomScheduleText;

    private List<PDFForm> pdfForms;
    private String originalPdfFile;

    private boolean zoomIntegrationConversationSpace;

    private boolean showRandomizedModal;

    private boolean ascendingHistoryItems;

    private boolean createConversations;

    public List<PDFForm> getPdfForms() {
        return pdfForms;
    }

    public void setPdfForms(List<PDFForm> pdfForms) {
        this.pdfForms = pdfForms;
    }

    public Configuration() {
        createDate = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NegotiationConversation> getConversations() {
        return conversations;
    }

    public void setConversations(List<NegotiationConversation> conversations) {
        this.conversations = conversations;
    }

    public FormConfiguration getFormConfiguration() { return formConfiguration; }

    public void setFormConfiguration(FormConfiguration formConfiguration) { this.formConfiguration = formConfiguration; }

    public WorkflowConfiguration getWorkflowConfiguration() {
        return workflowConfiguration;
    }

    public void setWorkflowConfiguration(WorkflowConfiguration workflowConfiguration) {
        this.workflowConfiguration = workflowConfiguration;
    }

    public Map<String, Object> getConfigValues() {
        return configValues;
    }

    public void setConfigValues(Map<String, Object> configValues) {
        this.configValues = configValues;
    }

    public Object getConfigValue(String key) {
        return configValues.get(key);
    }

    @JsonIgnore
    public String getEligibilityClassName() {
        return (String)configValues.get("eligibilityClass");
    }

    @JsonIgnore
    public String getIncidentServiceClassName() {
        return (String)configValues.get("incidentServiceClass");
    }

    public Map<String, String> getMessages() {
        return messages;
    }

    public void setMessages(Map<String, String> messages) {
        this.messages = messages;
    }

    public Map<String, String> getNotificationTemplates() {
        return notificationTemplates;
    }

    public void setNotificationTemplates(Map<String, String> notifTemplates) {
        this.notificationTemplates = notifTemplates;
    }

    public String getNotificationTemplate(String key) {
        return notificationTemplates.get(key);
    }

    public String getAwsUploadFolder() {
        return awsUploadFolder;
    }

    public void setAwsUploadFolder(String awsUploadFolder) {
        this.awsUploadFolder = awsUploadFolder;
    }

    public String getAwsUploadBucket() { return awsUploadBucket; }

    public void setAwsUploadBucket(String awsUploadBucket) { this.awsUploadBucket = awsUploadBucket; }

    public QuestionConfiguration getQuestionConfiguration() {
        return questionConfiguration;
    }

    public void setQuestionConfiguration(QuestionConfiguration qconfig) {
        this.questionConfiguration = qconfig;
    }

    public QuestionConfiguration getRegistrationQuestionConfiguration() {
        return registrationQuestionConfiguration;
    }

    public void setRegistrationQuestionConfiguration(QuestionConfiguration qconfig) {
        this.registrationQuestionConfiguration = qconfig;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public String getCourtStaffGroupEmail() {
        return courtStaffGroupEmail;
    }

    public void setCourtStaffGroupEmail(String courtStaffGroupEmail) {
        this.courtStaffGroupEmail = courtStaffGroupEmail;
    }

    public String getOriginalPdfFile() {
        return originalPdfFile;
    }

    public void setOriginalPdfFile(String originalPdfFile) {
        this.originalPdfFile = originalPdfFile;
    }

    public boolean isAscendingHistoryItems() {
        return ascendingHistoryItems;
    }

    public void setAscendingHistoryItems(boolean ascendingHistoryItems) {
        this.ascendingHistoryItems = ascendingHistoryItems;
    }

    public boolean isHasMediationChoice() {
        return hasMediationChoice;
    }

    public void setHasMediationChoice(boolean hasMediationChoice) {
        this.hasMediationChoice = hasMediationChoice;
    }

    public boolean isPNGSignature() {
        return isPNGSignature;
    }

    public void setPNGSignature(boolean isPNGSignature) {
        this.isPNGSignature = isPNGSignature;
    }

    public CourtIntakeFormProperties getCourtIntakeFormProperties() {
        return courtIntakeFormProperties;
    }

    public void setCourtIntakeFormProperties(CourtIntakeFormProperties courtIntakeFormProperties) {
        this.courtIntakeFormProperties = courtIntakeFormProperties;
    }

    public boolean isHasConfigurableCourtIntake() {
        return hasConfigurableCourtIntake;
    }

    public void setHasConfigurableCourtIntake(boolean hasConfigurableCourtIntake) {
        this.hasConfigurableCourtIntake = hasConfigurableCourtIntake;
    }

    public boolean isZoomIntegrationConversationSpace() {
        return zoomIntegrationConversationSpace;
    }

    public void setZoomIntegrationConversationSpace(boolean zoomIntegrationConversationSpace) {
        this.zoomIntegrationConversationSpace = zoomIntegrationConversationSpace;
    }

    public String getZoomLinkText() {
        return zoomLinkText;
    }

    public void setZoomLinkText(String zoomLinkText) {
        this.zoomLinkText = zoomLinkText;
    }

    public String getZoomScheduleText() {
        return zoomScheduleText;
    }

    public void setZoomScheduleText(String zoomScheduleText) {
        this.zoomScheduleText = zoomScheduleText;
    }

    public boolean getShowRandomizedModal() {
        return showRandomizedModal;
    }

    public void setShowRandomizedModal(boolean showRandomizedModal) {
        this.showRandomizedModal = showRandomizedModal;
    }

    public boolean isHasChargesTable() {
        return hasChargesTable;
    }

    public void setHasChargesTable(boolean hasChargesTable) {
        this.hasChargesTable = hasChargesTable;
    }

    public boolean isCreateConversations() {
        return createConversations;
    }

    public void setCreateConversations(boolean createConversations) {
        this.createConversations = createConversations;
    }

    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    public String getCreateConversationsButtonText() {
        return createConversationsButtonText;
    }

    public void setCreateConversationsButtonText(String createConversationsButtonText) {
        this.createConversationsButtonText = createConversationsButtonText;
    }
}
