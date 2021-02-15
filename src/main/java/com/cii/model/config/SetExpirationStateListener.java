package com.cii.model.config;

public class SetExpirationStateListener extends StateListener {
    private boolean expired = true;    
    
    public boolean getExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }
}
