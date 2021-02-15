package com.cii.model.config;

import java.util.List;

public class DWLSOffersOption extends NegotiationOption {
	private List<DWLSOffer> offers;
	
	public List<DWLSOffer> getOffers() {
		return offers;
	}

	public void setOffers(List<DWLSOffer> offers) {
		this.offers = offers;
	}
}
