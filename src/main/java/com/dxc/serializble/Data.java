package com.dxc.serializble;

import java.io.Serializable;

/**
 * Created by duanxiangchao on 2015/7/24.
 */
public class Data implements Serializable{

    private int n;

    public Data(int n){
        this.n = n;
    }

    @Override
    public String toString() {
        return Integer.toString(n);
    }
}
