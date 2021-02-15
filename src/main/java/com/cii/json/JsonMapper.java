package com.cii.json;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonMapper extends ObjectMapper {

	private static final long serialVersionUID = -683124730705671959L;

	public JsonMapper() {
		super();
		this.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		this.configure(SerializationFeature.INDENT_OUTPUT, true);
	}
}