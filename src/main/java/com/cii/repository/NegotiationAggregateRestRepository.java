package com.cii.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.cii.model.negotiation.NegotiationAggregate;

@Repository
public class NegotiationAggregateRestRepository extends RestRepository<NegotiationAggregate> {
    protected static final Logger LOGGER = LoggerFactory.getLogger(NegotiationAggregateRestRepository.class);
    NegotiationAggregateRestRepository() {
        super();
        this.classRef = NegotiationAggregate.class;
        this.pluralForm = "negotiationAggregates";
        this.singularForm = "negotiationAggregate";
    }

	public List<NegotiationAggregate> getAggregates() {
        String url = collectionUrl() + "?debug={debug}";
        boolean debug = true;
        List<NegotiationAggregate> negotiationAggregates = doGetEntityList(url, NegotiationAggregate[].class, debug);
        return negotiationAggregates;
    }
}
