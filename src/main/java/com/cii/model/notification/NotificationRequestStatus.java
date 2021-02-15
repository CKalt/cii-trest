package com.cii.model.notification;

import java.util.ArrayList;
import java.util.List;

public enum NotificationRequestStatus {
	PENDING,COMPLETE,EXPIRED,INELIGIBLE;
    
    public static List<String> getNames() {
        List<String> names = new ArrayList<String>();
        for(NotificationRequestStatus thisStat : NotificationRequestStatus.values()){
            names.add(thisStat.toString());
        }
        return names;
    }
}
