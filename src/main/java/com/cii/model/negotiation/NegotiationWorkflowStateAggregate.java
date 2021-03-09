package com.cii.model.negotiation;

import org.springframework.data.mongodb.core.mapping.Document;
import com.cii.bean.ModelWithIdAccess;

import java.util.Map;

@Document
public class NegotiationWorkflowStateAggregate extends ModelWithIdAccess {
    private Map<String,Object> groupKey;

    private int count;

    public Map<String,Object> getGroupKey() {
        return groupKey;
    }

    public String getWorkflowStateId() {
        return (String) this.groupKey.get("workflowStateId");
    }

    public void setGroupKey(Map<String,Object> groupKey) {
        this.groupKey = groupKey;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
