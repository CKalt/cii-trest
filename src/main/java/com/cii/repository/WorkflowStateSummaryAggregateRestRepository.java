package com.cii.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.cii.model.court.WorkflowStateSummary;

@Repository
public class WorkflowStateSummaryAggregateRestRepository extends RestRepository<WorkflowStateSummary> {
    WorkflowStateSummaryAggregateRestRepository() {
        super();
        this.classRef = WorkflowStateSummary.class;
        this.pluralForm = "WorkflowSummaries";
        this.singularForm = "WorkflowSummary";
    }

	public List<WorkflowStateSummary> getAggregates(String urlKey) {
        String[] bindingNames = new String[]{"urlKey"};

        String url = aggregateMethodUrl(bindingNames, "court");
        List<WorkflowStateSummary> courtWorkflowSummaryAggregates =
            doGetEntityList(url, WorkflowStateSummary[].class, urlKey);
        return courtWorkflowSummaryAggregates;
    }

	public List<WorkflowStateSummary> getAggregates(String urlKey,
            String userId) {
        String[] bindingNames = new String[]{"urlKey", "userId"};

        String url = aggregateMethodUrl(bindingNames, "user");
        List<WorkflowStateSummary> userWorkflowSummaryAggregates =
            doGetEntityList(url, WorkflowStateSummary[].class, urlKey,
                    userId);
        return userWorkflowSummaryAggregates;
    }

	public List<WorkflowStateSummary> getAggregates() {
        String[] bindingNames = new String[]{};

        String url = aggregateMethodUrl(bindingNames, "all");
        List<WorkflowStateSummary> allWorkflowSummaryAggregates =
            doGetEntityList(url, WorkflowStateSummary[].class);
        return allWorkflowSummaryAggregates;
    }
}
