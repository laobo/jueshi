package com.java.io;

import java.io.*;

/**
 * Created by duanxiangchao on 2016/7/29.
 */
public class FileStreamTest {

    public static void main(String[] str){

        copy();
//        copy("F:\\test\\bbb.txt", "F:\\test\\ddd.txt");

    }

    /**
     * 把一个文件的内容写到另一个文件
     */
    private static void copy() {
        File inFile = new File("F:\\test\\aaa.txt");
        File outFile = new File("F:\\test\\bbb.txt");
        try {
            long startTime = System.currentTimeMillis();
            FileInputStream fis = new FileInputStream(inFile);
            FileOutputStream fos = new FileOutputStream(outFile);
            int c;
            while ((c = fis.read()) != -1){
                fos.write(c);
            }
            fis.close();
            fos.close();
            long endTime = System.currentTimeMillis();
            System.out.println("用时：" + (endTime - startTime));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean copy(String src,String des){
        File srcFile,desFile;
        srcFile = new File(src);
        desFile = new File(des);
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            desFile.createNewFile();
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(desFile);
            int bytesRead;
            byte[] buf = new byte[4*1024];
            while ((bytesRead = fis.read(buf)) != -1){
                fos.write(buf, 0, bytesRead);
            }
            fos.flush();
            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
