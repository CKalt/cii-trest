package com.example.query;

import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

import com.example.query.FilterAndPageRequestOp;

public class FilterAndPageRequest extends ArrayList<FilterAndPageRequestOp> {
    public void addPageRequestOp(int pageIndex, int pageSize) {
        // store a deffered operation that can instantiate a PageRequest object.
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
}
