package com.cii.model.incident;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FHTicket")
public class FHTicket {
	private String id;
	private Date createDate;
	private String ticketNumber;
	private String cleanTicketNumber;
	private String violationType;
	private String violation;
	private Date violationDate;
	private String firstName;
	private String middleName;
	private String lastName;
	private Date dob;
	private String dln;
	private String dlState;
	private String lpn;
	private String lpState;
	private String lpExpiration;
	private BigDecimal fineAmount;
	private String officerName;
	private String officerNumber;
	private String officerNote;
	private Date dueDate;
	private Date courtDate;
	private String address;
	private String vehicleIdNumber;
	private String vehicleMake;
	private String vehicleModel;
	private String vehicleColor;
	private String vehicleYear;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getCleanTicketNumber() {
		return cleanTicketNumber;
	}

	public String getViolationType() {
		return violationType;
	}

	public void setViolationType(String violationType) {
		this.violationType = violationType;
	}

	public String getViolation() {
		return violation;
	}

	public void setViolation(String violation) {
		this.violation = violation;
	}

	public BigDecimal getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(BigDecimal fineAmount) {
		this.fineAmount = fineAmount;
	}

	public Date getViolationDate() {
		return violationDate;
	}

	public void setViolationDate(Date violationDate) {
		this.violationDate = violationDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getCourtDate() {
		return courtDate;
	}

	public void setCourtDate(Date courtDate) {
		this.courtDate = courtDate;
	}

	public String getOfficerName() {
		return officerName;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	public String getDlState() {
		return dlState;
	}

	public void setDlState(String dlState) {
		this.dlState = dlState.toUpperCase();
	}

	public String getDln() {
		return dln;
	}

	public void setDln(String dln) {
		this.dln = dln;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLpn() {
		return lpn;
	}

	public void setLpn(String lpn) {
		this.lpn = lpn;
	}

	public String getLpState() {
		return lpState;
	}

	public void setLpState(String lpState) {
		this.lpState = lpState;
	}

	public String getLpExpiration() {
		return lpExpiration;
	}

	public void setLpExpiration(String expiration) {
		this.lpExpiration = expiration;
	}

	public String getOfficerNumber() {
		return officerNumber;
	}

	public void setOfficerNumber(String officerNumber) {
		this.officerNumber = officerNumber;
	}

	public String getVehicleIdNumber() {
		return vehicleIdNumber;
	}

	public void setVehicleIdNumber(String vehicleIdNumber) {
		this.vehicleIdNumber = vehicleIdNumber;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public String getVehicleYear() {
		return vehicleYear;
	}

	public void setVehicleYear(String vehicleYear) {
		this.vehicleYear = vehicleYear;
	}

	public String getOfficerNote() {
		return officerNote;
	}

	public void setOfficerNote(String officerNote) {
		this.officerNote = officerNote;
	}
}
