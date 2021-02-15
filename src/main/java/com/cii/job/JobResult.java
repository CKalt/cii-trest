package com.cii.job;

import java.util.Date;

public class JobResult {
    private String jobKey;
    private JobStatus status;
    private String output = "";
    private Date startTS;
    private Date endTS;

    public JobResult() {
    }

    public String getJobKey() {
        return this.jobKey;
    }

    public void setJobKey(String jobKey) {
        this.jobKey = jobKey;
    }

    public JobStatus getStatus() {
        return this.status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public String getOutput() {
        return this.output;
    }

    public Date getStartTS() {
        return this.startTS;
    }

    public void setStartTS(Date startTS) {
        this.startTS = startTS;
    }

    public Date getEndTS() {
        return this.endTS;
    }

    public void setEndTS(Date endTS) {
        this.endTS = endTS;
    }

    public void append(String str) {
        output += str + "\n";
    }
}
