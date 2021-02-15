package com.cii.model.sos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class SosResponse {
    private Date generated;
    
    private String dln;
    private String driverStatus;
    
    private String firstName;
    private String middleName;
    private String lastName;
    private String nameSuffix;  
    private String gender;
    
    private Date dateOfBirth;
    
    private String addressLine;
    private String city;
    private String state;
    private String zipCode;
    
    private boolean hasCDL;
    private String cdlEndorsements;
    
    private boolean isSuspendedLicense;
    private List<DriverSuspensionItem> suspensions;
    
    private Date licenseExpirationDate;
    
    private List<DriverHistoryItem> driverHistory;
    private SosResponseStatus driverRecordState = SosResponseStatus.NOT_FOUND;
    private SosResponseStatus driverStatusState = SosResponseStatus.NOT_FOUND;
    private String driverRecordRawString;
    private String driverStatusRawString;
        
    public String getDln() {
        return dln;
    }
    
    public void setDln(String dln) {
        this.dln = dln;
    }
    
    public String getDriverStatus() {
        return driverStatus;
    }
    
    public void setDriverStatus(String driverStatus) {
        this.driverStatus = driverStatus;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getMiddleName() {
        return middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getNameSuffix() {
        return nameSuffix;
    }
    
    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getAddressLine() {
        return addressLine;
    }
    
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
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
    
    public String getZipCode() {
        return zipCode;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    public boolean getHasCDL() {
        return hasCDL;
    }
    
    public void setHasCDL(boolean hasCDL) {
        this.hasCDL = hasCDL;
    }
    
    public String getCdlEndorsements() {
        return cdlEndorsements;
    }

    public void setCdlEndorsements(String cdlEndorsements) {
        this.cdlEndorsements = cdlEndorsements;
    }
    
    public Date getLicenseExpirationDate() {
        return licenseExpirationDate;
    }
    
    public void setLicenseExpirationDate(Date licenseExpirationDate) {
        this.licenseExpirationDate = licenseExpirationDate;
    }

    public List<DriverHistoryItem> getDriverHistory() {
        return driverHistory;
    }

    public void setDriverHistory(List<DriverHistoryItem> driverHistory) {
        this.driverHistory = driverHistory;
    }

    public Date getGenerated() {
        return generated;
    }

    public void setGenerated(Date generated) {
        this.generated = generated;
    }
    
    public String getDriverRecordRawString() {
        return driverRecordRawString;
    }

    public void setDriverRecordRawString(String driverRecordRawString) {
        this.driverRecordRawString = driverRecordRawString;
    }

    public String getDriverStatusRawString() {
        return driverStatusRawString;
    }

    public void setDriverStatusRawString(String driverStatusRawString) {
        this.driverStatusRawString = driverStatusRawString;
    }
    
    public SosResponseStatus getDriverRecordState() {
        return driverRecordState;
    }
    
    public void setDriverRecordState(SosResponseStatus driverRecordState) {
        this.driverRecordState = driverRecordState;
    }
    
    public SosResponseStatus getDriverStatusState() {
        return driverStatusState;
    }
    
    public void setDriverStatusState(SosResponseStatus driverStatusState) {
        this.driverStatusState = driverStatusState;
    }

    public List<DriverSuspensionItem> getSuspensions() {
        return suspensions;
    }

    public void setSuspensions(List<DriverSuspensionItem> suspensions) {
        this.suspensions = suspensions;
    }

    public boolean getIsSuspendedLicense() {
        return isSuspendedLicense;
    }

    public void setIsSuspendedLicense(boolean isSuspendedLicense) {
        this.isSuspendedLicense = isSuspendedLicense;
    }
}
