package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import org.springframework.web.client.HttpStatusCodeException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.restservice.FilterAndPageRequest;

@RestController
public class FilterAndPageRequestController {
    Logger logger = LoggerFactory.getLogger(FilterAndPageRequestController.class);

	@GetMapping("/fprq")
	public FilterAndPageRequest filterAndPageRequest(@RequestParam(value = "name", defaultValue = "World") String name) {
        String foo = "wow";
        String bar = "it works!";
        int lmn = 20;
        String def = "hello";
        FilterAndPageRequest xyz = new FilterAndPageRequest();
        xyz.put("foo", foo);
        xyz.put("bar", bar);

        FilterAndPageRequest abc = new FilterAndPageRequest();
        abc.put("xyz", xyz);
        abc.put("lmn", lmn);

        FilterAndPageRequest fprq = new FilterAndPageRequest();
        fprq.put("abc", abc);
        fprq.put("def", def);

///////////////////////////////////////////////////////

//        FilterAndPageRequest fprq = new FilterAndPageRequest();
//        fprq.setPredicate(predicate);
//        fprq.setPageRequest(pageRequest);

        RestTemplate rest = new RestTemplate();
        String restEndPoint = "http://localhost:8081";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<FilterAndPageRequest> entity =
            new HttpEntity<FilterAndPageRequest>(fprq, headers);

        FilterAndPageRequest page = new FilterAndPageRequest();
        try {
            page =
                rest.postForObject(restEndPoint + "/userQuery", entity, FilterAndPageRequest.class);
        }
        catch (HttpStatusCodeException ex) {
            logger.error("Error posting to /userQuery rest endpoint");
        }

		return page;
	}
}
