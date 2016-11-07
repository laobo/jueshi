package com.java.rmi.helloWorld;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by duanxiangchao on 16/11/1.
 */
public interface IHello extends Remote {

    public String helloWorld() throws RemoteException;

    public String sayHello(String name) throws RemoteException;

}
