package com.cii.json;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;


public class JsonDateDeserializer extends JsonDeserializer<Date> {
    
    protected static ThreadLocal<DateFormat> dateFmt = new ThreadLocal<DateFormat>() {
        protected DateFormat initialValue() {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            df.setCalendar(GregorianCalendar.getInstance());
            return df;
        }
    };
    
	@Override
	public Date deserialize(JsonParser jsonparser,
			DeserializationContext deserializationcontext) throws IOException,
			JsonProcessingException {
		String date = jsonparser.getText();
		try {
			return dateFmt.get().parse(date);
		} 
		catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
}
