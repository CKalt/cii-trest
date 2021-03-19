package com.cii.model.court;

import com.cii.config.CustomCaseImport;
import com.cii.model.config.QuestionConfiguration;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;

import com.cii.bean.ModelWithIdAccess;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Court extends ModelWithIdAccess {

    @Id
    private String id;
    private String state;
    private String name;
    private String location;
    private String urlKey;
    private String subDomain;
    private boolean isAngular;
    private String timeZone;
    private String incidentServiceClass;
    private String eligibilityClass;
    private List<String> roles;

    private CustomCaseImport customCaseImport;

    private Map<String, Object> eligibilityConfigValues = new HashMap<String, Object>();;

    private Map<String, CaseTypeConfig> caseTypeConfigs = new HashMap<>();
    private Map<String, String> configurations = new HashMap<>();

    private String address1;
    private String address2;
    private String city;
    private String zip;

    private String phone;
    private String fax;
    private String website;
    private String onlinePayUrl;

    private String custom1;
    private String custom2;
    private String custom3;
    private String custom4;
    private String custom5;

    private Map<String, NCourtPaymentInfo> payees;

    private String notes;

    private boolean useCustomEmailAddress;

    private boolean active = true;
    private boolean hidden = false;
    private boolean hasCitizenSupportWidget;
    private boolean hasPublicDefenderCitizenUsers;

    private String emailServer;
    private String emailPort;
    private String emailAddress;
    private String emailPassword;

    private boolean disable;

    protected Map<String, Object> options;

    private QuestionConfiguration mediatorQuestionnaire;

    private Map<String, String> defaultMessages = new HashMap<>();

    private String s3PDFBucket;
    private String s3PDFFolder;

    private boolean hasExternalCourtLink;
    private String externalCourtLink;

    public Map<String, String> getDefaultMessages() {
        return defaultMessages;
    }

    public void setDefaultMessages(Map<String, String> defaultMessages) {
        this.defaultMessages = defaultMessages;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public Map<String, CaseTypeConfig> getCaseTypeConfigs() {
        return caseTypeConfigs;
    }

    public Map<String, String> getConfigurations() {
        return configurations;
    }

    public String getIncidentServiceClass() {
        return incidentServiceClass;
    }

    public String getEligibilityClass() {
        return eligibilityClass;
    }

    public void setEligibilityClass(String eligibilityClass) {
        this.eligibilityClass = eligibilityClass;
    }

    public void setIncidentServiceClass(String incidentServiceClass) {
        this.incidentServiceClass = incidentServiceClass;
    }

    public Map<String, Object> getEligibilityConfigValues() {
        return eligibilityConfigValues;
    }

    public void setEligibilityConfigValues(Map<String, Object> eligibilityConfigValues) {
        this.eligibilityConfigValues = eligibilityConfigValues;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlKey() {
        return urlKey;
    }

    public void setUrlKey(String urlKey) {
        this.urlKey = urlKey;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getOnlinePayUrl() {
        return onlinePayUrl;
    }

    public void setOnlinePayUrl(String onlinePayUrl) {
        this.onlinePayUrl = onlinePayUrl;
    }

    public String getCustom1() {
        return custom1;
    }

    public void setCustom1(String custom1) {
        this.custom1 = custom1;
    }

    public String getCustom2() {
        return custom2;
    }

    public void setCustom2(String custom2) {
        this.custom2 = custom2;
    }

    public String getCustom3() {
        return custom3;
    }

    public void setCustom3(String custom3) {
        this.custom3 = custom3;
    }

    public String getCustom4() {
        return custom4;
    }

    public void setCustom4(String custom4) {
        this.custom4 = custom4;
    }

    public String getCustom5() {
        return custom5;
    }

    public void setCustom5(String custom5) {
        this.custom5 = custom5;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Map<String, Object> getOptions() {
        return options;
    }

    public void setOptions(Map<String, Object> options) {
        this.options = options;
    }

    public boolean isUseCustomEmailAddress() {
        return useCustomEmailAddress;
    }

    public void setUseCustomEmailAddress(boolean useCustomEmailAddress) {
        this.useCustomEmailAddress = useCustomEmailAddress;
    }

    public String getEmailServer() {
        return emailServer;
    }

    public void setEmailServer(String emailServer) {
        this.emailServer = emailServer;
    }

    public String getEmailPort() {
        return emailPort;
    }

    public void setEmailPort(String emailPort) {
        this.emailPort = emailPort;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailPassword() {
        return emailPassword;
    }

    public void setEmailPassword(String emailPassword) {
        this.emailPassword = emailPassword;
    }

    public String getS3PDFBucket() {
        return s3PDFBucket;
    }

    public void setS3PDFBucket(String s3PDFBucket) {
        this.s3PDFBucket = s3PDFBucket;
    }

    public String getS3PDFFolder() {
        return s3PDFFolder;
    }

    public void setS3PDFFolder(String s3PDFFolder) {
        this.s3PDFFolder = s3PDFFolder;
    }

    public boolean getIsAngular() {
        return isAngular;
    }

    public void setIsAngular(boolean angular) {
        isAngular = angular;
    }

    public boolean isHasExternalCourtLink() {
        return hasExternalCourtLink;
    }

    public void setHasExternalCourtLink(boolean hasExternalCourtLink) {
        this.hasExternalCourtLink = hasExternalCourtLink;
    }

    public String getExternalCourtLink() {
        return externalCourtLink;
    }

    public void setExternalCourtLink(String externalCourtLink) {
        this.externalCourtLink = externalCourtLink;
    }

    public boolean isHasCitizenSupportWidget() {
        return hasCitizenSupportWidget;
    }

    public void setHasCitizenSupportWidget(boolean hasCitizenSupportWidget) {
        this.hasCitizenSupportWidget = hasCitizenSupportWidget;
    }

    public boolean ishasPublicDefenderCitizenUsers() {
        return hasPublicDefenderCitizenUsers;
    }

    public void sethasPublicDefenderCitizenUsers(boolean hasPublicDefenderCitizenUsers) {
        this.hasPublicDefenderCitizenUsers = hasPublicDefenderCitizenUsers;
    }


    public Map<String, NCourtPaymentInfo> getPayees() {
        return payees;
    }

    public void setPayees(Map<String, NCourtPaymentInfo> payees) {
        this.payees = payees;
    }

    public boolean isDisable() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }

    public String getSubDomain() {
        return subDomain;
    }

    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }

    public CustomCaseImport getCustomCaseImport() {
        return customCaseImport;
    }

    public void setCustomCaseImport(CustomCaseImport customCaseImport) {
        this.customCaseImport = customCaseImport;
    }

    public QuestionConfiguration getMediatorQuestionnaire() {
        return mediatorQuestionnaire;
    }

    public void setMediatorQuestionnaire(QuestionConfiguration mediatorQuestionnaire) {
        this.mediatorQuestionnaire = mediatorQuestionnaire;
    }
}
