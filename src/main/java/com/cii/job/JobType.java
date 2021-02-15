package com.cii.job;

public enum JobType {
	AMNESTY_UPDATE("Amnesty Update"),
	CASCSJ_CSV_IMPORT("CASCSJ Import"),
	ATP_REQUEST_UPDATE("Ability-to-Pay Rquest Update"),
	CONDUENT_INCIDENT_IMPORT("Conduent Import"),
	CONVERSATION_NOTIFICATIONS("Conversation Notifications"),
	COURT_STATISTICS_UPDATE("Court Statistics Update"),
	DEKALB_IMPORT("DeKalb Import"),
	DEKALB_OPTIN("DeKalb Opt-In"),
	DEKALB_PAYMENT_HEARING("DeKalb Payment/Hearing Update"),
	DMV_INFO_UPDATE("DMV Info Update"), 
	DWLS_DMV_UPDATE("DWLS DMV Update"), 
	EMAIL_DIGEST("Email Digest"),
	EMAIL_NEW_NEGOTIATION_INFO("Email New Negotiation Info"),
	ILFH_INCIDENT_IMPORT("Ford Heights Import"),
	MOVE_NEGOTIATION_IMPORT("Move Negotiation Import"),
	JIS_DWLS_IMPORT("JIS Dwls Import"), 
	JIS_DWLS_REQUEST_UPDATE("DWLS Request Update"), 
	JIS_PARKING_IMPORT("JIS Parking Import"), 
	JIS_WARRANT_IMPORT("JIS Warrant Import"), 
	JMS_DWLS_IMPORT("JMS DWLS Import"), 
	JMS_EXPORT("JMS Export"), 
	JMS_IMPORT("JMS Import"), 
	JMS_PREWARRANT_EXPORT("JMS Pre-Warrant Export"), 
	JMS_PREWARRANT_IMPORT("JMS Pre-Warrant Import"), 
	JSI_IMPORT("JSI Import"), 
	JSI_TRAFFIC_IMPORT("JSI Traffic Import"), 
	MARICOPA_IMPORT("Maricopa Import"),
	MARICOPA_NEGOTIATION_INFO_JOB("Maricopa Negotiation Info Job"),
	MI_RESOLVE_EXPORT("MiResolve Export"),
	NOTIFICATION_REQUESTS("Notification Requests"), 
	NOTIFICATIONS("Notifications"), 
	PARKING_REQUEST_UPDATE("Parking Request Update"), 
	PLEA_CASE_SEARCH("Plea Case Search"),
	SCOTTSDALE_IMPORT("Scottsdale Import"),
	SCOTTSDALE_PARKING_IMPORT("Scottsdale Parking Import"),
	SURVEY("Survey notifications"),
	SCOTTSDALE_PLEA_IMPORT("Scottsdale Plea Import"), 
	TRAFFIC_REQUEST_UPDATE("Traffic Request Update"),
	VJ_INCIDENT_IMPORT("Virtual Justice Incident Import"),
	WORKFLOW_STATE_LISTENERS("Workflow State Listeners"), 
	WORKFLOW_STATE_SUMMARY("Workflow State Summary"),
	YUMA_IMPORT("Yuma File Import"),
	MIAMI_PDF_EXPORT("Miami PDF Export"),
	FL11JC_CSV_EXPORT("FL11JC CSV Export"),
	AZ_CSV_IMPORT("AZ CSV Import"),
	AZ_CSV_IMPORT_SFTP("AZ CSV Import SFTP"),
	TPLEAS_IMPORT("TPLEAS Import"),
	GAGCRC_IMPORT_JOB("GAGCRC Import Job"),
	IOWA_SURVEY_JOB("Iowa Research Survey"),
	HCS_TRANSACTION_RENEWAL("HCS Transaction Id Renewal"),
	GADCSC_GET_DOCUMENTS_JOB("GADCSC Put Documents in History Item Job"),
	SET_DATE_PARAM_JOB("Set Date Param Job"),
	DEJPCOURT_IMPORT("DEJPCourt Import Job"),
	MANUAL_CASE_SEARCH("Manual Case Search"),
    GADCMC_PDF_EXPORT("GADCMC PDF EXPORT"),
	VAD19_IMPORT("VAD19 Import Job");

    private String formattedName;

	private JobType(String formattedName) {
		this.formattedName = formattedName;
	}

	public String getFormattedName() {
		return this.formattedName;
	}
}
