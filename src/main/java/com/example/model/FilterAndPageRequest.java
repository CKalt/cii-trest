package com.example.model;

import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import com.example.model.FilterAndPageRequestOp;
import com.example.model.user.QUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import com.querydsl.core.BooleanBuilder;
import com.example.model.user.Role;

public class FilterAndPageRequest extends ArrayList<FilterAndPageRequestOp> {
    private BooleanBuilder filter;
    private PageRequest pageRequest;
    private Sort sort;
    private Sort.Direction sortDirection;

    public FilterAndPageRequest() {
        this.filter = null;
        this.pageRequest = null;
        this.sort = null;
        this.sortDirection = Sort.Direction.ASC;
    }

    public BooleanBuilder getBooleanBuilder() {
        return this.filter;
    }

    public PageRequest getPageRequest() {
        return this.pageRequest;
    }

    public Sort getSort() {
        return this.sort;
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

    public void addPageRequestOp(int pageIndex, int pageSize) {
        // store a dffered operation that will instantiate a PageRequest object.
        FilterAndPageRequestOp fopArgs = new FilterAndPageRequestOp();
        fopArgs.put("pageIndex", pageIndex);
        fopArgs.put("pageSize", pageSize);
        this.addOp("PageRequestOf", fopArgs);
    }

    public void addOp(String op, Object arg) {
        // store a general deferred an operation
        FilterAndPageRequestOp fop = new FilterAndPageRequestOp();
        fop.put(op, arg);
        this.add(fop);
    }

    private void doOp(String op, Object obj) {
        // run a defferred operation.
        switch (op) {
            case "andQUserUrlKeyEq": {
                    String urlKey = (String) obj;
                    filter.and(QUser.user.urlKey.eq(urlKey));
                }
                break;

            case "andQUserRoleEq": {
                    Role role = Role.valueOf((String) obj);
                    filter.and(QUser.user.role.eq(role));
                }
                break;

            case "andQUserAccessEq": {
                    String access = (String) obj;
                    filter.and(QUser.user.access.eq(access));
                }
                break;

            case "PageRequestOf": {
                    HashMap<String,Object> hmObj = (HashMap<String,Object>) obj;
                    int pageIndex = (Integer) hmObj.get("pageIndex");
                    int pageSize = (Integer) hmObj.get("pageSize");
                    this.pageRequest = PageRequest.of(pageIndex, pageSize, this.sort); // Newer Way
//                    this.pageRequest = new PageRequest(pageIndex, pageSize, this.sort); // Older Way
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

            case "sortDirection": {
                    String sortDir = (String) obj;
                    this.sortDirection = Sort.Direction.valueOf((String) obj);
                }
                break;

            case "sortByItem": {
                    String itemName = (String) obj;
// Older Way
//                    this.sort = new Sort(Arrays.asList(
//                        new Order[] { new Order(this.sortDirection, itemName) }));
// Newer Way
                    this.sort = Sort.by(Arrays.asList(
                        new Order[] { new Order(this.sortDirection, itemName) }));
                }
                break;

            case "sortByItems": {
                    String[] items = (String[]) obj;
                    Order[] orders = new Order[items.length];
                    for (int i = 0; i < items.length; i++) {
                        orders[i] = new Order(this.sortDirection, items[i]);
                    }
//                    sort = new Sort( Arrays.asList(orders) ); // Older Way Spring 4.x
                    sort = Sort.by( Arrays.asList(orders) ); // Newer Way Spring 5.x
                }
                break;
        }
    }
}
