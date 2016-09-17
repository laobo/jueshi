package com.dxc.exception;

/**
 * Created by duanxiangchao on 2015/6/18.
 */
public class TestException {

    public static void main(String [] arg){

        //除数为0异常
        arithmeticException();

        test1();

    }

    public static void arithmeticException(){
        try{
            System.out.println(10 / 0);
        }catch (ArithmeticException  e){
            System.out.print("除数不能为零");
        }catch (Exception e){
            System.out.println(0);
        }
    }

    public static void test1(){
        int i = 0;
        String greetings[] = {"Hello world !","Hello world !!!","Hello world !!!"};
        while(i < 4){
            try{
                System.out.println(greetings[i]);
                i++;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("数组下标越界异常！");
            }finally{
                System.out.println("----------------");
            }
        }
    }

}
