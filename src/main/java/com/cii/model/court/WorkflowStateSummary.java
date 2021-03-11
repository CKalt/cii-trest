package com.cii.model.court;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.cii.bean.ModelWithIdAccess;

@Document(collection = "workflowStateSummary")
public class WorkflowStateSummary extends ModelWithIdAccess {
	@Id
	private String id;
	private String urlKey;
	private String caseType;
	private String workflowStateId;
	private String type;
	private String policeAgency;
	private String courtCode;
	private String name;
	private int count;
	private Date oldest;
	private Date generated;
	
	public String getUrlKey() {
		return urlKey;
	}
	
	public void setUrlKey(String urlKey) {
		this.urlKey = urlKey;
	}
	
	public String getCaseType() {
		return caseType;
	}
	
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}
	
	public String getWorkflowStateId() {
		return workflowStateId;
	}
	
	public void setWorkflowStateId(String workFlowStateId) {
		this.workflowStateId = workFlowStateId;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getPoliceAgency() {
		return policeAgency;
	}
	
	public void setPoliceAgency(String policeAgency) {
		this.policeAgency = policeAgency;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public Date getOldest() {
		return oldest;
	}
	
	public void setOldest(Date oldest) {
		this.oldest = oldest;
	}
	
	public Date getGenerated() {
		return generated;
	}

	public void setGenerated(Date generated) {
		this.generated = generated;
	}

	public String getId() {
		return id;
	}

    public String getCourtCode() {
        return courtCode;
    }

    public void setCourtCode(String courtCode) {
        this.courtCode = courtCode;
    }
}
