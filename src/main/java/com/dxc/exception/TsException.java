package com.dxc.exception;

/**
 * Created by duanxiangchao on 2015/6/23.
 */
public class TsException {

    static int quotient(int x,int y) throws MyException{
        if(y < 0){
            throw new MyException("除数不能为负数");
        }
        return x / y;
    }

    public static void main(String[] str){
        int a = 3;
        int b = -1;

        try {
            int result = quotient(a,b);
        } catch (MyException e) {
            System.out.print(e.getMessage());
//            e.printStackTrace();
        } catch (ArithmeticException e){
            System.out.print("除数不能为零");
        } catch (Exception e){
            System.out.print("成熟发生了其他异常！");
        }

    }

}

class MyException extends Exception{

    String message;
    public MyException(String ErrorMessage){
        message = ErrorMessage;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
