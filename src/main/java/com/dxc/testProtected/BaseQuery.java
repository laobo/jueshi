package com.dxc.testProtected;

/**
 * Created by duanxiangchao on 2015/12/11.
 */
public abstract class BaseQuery {

    private int page = 1;
    protected int pageSize = 10;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
