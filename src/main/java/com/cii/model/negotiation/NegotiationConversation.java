package com.cii.model.negotiation;

import java.util.List;
import java.util.Map;

public class NegotiationConversation {
    private String name;
    private String placeholderMessage;
    private String initialMessage;
    private Map<String, List<String>> access;
    private Map<String, Boolean> conditions;
    private List<String> privilegedRoles;
    private List<String> readOnlyRoles;
    private boolean allPartiesMustRegister = true;
    private String workflowStateId;
    private boolean createLater;
    private Map<String, List<String>> createAccess;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceholderMessage() {
        return placeholderMessage;
    }

    public void setPlaceholderMessage(String placeholderMessage) {
        this.placeholderMessage = placeholderMessage;
    }

    public String getInitialMessage() {
        return initialMessage;
    }

    public void setInitialMessage(String initialMessage) {
        this.initialMessage = initialMessage;
    }

    public Map<String, Boolean> getConditions() {
        return conditions;
    }

    public void setConditions(Map<String, Boolean> conditions) {
        this.conditions = conditions;
    }

    public List<String> getPrivilegedRoles() {
        return privilegedRoles;
    }

    public void setPrivilegedRoles(List<String> privilegedRoles) {
        this.privilegedRoles = privilegedRoles;
    }

    public List<String> getReadOnlyRoles() {
        return readOnlyRoles;
    }

    public void setReadOnlyRoles(List<String> readOnlyRoles) {
        this.readOnlyRoles = readOnlyRoles;
    }

    public Map<String, List<String>> getAccess() {
        return access;
    }

    public void setAccess(Map<String, List<String>> access) {
        this.access = access;
    }

    public boolean isAllPartiesMustRegister() {
        return allPartiesMustRegister;
    }

    public void setAllPartiesMustRegister(boolean allPartiesMustRegister) {
        this.allPartiesMustRegister = allPartiesMustRegister;
    }

    public String getWorkflowStateId() {
        return workflowStateId;
    }

    public void setWorkflowStateId(String workflowStateId) {
        this.workflowStateId = workflowStateId;
    }

    public Map<String, List<String>> getCreateAccess() {
        return createAccess;
    }

    public void setCreateAccess(Map<String, List<String>> createAccess) {
        this.createAccess = createAccess;
    }

    public boolean isCreateLater() {
        return createLater;
    }

    public void setCreateLater(boolean createLater) {
        this.createLater = createLater;
    }
}
