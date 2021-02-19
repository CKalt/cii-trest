package com.cii.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cii.query.FilterAndPageRequest;
import com.cii.rest.RestResponsePage;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import com.cii.model.notification.Notification;
import com.cii.model.notification.NotificationStatus;

@Repository
public class NotificationRestRepository extends RestRepository<Notification> {
    protected static final Logger LOGGER = LoggerFactory.getLogger(NotificationRestRepository.class);
    NotificationRestRepository() {
        super();
        this.pluralForm = "notifications";
        this.singularForm = "notification";
        this.classRef = Notification.class;
    }
	public List<Notification> findByStatusIn(String notificationStatuses) {
        String url = searchMethodUrl("findByStatusIn", "notificationStatuses");

        List<Notification> nns = doGetEntityList(url, Notification[].class, notificationStatuses);

        return nns;
    }
	public List<Notification> findByNegotiationIdOrderByCreateDateDesc(String negotiationId) {
        String url = searchMethodUrl("findByNegotiationIdOrderByCreateDateDesc", "negotiationId)");
        List<Notification> nns = doGetEntityList(url, Notification[].class, negotiationId);

        return nns;
    }
	public List<Notification> findAll() {
        String url = searchMethodUrl("findAllByOrderByNameAsc");
        List<Notification> nns = doGetEntityList(url, Notification[].class);
        return nns;
    }

    public Page<Notification> findAll(FilterAndPageRequest fprq) {
        ParameterizedTypeReference<RestResponsePage<Notification>> responseType =
                new ParameterizedTypeReference<RestResponsePage<Notification>>() {};
            
        Page<Notification> result = doPostForPage(fprq, responseType);

		return result;
    }
}
