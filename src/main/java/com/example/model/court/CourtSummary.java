package com.example.model.court;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection="courtSummary")
public class CourtSummary {
	
	@Id 
	private String id;
	
	private String urlKey;
	private Date collectionDate;
	private Date mostRecentCaseDate;
	private int requests;
	private int searches;
	
	private Map<String, CaseTypeSummary> caseTypeSummaries;
	
	public CourtSummary() {
		setCaseTypeSummaries(new HashMap<>());
	}
	
	public CourtSummary(String urlKey, Date collectionDate) {
		this.urlKey = urlKey;
		this.collectionDate = collectionDate;
		this.requests = 0;
		this.searches = 0;
		this.setCaseTypeSummaries(new HashMap<>());
	}
	
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
	
	public void addCaseTypeSummary(String caseType, CaseTypeSummary caseTypeSummary) {
	    if (caseTypeSummaries == null) {
	        caseTypeSummaries = new HashMap<>();
	    }
		caseTypeSummaries.put(caseType, caseTypeSummary);
	}
	
	public CaseTypeSummary getCaseTypeSummary(String caseType) {
		return caseTypeSummaries.get(caseType);
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
        if (this.mostRecentCaseDate == null || (mostRecentCaseDate != null && this.mostRecentCaseDate.before(mostRecentCaseDate))) {
            this.mostRecentCaseDate = mostRecentCaseDate;
        }
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
    
    public int getCollectionYear() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(collectionDate);
        return cal.get(Calendar.YEAR);
    }
    
    public int getCollectionMonth() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(collectionDate);
        return cal.get(Calendar.MONTH);
    }
    
    public int getCollectionDay() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(collectionDate);
        return cal.get(Calendar.DAY_OF_MONTH);
    }
    
    public String toString() {
        return urlKey + " : " + collectionDate.toString() + " " + requests + " " + searches;
    }

}
