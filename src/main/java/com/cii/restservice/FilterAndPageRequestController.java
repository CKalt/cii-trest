package com.cii.restservice;

import java.text.ParseException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

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
import org.springframework.beans.factory.annotation.Autowired;

import com.cii.model.user.Role;
import com.cii.model.user.User;
import com.cii.model.job.JobInfo;
import com.cii.model.notification.Notification;
import com.cii.model.config.Configuration;
import com.cii.model.negotiation.NegotiationAggregate;
import com.cii.model.negotiation.NegotiationWorkflowStateAggregate;
import com.cii.model.audit.CaseSearchAuditAggregate;
import com.cii.model.court.WorkflowStateSummary;

import com.cii.repository.NotificationRestRepository;
import com.cii.repository.ConfigurationRestRepository;
import com.cii.repository.UserRestRepository;
import com.cii.repository.NegotiationAggregateRestRepository;
import com.cii.repository.CaseSearchAuditAggregateRestRepository;
import com.cii.repository.NegotiationWorkflowStateAggregateRestRepository;
import com.cii.repository.WorkflowStateSummaryAggregateRestRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cii.query.FilterAndPageRequest;

@RestController
public class FilterAndPageRequestController {
    Logger logger = LoggerFactory.getLogger(FilterAndPageRequestController.class);

    @Autowired
    UserRestRepository userRestRepository;

    @Autowired
    NotificationRestRepository notificationRestRepository;

    @Autowired
    ConfigurationRestRepository configurationRestRepository;

    @Autowired
    NegotiationAggregateRestRepository negotiationAggregateRestRepository;

    @Autowired
    CaseSearchAuditAggregateRestRepository caseSearchAuditAggregateRestRepository;

    @Autowired
    NegotiationWorkflowStateAggregateRestRepository
            negotiationWorkflowStateAggregateRestRepository;

    @Autowired
    WorkflowStateSummaryAggregateRestRepository
            workflowStateSummaryAggregateRestRepository;

