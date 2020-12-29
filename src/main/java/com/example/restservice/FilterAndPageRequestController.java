package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.core.ParameterizedTypeReference;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;

import com.example.model.user.Role;
import com.example.model.user.User;
import com.example.model.user.User;
import com.example.model.user.QUser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.model.FilterAndPageRequest;
import com.example.model.FilterAndPageRequestOp;

@RestController
public class FilterAndPageRequestController {
    Logger logger = LoggerFactory.getLogger(FilterAndPageRequestController.class);

	@GetMapping("/greeting")
        
    public Page<User> greeting(
                @RequestParam(value = "name", defaultValue = "World") String name) {
        String sortAttribute = "username";
        String urlKey = "GADCSC";

//        BooleanBuilder filter = new BooleanBuilder();
        FilterAndPageRequest fprq = new FilterAndPageRequest();
/////////////////////////
//        filter.and(QUser.user.urlKey.eq(urlKey));
/////////////////////////
        fprq.addOp("andQUserUrlKeyEq", urlKey);
/////////////////////////
//        filter.and(QUser.user.role.eq(Role.ROLE_COURT));
/////////////////////////
        fprq.addOp("andQUseRoleEq", Role.ROLE_COURT);
/////////////////////////
        int pageIndex = 0;
        int pageSize = 50;
//        PageRequest pageRequest = PageRequest.of(pageIndex, pageSize,
//                Sort.by(Sort.Direction.DESC,"createdAt"));
/////////////////////////
        fprq.addOp("sortDirection", Sort.Direction.ASC);
        fprq.addOp("sortByItem", "username");
/////////////////////////
        fprq.addPageRequestOp(pageIndex, pageSize);
/////////////////////////

        RestTemplate rest = new RestTemplate();
        String restEndPoint = "http://localhost:8081";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ParameterizedTypeReference<RestResponsePage<User>> responseType =
                new ParameterizedTypeReference<RestResponsePage<User>>() {};

        HttpEntity<FilterAndPageRequest> entity =
            new HttpEntity<FilterAndPageRequest>(fprq, headers);

        ResponseEntity<RestResponsePage<User>> result = null;
        try {
            result = rest.exchange(restEndPoint + "/userQuery", HttpMethod.POST,
                        entity, responseType);
        }
        catch (HttpStatusCodeException ex) {
            logger.error("Error posting to /userQuery rest endpoint");
        }

		return result.getBody();
	}
}
