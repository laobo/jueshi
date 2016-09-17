package com.dxc.junit;

import junit.framework.TestCase;

/**
 * Created by duanxiangchao on 2015/7/22.
 */
public class AddOperationTest extends TestCase{

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //测试方法名以  test  开头
    public void testAdd(){
        int x = 10;
        int y = 100;
        AddOperation instance = new AddOperation();
        int expResult = 110;
        int result = instance.add(x , y);
        //测试结果是否符合预期结果，不符合会报异常
        assertEquals(expResult, result);
    }

    public void testMin(){
        int x = 10;
        int y = 100;
        AddOperation instance = new AddOperation();
        int expResult = -90;
        int result = instance.min(x , y);
        //测试结果是否符合预期结果，不符合会报异常
        assertEquals(expResult, result);
    }

}
