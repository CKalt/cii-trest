package com.cii.model.incident;

public enum EligibilityStatus {
	ELIGIBLE("Eligible", "", true),
	INELIGIBLE("Ineligible", "", false),
	INELIGIBLE_POLICE_AGENCY("Non-Participating Police Agency", "Although you may qualify for online case resolution, the police agency involved with your case is not participating in this online program. You will have to go to court to contest your charge.", false),
	INELIGIBLE_CASE_TYPE("Ineligible Case Type", "At this time, the court is not processing this type of case. If you wish to dispute your charge, you will have to go to court.", false),
	INELIGIBLE_AFTER_DEADLINE("Past Deadline", "Unfortunately, your case is past the deadline to be eligible for online resolution. If you wish to contest your charge, you will have to appear in court.", false),
	INELIGIBLE_OFFENSE_TYPE("Ineligible Offense Type", "Unfortunately, the court does not allow this type of offense to be handled online. You are still responsible for resolving this citation. Call the courthouse to schedule an in person hearing before the default date on your citation or simply pay the citation in full.", false),
	INELIGIBLE_WAIVABLE("Waivable Offense", "Unfortunately, your case is not eligible because it is a waivable offense. For example, if you were ticketed for not providing proof of insurance, you must go to court in order to have that citation waived.", false),
	INELIGIBLE_TOO_MANY_PAST_OFFENSES("Too Many Past Offenses", "You have too many prior offenses on your record. This means that you are not eligible for the online resolution process. If you wish to contest your charge, you will have to appear in court.", false),
	INELIGIBLE_TOO_MANY_OPEN_OFFENSES("Too Many Open Offenses", "At this time, you have too many open offenses currently on your record. You are not eligible for the online process as a result. If you wish to contest your charge, you will have to appear in court.", false),
	INELIGIBLE_SUSPENDED_LICENSE("Prior Suspended License", "According to our records, your driver’s license is suspended. As a result, you are ineligible to use the online system to file a request. ", false),
	INELIGIBLE_DRIVER_AGE("Driver Age", "Your court has required that citizens must be 18 years of age or older in order to use the online case resolution system. If you wish to contest your charge, you will have to go to court.", false),
	INELIGIBLE_AGE("Driver Age", "Your court has required that citizens must meet the minimum age requirement in order to use the online case resolution system. If you wish to contest your charge, you will have to go to court.", false),
	INELIGIBLE_TOO_MANY_OPEN_WARRANTS("Too Many Open Warrants", "According to our system, you have one or more open warrants on your record. Because of this, you do not qualify to use the online case resolution system. Please contact the court if you wish to resolve your case.", false),
	INELIGIBLE_MULTIPLE_COUNT("Multiple-Count Ticket", "Your case has more than one charge attached to it. As a result, you are ineligible to use the online system. You will have to appear in court if you wish to dispute your charge.", false),
	INELIGIBLE_COURT("Ineligible Court", "Unfortunately, the district court that is responsible for your case is not participating in the online case resolution system. Please contact the court if you wish to resolve your case.", false),
	INELIGIBLE_DISPOSITION("Ineligible Case Status", "This case is not eligible due to its status and cannot be handled through the online system. Please contact the court for more information about your case.", false),
	INELIGIBLE_TOO_MANY_REDUCTIONS("Too Many Reductions", "Your case has already seen a reduction from your original offense. Because of this, you are not eligible to use the online system. Please contact the court for more information about your case.", false),
	INELIGIBLE_DL_STATE("Driver License State Not Eligible", "At this time, the court is not allowing citizens with out of state driver’s licenses to use the online system. If you wish to contest your charge, please contact the court.", false),
	INELIGIBLE_CASE_STATUS("Ineligible Case Status", "This case is not eligible due to its status.", false),
	INELIGIBLE_ATTORNEY("Represented By Attorney", "This case is not eligible because the defendant is represented by an attorney.", false),
	INELIGIBLE_WARRANT_TYPE("Ineligible Warrant", "This case is not eligible because of its warrant type.", false),
	INELIGIBLE_MIN_AMOUNT("Ineligible Amount", "The amount due on this case is below the court's minimum amount due requirement.", false),
	INELIGIBLE_CASE_AGE("Ineligible Case Age", "The filing date of this case doesn't meet the court's requirements.", false),
	INELIGIBLE_WARRANT_OUTSTANDING("Warrant Outstanding", "Your case is not eligible because there is an outstanding warrant.", false),
	INELIGIBLE_IN_PROGRESS("In Progress", "This case is already in progress. Click view details to view the status.", false),
	NOT_RELEVANT("Not Relevant", "", false),
	PENDING("Pending", "", true),
	DISPOSED("Disposed", "", true);

	private String reason;
	private boolean isEligible;
	private String longExplanation;

	private EligibilityStatus(String reason, String longExplanation, boolean isEligible) {
		this.reason = reason;
		this.longExplanation = longExplanation;
		this.isEligible = isEligible;
	}

	public boolean isEligible() {
		return isEligible;
	}

	public String getReason() {
		return reason;
	}

	public String getLongExplanation() {
		return longExplanation;
	}

}
