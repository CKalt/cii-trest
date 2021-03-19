package com.cii.model.config;

public class SignatureOption extends NegotiationOption {
	private String caption;
	private String formName;
	private String party;
	private int index;
	private boolean showForm = true;
	private boolean signatureRequired = true;
	private boolean nameRequired = true;
	private boolean isPNG;

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public boolean getSignatureRequired() {
		return signatureRequired;
	}

	public void setSignatureRequired(boolean signatureRequired) {
		this.signatureRequired = signatureRequired;
	}

	public boolean getNameRequired() {
		return nameRequired;
	}

	public void setNameRequired(boolean nameRequired) {
		this.nameRequired = nameRequired;
	}

	public boolean isShowForm() {
		return showForm;
	}

	public void setShowForm(boolean showForm) {
		this.showForm = showForm;
	}

	public boolean isPNG() {
		return isPNG;
	}

	public void setPNG(boolean PNG) {
		isPNG = PNG;
	}
}
