package com.java.rmi.helloWorld;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by duanxiangchao on 16/11/1.
 */
public class HelloImpl extends UnicastRemoteObject implements IHello {


    protected HelloImpl() throws RemoteException {
    }

    public String helloWorld() throws RemoteException {
        return "Hello world!";
    }

    public String sayHello(String name) throws RemoteException {
        return "Hello " + name + "!";
    }
}
