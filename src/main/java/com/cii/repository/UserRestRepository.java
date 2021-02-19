package com.cii.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.core.ParameterizedTypeReference;

import com.cii.model.user.Role;
import com.cii.model.user.User;
import com.cii.query.FilterAndPageRequest;
import com.cii.rest.RestResponsePage;

@Repository
public class UserRestRepository extends RestRepository<User> {
    protected static final Logger LOGGER = LoggerFactory.getLogger(UserRestRepository.class);
    UserRestRepository() {
        super();
        this.pluralForm = "users";
        this.singularForm = "user";
        this.classRef = User.class;
    }

	public User findByRoleAndUsername(Role role, String username) {
        String url = searchMethodUrl("findByRoleAndUsername", "role",
                "username");
        User user = doGetExchange(url, User.class, role, username);
        return user;
    }

	public User findByUrlKeyAndUsername(String urlKey, String username) {
        String url = searchMethodUrl("findByUrlKeyAndUsername", "urlKey",
                "username");
        User user = doGetExchange(url, User.class, urlKey, username);
        return user;
    }

	public User findByUrlKeyAndRoleAndUsername(String urlKey, Role role, String username) {
        String url = searchMethodUrl("findByUrlKeyAndRoleAndUsername",
                "urlKey", "role", "username");
        User user = doGetExchange(url, User.class, urlKey, role, username);

        return user;
    }

	public User findByPasswordToken(String token) {
        String url = searchMethodUrl("findByPasswordToken", "token");
        User user = doGetExchange(url, User.class, token);
        return user;
    }

	public User findByUsername(String username) {
        String url = searchMethodUrl("findByUsername", "username");
        User user = doGetExchange(url, User.class, username);
        return user;
    }

	public User findByUsernameAndUrlKey(String username, String urlKey) {
        String url = searchMethodUrl("findByUsernameAndUrlKey", "username",
                "urlKey");
        User user = doGetExchange(url, User.class, username, urlKey);
        return user;
    }

	public User findByUsernameToken(String token) {
        String url = searchMethodUrl("findByUsernameToken", "token");
        User user = doGetExchange(url, User.class, token);
        return user;
    }

	public User findByPhoneToken(String token) {
        String url = searchMethodUrl("findByPhoneToken", "token");
        User user = doGetExchange(url, User.class, token);
        return user;
    }

	public User findByPartyIdsContaining(String partyId) {
        String url = searchMethodUrl("findByPartyIdsContaining", "partyId");
        User user = doGetExchange(url, User.class, partyId);
        return user;
    }

	public List<User> findByUrlKeyAndPartyIdsContaining(String urlKey, String partyId) {
        String url = searchMethodUrl("findByUrlKeyAndPartyIdsContaining",
                "urlKey", "partyId");
        List<User> users = doGetEntityList(url, User[].class, urlKey, partyId);
        return users;
    }

	public List<User> findByUrlKeyAndAccessAndLocked(String urlKey, String access, boolean locked) {
        String url = searchMethodUrl("findByUrlKeyAndAccessAndLocked",
                "urlKey", "access", "locked");
        List<User> users = doGetEntityList(url, User[].class, urlKey, access,
                locked);
        return users;
    }

	public List<User> findByRoleOrderByUsernameAsc(Role role) {
        String url = searchMethodUrl("findByRoleOrderByUsernameAsc", "role");
        List<User> users = doGetEntityList(url, User[].class, role);
        return users;
    }

	public List<User> findByUrlKeyAndRoleOrderByUsernameAsc(String urlKey, Role role) {
        String url = searchMethodUrl("findByUrlKeyAndRoleOrderByUsernameAsc",
                "urlKey", "role");
        List<User> users = doGetEntityList(url, User[].class, urlKey, role);
        return users;
    }

	public List<User> findByUrlKeyAndRoleAndMediationCenters(String urlKey, Role role, String mediationCenter) {
        String url = searchMethodUrl("findByUrlKeyAndRoleAndMediationCenters",
                "urlKey", "role", "mediationCenter");
        List<User> users = doGetEntityList(url, User[].class, urlKey, role,
                mediationCenter);
        return users;
    }

    public Page<User> findAll(FilterAndPageRequest fprq) {
        ParameterizedTypeReference<RestResponsePage<User>> responseType =
                new ParameterizedTypeReference<RestResponsePage<User>>() {};
            
        Page<User> result = doPostForPage(fprq, responseType);

		return result;
    }
}
