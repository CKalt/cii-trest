package com.cii.repository;

import java.net.URI;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import org.springframework.data.domain.Page;

import com.cii.bean.ModelWithIdAccessInterface;
import com.cii.rest.RestResponsePage;
import com.cii.query.FilterAndPageRequest;

public class RestRepository<T extends ModelWithIdAccessInterface> {
    protected static final Logger LOGGER = LoggerFactory.getLogger(RestRepository.class);
    protected static String restEndPoint;
    private final RestTemplate rest;
    protected String pluralForm;
    protected String singularForm;
    protected String findBySort;
    protected Class<T> classRef;
    protected Class<T[]> classARef;

    RestRepository() {
        rest = new RestTemplate();
    }

    // url template helpers (TODO make these static)

    String buildMethodBindingStr(String ...bindings) {
        return buildMethodBindingStrFromArr(bindings);
    }

    String buildMethodBindingStrFromArr(String[] bindings) {
        if (bindings.length == 0) {
            return "";
        }
        String bindingStr = "";
        String sep = "?";
        for (String binding : bindings) {
            bindingStr = bindingStr + sep + binding + "={" + binding + "}";
            sep = "&";
        }
        return bindingStr;
    }

    String searchMethodUrl(String verb, String... bindings) {
        String bindingStr = buildMethodBindingStr(bindings);
        return restEndPoint + "/" + pluralForm + "/search/" + verb + bindingStr;
    }

    private String queryMethodUrl(String[] bindings) {
        String bindingStr = buildMethodBindingStr(bindings);
        return restEndPoint + "/" + singularForm + "Query" + bindingStr;
    }

    String locationUrl() {
        return restEndPoint + "/" + pluralForm + "/{id}";
    }

    String collectionUrl() {
        return restEndPoint + "/" + pluralForm;
    }

    String findAllUrl() {
        return restEndPoint + "/findAllByOrderBy" + findBySort;
    }

    public static void config(Environment env) {
        // set restEndPoint ( inherited, protected and static )
        String restDbHost = env.getProperty("restDbHost");
        String restDbPort = env.getProperty("restDbPort");
        if (restDbHost == null) { restDbHost = "http://localhost"; }
        if (restDbPort == null) { restDbPort = "8081"; }

        restEndPoint =  restDbHost + ":" + restDbPort;
    }

    public T doGetForObject(String url, Class<T> responseType, Object... uriVariables) {
        T obj = null;

        try {
            obj = rest.getForObject(url, responseType, uriVariables);
        }
        catch (HttpStatusCodeException ex) {
            if (ex.getStatusCode() != HttpStatus.NOT_FOUND) {
                throw ex;
            }
        }

        return obj;
    }

    public T doGetExchange(String uri, Class<T> klass, Object ...uriVariables) {
        T obj = null;
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<T> entity = new HttpEntity<T>(obj, headers);
            ResponseEntity<T> response = rest.exchange(
                uri, HttpMethod.GET, entity, klass, uriVariables);
            obj = response.getBody();
        }
        catch (HttpStatusCodeException ex) {
            if (ex.getStatusCode() != HttpStatus.NOT_FOUND) {
                throw ex;
            }
        }

        return obj;
    }

    public T doGetExchange(String uri, Map<String, Object> vars, Class<T> klass) {
        T obj = null;
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<T> entity = new HttpEntity<T>(obj, headers);
            ResponseEntity<T> response = rest.exchange(
                uri, HttpMethod.GET, entity, klass, vars);
            obj = response.getBody();
        }
        catch (HttpStatusCodeException ex) {
            if (ex.getStatusCode() != HttpStatus.NOT_FOUND) {
                throw ex;
            }
        }

        return obj;
    }
    public Page<T> doPostForPage(
                FilterAndPageRequest fprq,
                ParameterizedTypeReference<RestResponsePage<T>> responseType) {
        return doPostForPage(fprq, responseType, new String[]{});
    }
    public Page<T> doPostForPage(
                FilterAndPageRequest fprq,
                ParameterizedTypeReference<RestResponsePage<T>> responseType,
                String [] bindingNames,
                Object ...bindings) {
        String url = queryMethodUrl(bindingNames);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<FilterAndPageRequest> entity =
            new HttpEntity<FilterAndPageRequest>(fprq, headers);

        ResponseEntity<RestResponsePage<T>> result = null;
        try {
            result = rest.exchange(url, HttpMethod.POST,
                        entity, responseType, bindings);
        }
        catch (HttpStatusCodeException ex) {
            LOGGER.error("Error posting to /userQuery rest endpoint");
        }

		return result.getBody();
    }

    public List<T> doGetEntityList(
                String url, Map<String, Object> vars, Class<T[]> klass) {
        List<T> result = null;
        try {
            ResponseEntity<T[]> response = rest.getForEntity(url, klass, vars);
            T[] entities = response.getBody();
            result = Arrays.asList(entities);
        }
        catch (HttpStatusCodeException ex) {
            if (ex.getStatusCode() != HttpStatus.NOT_FOUND) {
                throw ex;
            }
        }

        return result;
    }

    public List<T> doGetEntityList(String url, Class<T[]> klass, Object... urlVariables) {
        List<T> result = null;
        try {
            ResponseEntity<T[]> response = rest.getForEntity(url, klass, urlVariables);
            T[] entities = response.getBody();
            result = Arrays.asList(entities);
        }
        catch (HttpStatusCodeException ex) {
            if (ex.getStatusCode() != HttpStatus.NOT_FOUND) {
                throw ex;
            }
        }

        return result;
    }

    public T findOneById(String id) {
        String url = locationUrl();
        T obj = doGetExchange(url, classRef, id);

        return obj;
    }

    public List<T> findAllList() {
        // findAllList is not to be confused by findAll which for querydsl implementation
        // returns a Page<T>. This method does not use querydsl.
        String url = findAllUrl();
        List<T> configs = doGetEntityList(url, classARef);
        return configs;
    }

    public T save(T obj) {
        String id = obj.getId();
        String newId = save(obj, id);

        if (newId != null) {
            obj.setId(newId);
        }

        return obj;
    }

    public List<T> save(List<T> objs) {
        for (T obj : objs) {
            save(obj);
        }

        return objs;
    }

    public <T> String save(T obj, String id) {
        String newId = null;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<T> entity = new HttpEntity<T>(obj, headers);

        boolean doPost = true;
        if (id != null) {
            doPost = false;
            try {
                String url = locationUrl();
                rest.put(url, entity, id);
            }
            catch (HttpStatusCodeException ex) {
                if (ex.getStatusCode() == HttpStatus.NOT_FOUND) {
                    doPost = true;
                }
                else {
                    throw ex;
                }
            }
        }

        if (doPost) {
            // rest POST to cause insert
            String url = collectionUrl();
            URI location = rest.postForLocation(url, entity);
            // grab id from location and store it in POJO
            String newUri = location.toString();
            newId = newUri.substring(newUri.lastIndexOf('/') + 1);
        }

        return newId; // null unless created
    }

    public void delete(T obj) {
        String id = obj.getId();
        delete(id);
    }

    public void delete(String id) {
        String url = locationUrl();
        rest.delete(url, id);
    }
}

