package com.java.io;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by duanxiangchao on 2016/7/29.
 */
public class FileTest1 {

    public static void main(String[] str){
        File dir = new File("F:\\test\\testfile");
        Filter filter = new Filter("java");
        String[] files = dir.list(filter);
        for(String _str: files){
            File _file = new File(dir, _str);
            if(_file.isFile()){
                System.out.println("file:" + _file.getName());
            }else {
                System.out.println(" dir:" + _file.getName());
            }
        }
    }

}

/**
 * 文件扩展名过滤器
 */
class Filter implements FilenameFilter{

    private String extent;

    Filter(String extent){
        this.extent = extent;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith("." + extent);
    }
}
