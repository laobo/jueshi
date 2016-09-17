package com.designpattern.singlton;

import java.io.*;
import java.util.Properties;

/**
 * Created by duanxiangchao on 2016/7/26.
 */
public class ConfigSingleton {

    private volatile static ConfigSingleton instance = null;

    private ConfigSingleton(){}

    public static ConfigSingleton getInstance(){
        if(instance == null){
            synchronized (ConfigSingleton.class){
                if(instance == null){
                    instance = new ConfigSingleton();
                }
            }
        }
        return instance;
    }

    public String get(String key){
        try {
            InputStream inputStream =ClassLoader.getSystemResourceAsStream("config.propeties");
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties.get(key).toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
