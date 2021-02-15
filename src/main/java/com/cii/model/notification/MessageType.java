package com.cii.model.notification;

import java.util.ArrayList;
import java.util.List;

public enum MessageType {
	EMAIL,SMS;
	
    public static List<String> getNames(){
	    List<String> names = new ArrayList<String>();
	    for (MessageType thisMes : MessageType.values()) {
            names.add(thisMes.toString());
        }
	    return names;
	}
}
