package com.cii.model.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public enum CaseType {

    TRAFFIC("Traffic"),
    WAIVABLE("Waivable Offense"),
    PARKING("Parking"),
    FTA("Failure To Appear"),
    FTP("Failure To Pay"),
    WARRANT("Warrant"),
    PREWARRANT_FTA("Pre-Warrant Failure To Appear"),
    PREWARRANT_FTP("Pre-Warrant Failure To Pay"),
    PREWARRANT("Pre-Warrant"),
    DWLS("DWLS"),
    AMNESTY("Amnesty"),
    ABILITY_TO_PAY("Ability to Pay"),
    PLEA("Online Plea"),
    PLEA_SEARCH("Online Plea Search"),
    CIVILINFRAC("Civil Infraction");

    private static Map<CaseType, CaseType[]> caseTypeMap;
    static {
        // List parents and children here 
        caseTypeMap = new HashMap<>();
        caseTypeMap.put(TRAFFIC, new CaseType[] {CaseType.TRAFFIC, CaseType.WAIVABLE});
        caseTypeMap.put(PARKING, new CaseType[] {CaseType.PARKING});
        caseTypeMap.put(DWLS, new CaseType[] {CaseType.DWLS});
        caseTypeMap.put(AMNESTY, new CaseType[] {CaseType.AMNESTY});
        caseTypeMap.put(WARRANT, new CaseType[] {CaseType.WARRANT, CaseType.FTA, CaseType.FTP});
        caseTypeMap.put(PREWARRANT, new CaseType[] {CaseType.PREWARRANT, CaseType.PREWARRANT_FTA, CaseType.PREWARRANT_FTP});
        caseTypeMap.put(ABILITY_TO_PAY, new CaseType[] {CaseType.ABILITY_TO_PAY});
        caseTypeMap.put(PLEA, new CaseType[] {CaseType.PLEA, CaseType.PLEA_SEARCH});
        caseTypeMap.put(CIVILINFRAC, new CaseType[] {CaseType.CIVILINFRAC});
    }

    private String formattedName;

    private CaseType(String formattedName) {
        this.formattedName = formattedName;
    }

    public String getFormattedName() {
        return formattedName;
    }

    public static CaseType getParentCaseType(CaseType caseType) {
        for(CaseType ct : caseTypeMap.keySet()) {
            CaseType[] subTypes = caseTypeMap.get(ct);
            for(int i = 0; i < subTypes.length; i++) {
                if(ct == subTypes[i]) {
                    return ct;
                }
            }
        }
        return null;
    }
    
    public static List<String> getCaseNames() {
        List<CaseType> caseTypes = _getParentCaseTypes();
        List<String> typeNames = new ArrayList<>();
        for (CaseType caseType : caseTypes) {
            typeNames.add(caseType.getFormattedName());
        }
        return typeNames;
    }
    
    public static List<String> getCaseTypes() {
        List<CaseType> caseTypes = _getParentCaseTypes();
        List<String> types = new ArrayList<>();
        for (CaseType caseType : caseTypes) {
            types.add(caseType.toString());
        }
        
        return types;
    }
    
    private static List<CaseType> _getParentCaseTypes() {
        Set<CaseType> parentsSet = caseTypeMap.keySet();
        List<CaseType> parentsList = new ArrayList<>();
        for (CaseType caseType : parentsSet) {
        	parentsList.add(caseType);
        }
        return parentsList;
    }
    
    public static List<String> getParentCaseTypes() {
    	List<String> parentsList = new ArrayList<>();
        List<CaseType> parents = _getParentCaseTypes();
        for (CaseType caseType : parents) {
        	parentsList.add(caseType.toString());
        }
        return parentsList;
    }

    public static List<String> getSubTypes(String parent) {
        CaseType[] subtypes = caseTypeMap.get(valueOf(parent));
        List<String> subtypeList = new ArrayList<>();
        for (CaseType caseType : subtypes) {
        	subtypeList.add(caseType.toString());
        }
        return subtypeList;
    }
}
