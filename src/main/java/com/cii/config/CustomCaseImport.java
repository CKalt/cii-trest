package com.cii.config;

import com.cii.job.JobType;
import lombok.Data;

import java.util.List;

@Data
public class CustomCaseImport {
    private String linkText;
    private JobType jobType;
    private String bucket;
    private String folder;
    private String fileType;
    private String fileTypeExtension;
    private List<String> roles;
}
