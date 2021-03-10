package com.cii.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.cii.model.negotiation.NegotiationWorkflowStateAggregate;

@Repository
public class NegotiationWorkflowStateAggregateRestRepository extends RestRepository<NegotiationWorkflowStateAggregate> {
    protected static final Logger LOGGER =
        LoggerFactory.getLogger(NegotiationWorkflowStateAggregateRestRepository.class);
    NegotiationWorkflowStateAggregateRestRepository() {
        super();
        this.classRef = NegotiationWorkflowStateAggregate.class;
        this.pluralForm = "negotiationWorkflowStates";
        this.singularForm = "negotiationWorkflowState";
    }

	public List<NegotiationWorkflowStateAggregate> getAggregates(
             String userId,
             String courtId,
             String caseType,
             List<String> accessibleIdList,
             List<String> restrictedRoleList) {
        String[] bindingNames = new String[]{"userId", "courtId","caseType",
            "accessibleIds", "restrictedRoles"};

        String accessibleIds = buildCsvList(accessibleIdList);
        String restrictedRoles = buildCsvList(restrictedRoleList);

        String url = aggregateMethodUrl(bindingNames);
        List<NegotiationWorkflowStateAggregate> negotiationWorkflowStateAggregates =
            doGetEntityList(url, NegotiationWorkflowStateAggregate[].class, 
                 userId,
                 courtId,
                 caseType,
                 accessibleIds,
                 restrictedRoles);
        return negotiationWorkflowStateAggregates;
    }
}
