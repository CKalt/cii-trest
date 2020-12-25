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

    public void execute() {
        this.filter = new BooleanBuilder();
        for (FilterAndPageRequestOp fop : this) {
            String op = fop.fKey();
            Object obj = fop.fValue();
            this.doOp(op, obj);
        }
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
        }
    }
}