	@GetMapping("/userQuery")
    public Page<User> userQuery(
                @RequestParam(value = "sortAttr", defaultValue = "username") String sortAttr) {
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

	@GetMapping("/jobInfoQuery")
    public Page<JobInfo> jobInfoQuery(
                @RequestParam(value = "sortAttr", defaultValue = "name") String sortAttr) {
        String urlKey = "AZSMC";

//   BooleanBuilder filter = new BooleanBuilder();
        FilterAndPageRequest fprq = new FilterAndPageRequest();

//   builder.and(QJobInfo.jobInfo.executeDate.after(thisDate));
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date thisDate = null;
        try {
            thisDate = df.parse("2019-11-24 13:15:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        fprq.addOp("andQJobInfoEDateAfter", df.format(thisDate));

//   builder.and(QJobInfo.jobInfo.urlKeys.containsIgnoreCase(filter.getValue()));
        fprq.addOp("andQJobInfoUrlKeysContains", urlKey);

//   builder.andAnyOf(QJobInfo.jobInfo.name.containsIgnoreCase(filter.getValue()));
        fprq.addOp("andAnyQJobInfoNameContains", "Scottsdale Plea Import");

        int pageIndex = 0;
        int pageSize = 50;
//        PageRequest pageRequest = PageRequest.of(pageIndex, pageSize,
//                Sort.by(Sort.Direction.DESC,"createdAt"));
/////////////////////////
        fprq.addOp("sortDirection", Sort.Direction.ASC);
        fprq.addOp("sortByItem", sortAttr);
/////////////////////////
        fprq.addPageRequestOp(pageIndex, pageSize);
/////////////////////////

        RestTemplate rest = new RestTemplate();
        String restEndPoint = "http://localhost:8081";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ParameterizedTypeReference<RestResponsePage<JobInfo>> responseType =
                new ParameterizedTypeReference<RestResponsePage<JobInfo>>() {};

        HttpEntity<FilterAndPageRequest> entity =
            new HttpEntity<FilterAndPageRequest>(fprq, headers);

        ResponseEntity<RestResponsePage<JobInfo>> result = null;
        try {
            result = rest.exchange(restEndPoint + "/jobInfoQuery", HttpMethod.POST,
                        entity, responseType);
        }
        catch (HttpStatusCodeException ex) {
            logger.error("Error posting to /jobInfoQuery rest endpoint");
        }

		return result.getBody();
	}

	@GetMapping("/notificationQuery")
    public Page<Notification> notificationQuery(
                @RequestParam(value = "id") String id) {

        RestTemplate rest = new RestTemplate();
        String restEndPoint = "http://localhost:8081";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ParameterizedTypeReference<RestResponsePage<Notification>> responseType =
                new ParameterizedTypeReference<RestResponsePage<Notification>>() {};

        FilterAndPageRequest fprq = new FilterAndPageRequest();
        HttpEntity<FilterAndPageRequest> entity =
            new HttpEntity<FilterAndPageRequest>(fprq, headers);

        ResponseEntity<RestResponsePage<Notification>> result = null;
        try {
            result = rest.exchange(restEndPoint + "/notificationQuery", HttpMethod.GET,
                        entity, responseType);
        }
        catch (HttpStatusCodeException ex) {
            logger.error("Error posting to /notificationQuery rest endpoint");
        }

		return result.getBody();
	}

	@GetMapping("/notificationListByNegotiationId")
    public List<Notification> notificationListByNegotiationId(
                @RequestParam(value = "negotiationId",
                defaultValue = "5fc93b2e314da8000116e959") String negotiationId) {
        List<Notification> nns =
            notificationRestRepository.findByNegotiationIdOrderByCreateDateDesc(negotiationId);
		return nns;
    }

	@GetMapping("/notificationListByStatuses")
    public List<Notification> notificationListByStatuses(
                @RequestParam(value = "statuses", defaultValue = "ERROR") String statuses) {

        List<Notification> nns = notificationRestRepository.findByStatusIn(statuses);
		return nns;
    }

	@GetMapping("/notificationFindOne")
    public Notification notificationFindOne(
                @RequestParam(value = "id", defaultValue = "5c98efcd3ae1053be0d42bb4") String id) {
        Notification nn = notificationRestRepository.findOneById(id);
		return nn;
    }

	@GetMapping("/userFindByRole")
    public List<User> userFindByRole(
                @RequestParam(value = "role", defaultValue = "ROLE_COURT") Role role) {
        List<User> users =
            userRestRepository.findByRoleOrderByUsernameAsc(role);
		return users;
    }

	@GetMapping("/configurationFindOne")
    public Configuration configurationFindOne(
                @RequestParam(value = "id", defaultValue = "5cf55047643a1f0001f5cab6") String id) {
        Configuration config = configurationRestRepository.findById(id);
		return config;
    }

	@GetMapping("/negotiationAggregates")
    public List<NegotiationAggregate> negotiationAggregate() {
        List<NegotiationAggregate> negotiationAggregates =
            negotiationAggregateRestRepository.getAggregates();

		return negotiationAggregates;
    }

	@GetMapping("/caseSearchAuditAggregates")
    public List<CaseSearchAuditAggregate> caseSearchAuditAggregate() {
        List<CaseSearchAuditAggregate> caseSearchAuditAggregates =
            caseSearchAuditAggregateRestRepository.getAggregates();

		return caseSearchAuditAggregates;
    }

	@GetMapping("/caseSearchAuditAggregates/string")
    public String caseSearchAuditAggregateString() {
        String caseSearchAuditAggregationString =
            caseSearchAuditAggregateRestRepository.getAggregatesString();

		return caseSearchAuditAggregationString;
    }

	@GetMapping("/negotiationWorkflowStateAggregates")
    public List<NegotiationWorkflowStateAggregate> negotiationWorkflowStateAggregate() {
        String userId = "5fcd3de1b61ca4d0bbfef891";
        String courtId = "5afc3a5e3ae1050eca03bf15";
        String caseType = "SOLICITOR_JUDGE";
        List<String> accessibleIds =
            new ArrayList<String>(Arrays.asList(
                new String[]{
                    "gadcsc-ao-1",
                    "gadcsc-ao-2",
                    "gadcsc-ao-3",
                    "gadcsc-ao-4",
                    "gadcsc-ao-5",
                    "gadcsc-ao-7",
                    "gadcsc-ao-8",
                    "gadcsc-ao-8a",
                    "gadcsc-ao-10",
                    "gadcsc-ao-9" }));

        List<String> restrictedRoles = null;

        List<NegotiationWorkflowStateAggregate> negotiationWorkflowStateAggregates =
            negotiationWorkflowStateAggregateRestRepository.getAggregates(
                        userId,
                        courtId,
                        caseType,
                        accessibleIds,
                        restrictedRoles
                    );

		return negotiationWorkflowStateAggregates;
    }

	@GetMapping("/courtWorkflowSummary")
    public List<WorkflowStateSummary> courtWorkflowSummary() {
        String urlKey = "GADCSC";
        List<WorkflowStateSummary> courtWorkflowSummaries =
            workflowStateSummaryAggregateRestRepository.getAggregates(urlKey);

		return courtWorkflowSummaries;
    }
}
