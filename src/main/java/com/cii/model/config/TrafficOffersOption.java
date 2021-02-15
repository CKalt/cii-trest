package com.cii.model.config;

import java.util.List;

public class TrafficOffersOption extends NegotiationOption {
	private List<TrafficOffer> offers;

	public List<TrafficOffer> getOffers() {
		return offers;
	}

	public void setOffers(List<TrafficOffer> offers) {
		this.offers = offers;
	}
}
