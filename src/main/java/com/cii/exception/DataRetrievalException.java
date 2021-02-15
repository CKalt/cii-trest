package com.cii.exception;

@SuppressWarnings("serial")
public class DataRetrievalException extends Exception {
    public DataRetrievalException() {
    }

    public DataRetrievalException(String message) {
        super(message);
    }
    
    public DataRetrievalException(Throwable t) {
        super(t);
    }
}
