package com.inga.bean;

/**
 * Created by abing on 2016/8/23.
 */
public class Form {

    private static final int DEFAULT_LIMIT=10;
    //页数
    private int page;
    //总数
    private int total;
    //每页的数量
    private int limit;
    private int start;
    private int end;
    private int records;
    private int totalPage;

    private String oper;

    public int getPage() {
        return page == 0 ? 1 : page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getLimit() {
        return limit == 0 ? DEFAULT_LIMIT : limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }
}
