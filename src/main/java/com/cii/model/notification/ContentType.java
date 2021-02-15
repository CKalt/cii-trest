package com.cii.model.notification;

import java.util.ArrayList;
import java.util.List;

public enum ContentType {
	HTML,TEXT,MULTI_PART;
	
	public static List<String> getNames(){
        List<String> names = new ArrayList<String>();
        for (ContentType thisType : ContentType.values()) {
            names.add(thisType.toString());
        }
        return names;
    }
}
