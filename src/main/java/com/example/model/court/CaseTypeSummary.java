package com.example.model.court;

import java.util.Date;

public class CaseTypeSummary {
	
	private int searches;
	private int requests;
	private Date mostRecentCaseDate;
	
	public CaseTypeSummary() {
	    this.searches = 0;
	    this.requests = 0;
	}

    public CaseTypeSummary(int searches, int requests) {
        this.searches = searches;
        this.requests = requests;
    }

    public int getSearches() {
        return searches;
    }

    public void setSearches(int searches) {
        this.searches = searches;
    }

    public int getRequests() {
        return requests;
    }

    public void setRequests(int requests) {
        this.requests = requests;
    }

    public Date getMostRecentCaseDate() {
        return mostRecentCaseDate;
    }

    public void setMostRecentCaseDate(Date mostRecentCaseDate) {
        if (this.mostRecentCaseDate == null || (mostRecentCaseDate != null && this.mostRecentCaseDate.before(mostRecentCaseDate))) {
            this.mostRecentCaseDate = mostRecentCaseDate;
        }
    }
}
