package com.java.thread.threadCoreBook.chapter1;

/**
 * Created by duanxiangchao on 2018/8/13
 */
public class LoginServlet {

    private static String userNameRef;

    private static String passwordRef;

    synchronized public static void doPost(String userName, String password){
        try {
            userNameRef = userName;
            if(userName.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username=" + userNameRef + " password=" + passwordRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
