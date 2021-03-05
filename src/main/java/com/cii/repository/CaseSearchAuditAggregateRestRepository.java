package com.cii.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.cii.model.audit.CaseSearchAuditAggregate;

@Repository
public class CaseSearchAuditAggregateRestRepository extends RestRepository<CaseSearchAuditAggregate> {
    protected static final Logger LOGGER = LoggerFactory.getLogger(CaseSearchAuditAggregateRestRepository.class);
    CaseSearchAuditAggregateRestRepository() {
        super();
        this.classRef = CaseSearchAuditAggregate.class;
        this.pluralForm = "caseSearchAuditAggregates";
        this.singularForm = "caseSearchAuditAggregate";
    }

	public List<CaseSearchAuditAggregate> getAggregates() {
        String url = collectionUrl() + "?debug={debug}";
        boolean debug = true;
        List<CaseSearchAuditAggregate> caseSearchAuditAggregates = doGetEntityList(url, CaseSearchAuditAggregate[].class, debug);
        return caseSearchAuditAggregates;
    }
}
