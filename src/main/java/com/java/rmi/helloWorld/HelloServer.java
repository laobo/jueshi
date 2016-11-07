package com.java.rmi.helloWorld;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by duanxiangchao on 16/11/1.
 */
public class HelloServer {


    public static void main(String[] str){
        try {
            IHello rhello = new HelloImpl();
            //远程对象注册表的实现
            LocateRegistry.createRegistry(8888);
            //把远程对象注册到RMI注册服务器上，命名为rhello
            Naming.bind("rmi://localhost:8888/RHello", rhello);
            System.out.println("远程对象rhello对象绑定成功！");

        } catch (RemoteException e) {
            System.out.println("创建远程对象发生异常！");
            e.printStackTrace();
        } catch (MalformedURLException e) {
            System.out.println("发生URL畸形异常！");
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            System.out.println("发生重复绑定异常！");
            e.printStackTrace();
        }
    }


}
