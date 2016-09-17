package com.dxc.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by duanxiangchao on 2015/7/22.
 */

public class AddOperationJunit4 {


    @Test
    public void add(){
        int x = 100;
        int y = 10;
        AddOperation instance = new AddOperation();
        int expResult = 110;
        int result = instance.add(x , y);
        //引入静态方法
        assertEquals(expResult, result);
    }

}
