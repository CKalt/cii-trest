package com.cii.question;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AddressAnswer extends Answer {
    private String addr1;
    private String addr2;
    private String city;
    private String state;
    private String zip;
}
