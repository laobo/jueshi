package com.java.io;

import java.io.*;

/**
 * Created by duanxiangchao on 2016/7/29.
 */
public class BufferedStreamTest {

    public static void main(String[] str){
        copy();
    }

    private static void copy() {
        File inFile = new File("F:\\test\\aaa.txt");
        File outFile = new File("F:\\test\\ccc.txt");
        try {
            long startTime = System.currentTimeMillis();
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inFile), 256);
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outFile), 256);

            int len;
            byte[] bytes = new byte[256];
            do{
                len = bis.read(bytes);
                bos.write(bytes, 0, len);
            }while (len == 256);

            bos.close();
            bis.close();

            long endTime = System.currentTimeMillis();
            System.out.println("用时：" + (endTime - startTime));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
