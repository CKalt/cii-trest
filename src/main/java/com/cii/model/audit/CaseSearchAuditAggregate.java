package com.cii.model.audit;

import com.cii.bean.ModelWithIdAccess;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Map;

@Document
public class CaseSearchAuditAggregate extends ModelWithIdAccess {
    private Map<String,Object> groupKey;

    private Date recent;
    private int count;

    public Map<String,Object> getGroupKey() {
        return groupKey;
    }

    public String getUrlKey() {
        return (String) this.groupKey.get("urlKey");
    }

    public String getCaseType() {
        return (String) this.groupKey.get("caseType");
    }

    public void setGroupKey(Map<String,Object> groupKey) {
        this.groupKey = groupKey;
    }
    public Date getRecent() {
        return recent;
    }
    public void setRecent(Date recent) {
        this.recent = recent;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
