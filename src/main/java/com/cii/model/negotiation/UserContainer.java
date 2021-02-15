package com.cii.model.negotiation;

import java.util.Map;

public class UserContainer {
    private String userId;
    private String workflowStateId;
    private boolean hasRegistered;
    private boolean hasTerminated;
    private String pin;
    private Map<String, Object> data;

    public String getUserId() { return userId; }

    public void setUserId(String userId) { this.userId = userId; }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) { this.data = data; }

    public boolean getHasRegistered() { return hasRegistered; }

    public void setHasRegistered(boolean hasRegistered) { this.hasRegistered = hasRegistered; }

    public boolean getHasTerminated() { return this.hasTerminated; }

    public void setHasTerminated(boolean hasTerminated) { this.hasTerminated = hasTerminated; }

    public void setPin(String pin) { this.pin = pin; }

    public String getPin() {return this.pin; }

    public String getWorkflowStateId() {
        return workflowStateId;
    }

    public void setWorkflowStateId(String workflowStateId) {
        this.workflowStateId = workflowStateId;
    }
}
