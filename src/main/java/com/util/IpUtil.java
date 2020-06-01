package com.util;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

/**
 * Created by duanxiangchao on 2018/9/18
 */
public class IpUtil {

    public static void main(String[] args) {

       String SERVER_IP = null;

        try {
            Enumeration netInterfaces = NetworkInterface.getNetworkInterfaces();
            InetAddress ip = null;
            while (netInterfaces.hasMoreElements()){
                NetworkInterface ni = (NetworkInterface) netInterfaces.nextElement();
                for(Enumeration inetAddresses = ni.getInetAddresses(); inetAddresses.hasMoreElements();){
                    InetAddress inetAddress = (InetAddress) inetAddresses.nextElement();

                    if(!inetAddress.isLoopbackAddress()){
                        String hostName = inetAddress.getHostName();
                        if(hostName.startsWith("192.168")){
                            System.out.println(hostName);
                        }
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }


    }

}
