package com.designpattern.template.test1;

import java.util.Scanner;

/**
 * Created by duanxiangchao on 2016/8/16.
 */
public abstract class Template {

    String name = "Lauging";

    final public void pre(){
        name();
        if(is())
            other();
        else
            System.out.println("错误！");
    }

    public void name(){
        System.out.println(name);
    }

    public void other(){};

    public boolean is(){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if("yes".equals(str))
            return true;
        else
            return false;
    }

}
