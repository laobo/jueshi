package com.dxc.testProtected;

/**
 * Created by duanxiangchao on 2015/12/11.
 */
public class Test {

    public static void main(String[] str){
        TestQuery testQuery = new TestQuery();
        System.out.println(testQuery.pageSize);
        System.out.println(testQuery.getPage());
    }

}
