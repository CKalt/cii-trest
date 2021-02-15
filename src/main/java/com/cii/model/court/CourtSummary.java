package com.cii.model.court;

import javax.persistence.Id;
import java.util.Date;
import java.util.Map;

public class CourtSummary {
	@Id 
	private String id;
	
	private String urlKey;
	private Date collectionDate;
	private Date mostRecentCaseDate;
	private int requests;
	private int searches;
	
	private Map<String, CaseTypeSummary> caseTypeSummaries;
	
	public String getUrlKey() {
		return urlKey;
	}
	
	public void setUrlKey(String urlKey) {
		this.urlKey = urlKey;
	}

	public Map<String, CaseTypeSummary> getCaseTypeSummaries() {
		return caseTypeSummaries;
	}

	public void setCaseTypeSummaries(Map<String, CaseTypeSummary> caseTypeSummaries) {
		this.caseTypeSummaries = caseTypeSummaries;
	}
	
    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public Date getMostRecentCaseDate() {
        return mostRecentCaseDate;
    }

    public void setMostRecentCaseDate(Date mostRecentCaseDate) {
        this.mostRecentCaseDate = mostRecentCaseDate;
    }

    public int getRequests() {
        return requests;
    }

    public void setRequests(int requests) {
        this.requests = requests;
    }

    public int getSearches() {
        return searches;
    }

    public void setSearches(int searches) {
        this.searches = searches;
    }
}
