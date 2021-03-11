package com.cii.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.cii.model.court.WorkflowStateSummary;

@Repository
public class WorkflowStateSummaryAggregateRestRepository extends RestRepository<WorkflowStateSummary> {
    WorkflowStateSummaryAggregateRestRepository() {
        super();
        this.classRef = WorkflowStateSummary.class;
        this.pluralForm = "courtWorkflowSummaries";
        this.singularForm = "courtWorkflowSummary";
    }

	public List<WorkflowStateSummary> getAggregates(String urlKey) {
        String[] bindingNames = new String[]{"urlKey"};

        String url = aggregateMethodUrl(bindingNames);
        List<WorkflowStateSummary> courtWorkflowSummaryAggregates =
            doGetEntityList(url, WorkflowStateSummary[].class, urlKey);
        return courtWorkflowSummaryAggregates;
    }
}
