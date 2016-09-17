package com.dxc.liuchengkongzhi;

import java.util.Random;

/**
 * Created by duanxiangchao on 2015/7/13.
 */
public class Test {

    public static void main(String[] str){

        //listCharscter();
        random();

    }

    public static void listCharscter(){
        for(char c=0;c<128;c++){
            if(Character.isLowerCase(c)){
                System.out.println("value:" + (int)c +"character:"+c);
            }
        }
    }

    public static void random(){
        Random random = new Random();
        int a,b;
        a = random.nextInt(50);
        for(int i=1;i<=25;i++){
            b = random.nextInt(50);
            System.out.print("value:"+ a +"comper:");
            if(a>b){
                System.out.println(">");
            }else if(a<b){
                System.out.println("<");
            }else {
                System.out.println("=");
            }
            a = b;
        }
    }

}
