package com.example.job;

public enum JobStatus {
    SUCCESS("Success"), 
    ERROR("Error"), 
    WARNING("Warning"), 
    STOPPED("Stopped"),
    DELETED("Deleted");

    private String formattedName;

    private JobStatus(String formattedName) {
        this.formattedName = formattedName;
    }

    public String getFormattedName() {
        return this.formattedName;
    }
}
