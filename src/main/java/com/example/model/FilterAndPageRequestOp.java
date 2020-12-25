package com.example.model;
import java.util.HashMap;

public class FilterAndPageRequestOp extends HashMap<String,Object> { 
    public String fKey() {
        return (String) this.keySet().toArray()[0];
    }

    public Object fValue() {
        return this.values().toArray()[0];
    }
}
