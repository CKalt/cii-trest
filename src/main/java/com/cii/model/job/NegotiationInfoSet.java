package com.cii.model.job;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NegotiationInfoSet {
    @Id
    private String id;
    private Date added;
    private List<NegotiationInfo> info;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        this.added = added;
    }

    public List<NegotiationInfo> getInfo() {
        return info;
    }

    public void setInfo(List<NegotiationInfo> info) {
        this.info = info;
    }
}
