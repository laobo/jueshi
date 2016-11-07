package com.java.rmi.helloWorld;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by duanxiangchao on 16/11/1.
 */
public class HelloClient {

    public static void main(String[] str){


        try {
            IHello hello = (IHello) Naming.lookup("rmi://localhost:8888/RHello");
            System.out.println(hello.helloWorld());
            System.out.println(hello.sayHello("laobo"));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

}
