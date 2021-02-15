package com.cii.model.structurednegotiation;

import java.util.Date;

public class StructuredNegotiationUser {
    private String name;
    private String email;
    private String address1;
    private Object address2;
    private String city;
    private String state;
    private String zip;
    private Date updateDate;
    private Date createDate;
    private boolean viewedHowToOne;
    private boolean viewedHowToTwo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public Object getAddress2() {
        return address2;
    }

    public void setAddress2(Object address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public boolean isViewedHowToOne() {
        return viewedHowToOne;
    }

    public void setViewedHowToOne(boolean viewedHowToOne) {
        this.viewedHowToOne = viewedHowToOne;
    }

    public boolean isViewedHowToTwo() { return viewedHowToTwo; }

    public void setViewedHowToTwo(boolean viewedHowToTwo) {
        this.viewedHowToTwo = viewedHowToTwo;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
