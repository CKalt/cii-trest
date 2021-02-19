package com.cii.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.cii.exception.DataRetrievalException;


public abstract class RestClient<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestClient.class);
    
    protected boolean isLoggedIn = false;
    protected String sessionId;
    protected HttpComponentsClientHttpRequestFactory requestFactory;
    
    protected abstract String getResourceUrl();
    protected abstract String getLoginUser();
    protected abstract String getLoginPassword();
    protected abstract int getConnectionTimeout();

    protected ResponseEntity<String> executeExchange(String queryString) throws DataRetrievalException {
        if (!isLoggedIn()) {
                doLogin();
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cookie", getSessionId());
        HttpEntity<String> requestEntity = new HttpEntity<String>(null, headers);
        try {
             ResponseEntity<String> entity = exchange(queryString, HttpMethod.GET, requestEntity, String.class);
             return entity;
        }
        catch(RestClientException e) {
            LOGGER.warn("Error sending query {}, {}", queryString, e);
            throw new DataRetrievalException(e);
        }
    }
    
    protected ResponseEntity<String> exchange(String url, HttpMethod method,
            HttpEntity<?> requestEntity, Class<String> responseType) {
        if (requestFactory == null) {
            requestFactory = new HttpComponentsClientHttpRequestFactory();
            requestFactory.setConnectTimeout(getConnectionTimeout());
        }
        RestTemplate template = new RestTemplate(requestFactory);
        return template.exchange(url, method, requestEntity, responseType);
    }
   
    
    protected boolean isLoggedIn() {
        return isLoggedIn;
    }
    
    protected String getSessionId() {
        return sessionId;
    }
    
    public void doLogin() throws DataRetrievalException {
        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
        parameters.add("username", getLoginUser());
        parameters.add("password", getLoginPassword());
        HttpHeaders headers = new HttpHeaders();
        
        HttpEntity<MultiValueMap<String, String>> requestEntity = 
                new HttpEntity<MultiValueMap<String, String>>(parameters, headers);

        String cookies = null;
        sessionId = null;
        try {
            ResponseEntity<String> respEntity = exchange(getResourceUrl() + "/login", HttpMethod.POST,
                    requestEntity, String.class);
            HttpHeaders respHeaders = respEntity.getHeaders();
            cookies = respHeaders.getFirst("Set-Cookie");
        }
        catch (RestClientException ex) {
            LOGGER.warn("Error sending login request", ex);
            throw new DataRetrievalException(ex);
        }
        
        if (cookies != null) {
            String[] parts = cookies.split(";");
            for (int i = 0; i < parts.length; i++) {
                if (parts[i].contains("JSESSIONID")) {
                    sessionId = parts[i].trim();
                    break;
                }
            }
        }
        
        if (sessionId == null) {
            LOGGER.error("Login failed");
            throw new DataRetrievalException();
        }
    }

}
