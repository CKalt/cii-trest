package com.example.model;

import java.util.HashMap;
import java.util.ArrayList;
import com.example.model.FilterAndPageRequestOp;
import com.example.model.user.QUser;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import com.querydsl.core.BooleanBuilder;
import com.example.model.user.Role;

public class FilterAndPageRequest extends ArrayList<FilterAndPageRequestOp> {
    private BooleanBuilder filter;
    private PageRequest pageRequest;

    public FilterAndPageRequest() {
        this.filter = null;
        this.pageRequest = null;
    }

    public BooleanBuilder getBooleanBuilder() {
        return this.filter;
    }

    public PageRequest getPageRequest() {
        return this.pageRequest;
    }

    public BooleanBuilder execute() {
        this.filter = new BooleanBuilder();
        for (FilterAndPageRequestOp fop : this) {
            String op = fop.fKey();
            Object obj = fop.fValue();
            this.doOp(op, obj);
        }
        return this.filter;
    }

    public void addPageRequestOp(int pageIndex, int pageSize, String sortBy) {
        FilterAndPageRequestOp fopArgs = new FilterAndPageRequestOp();
        fopArgs.put("pageIndex", pageIndex);
        fopArgs.put("pageSize", pageSize);
        fopArgs.put("sortBy", sortBy);
        this.addOp("PageRequestOf", fopArgs);
    }

    public void addOp(String op, Object arg) {
        FilterAndPageRequestOp fop = new FilterAndPageRequestOp();
        fop.put(op, arg);
        this.add(fop);
    }

    private void doOp(String op, Object obj) {
        switch (op) {
            case "andQUserUrlKeyEq": {
                    String urlKey = (String) obj;
                    filter.and(QUser.user.urlKey.eq(urlKey));
                }
                break;

            case "andQUseRoleEq": {
                    Role role = Role.valueOf((String) obj);
                    filter.and(QUser.user.role.eq(role));
                }
                break;

            case "PageRequestOf": {
                    HashMap<String,Object> hmObj = (HashMap<String,Object>) obj;
                    int pageIndex = (Integer) hmObj.get("pageIndex");
                    int pageSize = (Integer) hmObj.get("pageSize");
                    String sortBy = (String) hmObj.get("sortBy");
                    this.pageRequest =
                        PageRequest.of(pageIndex, pageSize,
                            Sort.by(Sort.Direction.DESC,sortBy));
                }
                break;

            case "orQUserAccessEqGetValueBB": {
                    String filterGetValue = (String) obj;
                    filter.or(QUser.user.access.eq(filterGetValue));
                }
                break;

            case "andOtherBooleanBuilder": {
                    FilterAndPageRequest otherFprq = (FilterAndPageRequest) obj;
                    BooleanBuilder otherFilter = otherFprq.execute();
                    filter.and(otherFilter);
                }
                break;

            case "orQUserFirstNameContains": {
                    String namePart = (String) obj;
                    filter.or(QUser.user.firstname.containsIgnoreCase(namePart));
                }
                break;

            case "orQUserLastNameContains": {
                    String namePart = (String) obj;
                    filter.or(QUser.user.lastname.containsIgnoreCase(namePart));
                }
                break;

            case "orQUserMiddleNameContains": {
                    String namePart = (String) obj;
                    filter.or(QUser.user.middlename.containsIgnoreCase(namePart));
                }
                break;

            case "andUserNameContains": {
                    String userName = (String) obj;
                    filter.or(QUser.user.username.containsIgnoreCase(userName));
                }
                break;
        }
    }
}
