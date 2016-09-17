package com.dxc.testProtected;

/**
 * Created by duanxiangchao on 2015/12/11.
 */
public class TestQuery extends BaseQuery {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        pageSize = 5;
        this.name = name;
    }

}
