package com.example.model.job;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import com.example.job.JobResult;
import com.example.job.JobStatus;
import com.example.job.JobType;

@Document
public class JobInfo {
    private String id;
    private String name;
    private String key;
    private String cronExpression;
    private JobStatus status;
    private String urlKeys;
    private JobType type;
    private List<JobResult> results = new ArrayList<JobResult>();
    private Date createDate;
    private Date executeDate;
    private Map<String, String> properties = new HashMap<String, String>();
    private int maxResultCount = 5;

    public JobInfo() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCronExpression() {
        return this.cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public List<JobResult> getResults() {
        return this.results;
    }

    public void setResults(List<JobResult> results) {
        this.results = results;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getExecuteDate() {
        return this.executeDate;
    }

    public void setExecuteDate(Date executeDate) {
        this.executeDate = executeDate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public JobType getType() {
        return this.type;
    }

    public void setType(JobType type) {
        this.type = type;
    }

    public JobStatus getStatus() {
        return this.status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public String getUrlKeys() {
        return this.urlKeys;
    }

    public void setUrlKeys(String urlKeys) {
        this.urlKeys = urlKeys;
    }

    public int getMaxResultCount() {
        return this.maxResultCount;
    }

    public void setMaxResultCount(int maxResultCount) {
        this.maxResultCount = maxResultCount;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }
}
