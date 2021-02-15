package com.cii.model.config;

import java.util.List;

public class BulkWorkflowStateMove {
    List<String> fromStateIds;
    String toStateId;

    public void setFromStateIds(List<String> fromStateIds) { this.fromStateIds = fromStateIds; }

    public List<String> getFromStateIds() { return fromStateIds; }

    public void setToStateId(String toStateId) { this.toStateId = toStateId; }

    public String getToStateId() { return toStateId; }
}
