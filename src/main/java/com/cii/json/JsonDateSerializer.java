package com.cii.json;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;


@Component
public class JsonDateSerializer extends JsonSerializer<Date> {
    
    protected static ThreadLocal<DateFormat> dateFmt = new ThreadLocal<DateFormat>() {
        protected DateFormat initialValue() {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            df.setCalendar(GregorianCalendar.getInstance());
            return df;
        }
    };

	@Override
	public void serialize(Date date, JsonGenerator gen,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {
		gen.writeString(dateFmt.get().format(date));
	}

}
