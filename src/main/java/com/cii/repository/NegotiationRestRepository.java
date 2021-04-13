package com.cii.repository;

import com.cii.rest.RestResponsePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cii.query.FilterAndPageRequest;
import com.cii.model.negotiation.Negotiation;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Page;

import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class NegotiationRestRepository extends RestRepository<Negotiation> {
    protected static final Logger LOGGER = LoggerFactory.getLogger(NegotiationRestRepository.class);
    NegotiationRestRepository() {
        super();
        this.pluralForm = "negotiations";
        this.singularForm = "negotiation";
        this.classRef = Negotiation.class;
    }

    // -- not currently being called in cii_new
    /*
    @Query("{'urlKey': ?0, 'incident.citationNumber': ?1}")
    List<Negotiation> findByCitationNumber(String urlKey, String citationNumber);


    List<Negotiation> findByUrlKeyAndIncidentCleanCaseNumberAndIncidentDobBetween(String urlKey,
                                                                                  String caseNumber, Date start, Date end);

    List<Negotiation> findByUrlKeyAndIncidentTicketNumber(CaseSearchDTO searchDto, String ticketNumber);

    List<Negotiation> findByUrlKeyAndIncidentTicketNumberContains(CaseSearchDTO searchDto, String ticketNumber);
    */

    // -- replace with solr reqs

    public List<Negotiation> findByUrlKeyAndCaseTypeAndIncidentLicensePlateStateAndIncidentLicensePlate(
            String urlKey, String caseType, String plateState, String plateNumber) {
        String url = searchMethodUrl("findByUrlKeyAndCaseTypeAndIncidentLicensePlateStateAndIncidentLicensePlate", 
                "urlKey", "caseType", "plateState", "plateNumber");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey, caseType, plateState, plateNumber);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndCaseTypeAndIncidentDlStateAndIncidentDlnAndIncidentDob(String urlKey,
                                                                                            String caseType, String dlState, String dln, Date dob) {
        String url = searchMethodUrl("findByUrlKeyAndCaseTypeAndIncidentDlStateAndIncidentDlnAndIncidentDob", 
                "urlKey", "caseType", "dlState", "dln", "dob");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey, caseType, dlState, dln, dob);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndCaseTypeAndIncidentFirstnameAndIncidentLastnameAndIncidentDob(String urlKey,
                                                                                                   String caseType, String firstname, String lastname, Date dob) {
        String url = searchMethodUrl("findByUrlKeyAndCaseTypeAndIncidentFirstnameAndIncidentLastnameAndIncidentDob", 
                "urlKey", "caseType", "firstname", "lastname");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey, caseType, firstname, lastname);
        return negotiations;
    }

    public List<Negotiation> findByUrlKey(String urlKey) {
        String url = searchMethodUrl("findByUrlKey", "urlKey");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndWorkflowStateIdAndCaseType(
            String urlKey, String workflowStateId, String caseType) {
        String url = searchMethodUrl(
                "findByUrlKeyAndWorkflowStateIdAndCaseType",
                "urlKey", "workflowStateId", "caseType");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey, workflowStateId, caseType);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndWorkflowStateIdAndCaseSubType(
            String urlKey, String workflowStateId, String caseSubType) {
        String url = searchMethodUrl(
                "findByUrlKeyAndWorkflowStateIdAndCaseSubType",
                "urlKey", "workflowStateId", "caseSubType");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey, workflowStateId, caseSubType);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndAndWorkflowStateIdAndUpdateDateBetween(String urlKey, String workflowStateId, Date start, Date end) {
        String url = searchMethodUrl(
                "findByUrlKeyAndAndWorkflowStateIdAndUpdateDateBetween",
                "urlKey", "workflowStateId", "start", "end");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey, workflowStateId, start, end);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndCaseType(String urlKey, String caseType) {
        String url = searchMethodUrl(
                "findByUrlKeyAndCaseType", "urlKey", "caseType");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey, caseType);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndCaseTypeAndIncidentCleanCaseNumber(String urlKey, String caseType, String caseNumber) {
        String url = searchMethodUrl(
                "findByUrlKeyAndCaseTypeAndIncidentCleanCaseNumber", "urlKey",
                "caseType", "caseNumber");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey, caseType, caseNumber);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndIncidentCaseNumberIgnoreCase(String urlKey, String caseNumber) {
        String url = searchMethodUrl(
                "findByUrlKeyAndIncidentCaseNumberIgnoreCase", "urlKey",
                "caseNumber");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey, caseNumber);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndIncidentCaseNumber(String urlKey, String caseNumber) {
        String url = searchMethodUrl(
                "findByUrlKeyAndIncidentCaseNumber", "urlKey",
                "caseNumber");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey, caseNumber);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndIncidentCitationNumber(String urlKey, String citationNumber) {
        String url = searchMethodUrl(
                "findByUrlKeyAndIncidentCitationNumber", "urlKey",
                "citationNumber");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey, citationNumber);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndCaseTypeAndIncidentCleanCaseNumberAndIncidentDob(String urlKey,
                                                                                      String caseType, String caseNumber, Date dob) {
        String url = searchMethodUrl(
                "findByUrlKeyAndCaseTypeAndIncidentCleanCaseNumberAndIncidentDob", "urlKey",
                "caseType", "caseNumber", "dob");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey, caseType, caseNumber, dob);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndCaseTypeAndIncidentSubCasesCleanCaseNumberAndIncidentDob(String urlKey,
                                                                                              String caseType, String caseNumber, Date dob) {
        String url = searchMethodUrl(
                "findByUrlKeyAndCaseTypeAndIncidentSubCasesCleanCaseNumberAndIncidentDob", "urlKey",
                "caseType", "caseNumber", "dob");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey, caseType, caseNumber, dob);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndCaseTypeAndOptionValuesStatus(String urlKey, String caseType, String status) {
        String url = searchMethodUrl(
                "findByUrlKeyAndCaseTypeAndOptionValuesStatus", "urlKey",
                "caseType", "status");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey, caseType, status);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndCaseTypeAndOptionValuesHasDismissedSubcase(String urlKey, String caseType, boolean hasDismissedSubcase) {
        String url = searchMethodUrl(
                "findByUrlKeyAndCaseTypeAndOptionValuesHasDismissedSubcase", "urlKey",
                "caseType", "hasDismissedSubcase");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey, caseType, hasDismissedSubcase);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndIncidentDlStateAndIncidentDlnAndIncidentDobBetween(String urlKey,
                                                                                        String dlState, String dln, Date start, Date end) {
        String url = searchMethodUrl(
                "findByUrlKeyAndIncidentDlStateAndIncidentDlnAndIncidentDobBetween", "urlKey",
                "dlState", "dln", "start", "end");
        List<Negotiation> negotiations = doGetEntityList(url,
            Negotiation[].class, urlKey, dlState, dln, start, end);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndIncidentCitationNumberContainsAndIncidentDobBetween(String urlKey,
                                                                                         String caseNumber, Date start, Date end) {
        String url = searchMethodUrl(
                "findByUrlKeyAndIncidentCitationNumberContainsAndIncidentDobBetween", "urlKey",
                "caseNumber", "start", "end");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, caseNumber, start, end);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndCaseTypeAndIncidentArraignDateIsNull(String urlKey, String caseType) {
        String url = searchMethodUrl(
                "findByUrlKeyAndCaseTypeAndIncidentArraignDateIsNull", "urlKey",
                "caseType");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, caseType);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndCaseTypeAndCreateDateBetween(String urlKey, String caseType, Date start, Date end) {
        String url = searchMethodUrl(
                "findByUrlKeyAndCaseTypeAndCreateDateBetween", "urlKey",
                "caseType", "start", "end");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, caseType, start, end);
        return negotiations;
    }

    //@Query("{'urlKey': ?0, 'caseType': ?1, 'optionValues.dueDate': {$ne:null}, approved: {$ne:null}, 'optionValues.paid': null, 'optionValues.expired': {$ne:true}, 'optionValues.cancelled': {$ne:true}}")
    public List<Negotiation> findPendingUnpaid(String urlKey, String caseType) {
        String url = searchMethodUrl( "findPendingUnpaid", "urlKey",
                "caseType");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, caseType);
        return negotiations;
    }

    //@Query("{'urlKey': ?0, 'caseType': ?1, 'optionValues.firstPaymentDate': {$ne:null}, approved: {$ne:null}, 'optionValues.paid': null, 'optionValues.expired': {$ne:true}, 'optionValues.cancelled': {$ne:true}}")
    public List<Negotiation> findPendingPayPlan(String urlKey, String caseType) {
        String url = searchMethodUrl( "findPendingPayPlan", "urlKey",
                "caseType");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, caseType);
        return negotiations;
    }

    //@Query("{'urlKey': ?0, 'parties': {$elemMatch: {'partyId': ?1}}}")
    public List<Negotiation> findByUrlKeyAndPartyId(String urlKey, String partyId) {
        String url = searchMethodUrl( "findByUrlKeyAndPartyId", "urlKey",
                "partyId");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, partyId);
        return negotiations;
    }

    //@Query("{'urlKey': ?0, 'partyList.users': {$elemMatch: {'userId': ?1}}}")
    public List<Negotiation> findByUrlKeyAndUserId(String urlKey, String partyId) {
        String url = searchMethodUrl( "findByUrlKeyAndUserId", "urlKey",
                "partyId");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, partyId);
        return negotiations;
    }

    /*
    @Query("{'urlKey': ?0, 'partyList.users': {$elemMatch: {'userId': ?1}}}")
    Page<Negotiation> findByUrlKeyAndUserId(String urlKey, String partyId, Pageable pageRequest);
    */

    //@Query("{'urlKey': ?0, 'incident.cleanCaseNumber': ?1}")
    public List<Negotiation> findByCleanCaseNumber(String urlKey, String cleanCaseNumber) {
        String url = searchMethodUrl( "findByCleanCaseNumber", "urlKey",
                "cleanCaseNumber");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, cleanCaseNumber);
        return negotiations;
    }

    //@Query("{'urlKey': ?0, 'caseType': ?1, 'optionValues.options.surveySent': null, 'optionValues.options.finalized': {$ne:null}}")
    public List<Negotiation> findByFinalizedAndSurveyNotSent(String urlKey, String caseType) {
        String url = searchMethodUrl( "findByFinalizedAndSurveyNotSent", "urlKey",
                "caseType");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, caseType);
        return negotiations;
    }

    //@Query("{'urlKey': ?0, 'caseType': ?1, 'optionValues.options.dataExported': null}")
    public List<Negotiation> findByDataNotExported(String urlKey, String caseType) {
        String url = searchMethodUrl( "findByDataNotExported", "urlKey",
                "caseType");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, caseType);
        return negotiations;
    }

    //@Query("{'urlKey': ?0, 'caseType': ?1, 'optionValues.options.dataExported': null, 'closed' : true}")
    public List<Negotiation> findByDataNotExportedAndClosed(String urlKey, String caseType) {
        String url = searchMethodUrl( "findByDataNotExportedAndClosed", "urlKey",
                "caseType");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, caseType);
        return negotiations;
    }

    //@Query("{'urlKey': ?0, '$or':[{'optionValues.options.party1DataExported': null}, {'optionValues.options.party2DataExported': null}] }")
    public List<Negotiation> findByParty1OrParty2DataNotExported(String urlKey) {
        String url = searchMethodUrl( "findByParty1OrParty2DataNotExported", "urlKey");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey);
        return negotiations;
    }

    //@Query("{'urlKey': ?0, 'incident.firstname': {$regex: '?1', $options: 'i'}, 'incident.lastname': {$regex: '?2', $options: 'i'}}")
    public List<Negotiation> findByUrlKeyAndIncidentFirstnameAndIncidentLastname(String urlKey, String firstname, String lastname) {
        String url = searchMethodUrl( "findByUrlKeyAndIncidentFirstnameAndIncidentLastname", "urlKey",
                "firstname", "lastname");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, firstname, lastname);
        return negotiations;
    }

    //@Query("{'urlKey': ?0, 'incident.firstname': {$regex: '?1', $options: 'i'}, 'incident.lastname': {$regex: '?2', $options: 'i'}, 'incident.dob': ?3}")
    public List<Negotiation> findByUrlKeyAndIncidentFirstnameAndIncidentLastnameAndIncidentDob(String urlKey, String firstname, String lastname, Date dob) {
        String url = searchMethodUrl( "findByUrlKeyAndIncidentFirstnameAndIncidentLastnameAndIncidentDob", "urlKey",
                "firstname", "lastname", "dob");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, firstname, lastname, dob);
        return negotiations;
    }

    //@Query("{'urlKey': ?0, 'incident.caseNumber': {$regex: '?1', $options: 'i'}}")
    public List<Negotiation> findByUrlKeyAndIncidentCaseNumberContains(String urlKey, String caseNumber) {
        String url = searchMethodUrl( "findByParty1OrParty2DataNotExported", "urlKey",
                "caseNumber");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, caseNumber);
        return negotiations;
    }

    //@Query("{'urlKey': ?0, 'incident.citationNumber': {$regex: '?1', $options: 'i'}}")
    public List<Negotiation> findByUrlKeyAndIncidentCitationNumberContains(String urlKey, String citationNumber) {
        String url = searchMethodUrl( "findByUrlKeyAndIncidentCitationNumberContains", "urlKey",
                "citationNumber");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, citationNumber);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndIncidentCleanCaseNumberContainsAndIncidentDobBetween(String urlKey, String toUpperCase, Date start, Date end) {
        String url = searchMethodUrl( "findByUrlKeyAndIncidentCleanCaseNumberContainsAndIncidentDobBetween", "urlKey",
                "toUpperCase", "start", "end");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, toUpperCase, start, end);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndCaseTypeAndDateBetween(String urlKey, String caseType, Date start, Date end) {
        String url = searchMethodUrl( "findByUrlKeyAndCaseTypeAndDateBetween", "urlKey",
                "caseType", "start", "end");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, caseType, start, end);
        return negotiations;
    }

    public List<Negotiation> findByUrlKeyAndIncidentFirstnameAndIncidentLastnameAndIncidentDobBetween(String urlKey, String firstname, String lastname, Date start, Date end) {
        String url = searchMethodUrl( "findByUrlKeyAndIncidentFirstnameAndIncidentLastnameAndIncidentDobBetween", "urlKey",
                "firstname", "lastname", "start", "end");
        List<Negotiation> negotiations = doGetEntityList(url,
                Negotiation[].class, urlKey, firstname, lastname, start, end);
        return negotiations;
    }

    // --  END replace with solr reqs

    public Page<Negotiation> findAll(FilterAndPageRequest fprq) {
        ParameterizedTypeReference<RestResponsePage<Negotiation>> responseType =
                new ParameterizedTypeReference<RestResponsePage<Negotiation>>() {};
            
        Page<Negotiation> result = doPostForPage(fprq, responseType);

		return result;
    }

    public Page<Negotiation> findByUserIdAndUrlKey(FilterAndPageRequest fprq,
            String userId, String urlKey) {
        ParameterizedTypeReference<RestResponsePage<Negotiation>> responseType =
                new ParameterizedTypeReference<RestResponsePage<Negotiation>>() {};
            
        Page<Negotiation> result = doPostForPage(fprq, responseType, 
                new String[]{"urlKey", "userId"}, urlKey, userId);

		return result;
    }

	public Negotiation findById(String id) {
        String url = searchMethodUrl("findByIdOrderByIdAsc", "id");
        List<Negotiation> negotiations = doGetEntityList(url, Negotiation[].class, id);
        return negotiations.isEmpty() ? null : negotiations.get(0);
    }
}
