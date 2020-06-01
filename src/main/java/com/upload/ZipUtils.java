package com.upload;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by duanxiangchao on 2018/11/14
 */
public class ZipUtils {


    public static void doCompress(String srcFile, String zipFile) throws IOException {
        ZipOutputStream out = null;
        try {
            out = new ZipOutputStream(new FileOutputStream(zipFile));
            doCompress(new File(srcFile), out, "");
        } catch (Exception e) {
            throw e;
        } finally {
            out.close();//记得关闭资源
        }
    }

    public static void doCompress(File inFile, ZipOutputStream out, String dir) throws IOException {
        if(inFile.isDirectory()){
            //需要打包
            File[] files = inFile.listFiles();
            if(files != null && files.length > 0){
                for(File file: files){
                    String name = file.getName();
                    if(!"".equals(dir)){
                        name = dir + "/" + name;
                    }
                    ZipUtils.doCompress(file, out, name);
                }
            }
        } else {
            ZipUtils.doZip(inFile, out, dir);
        }
    }


    public static void doZip(File inFile, ZipOutputStream out, String dir) throws IOException {
        String enterName = null;
        enterName = inFile.getName();
        ZipEntry entry = new ZipEntry(enterName);
        out.putNextEntry(entry);

        int len = 0;
        byte[] buffer = new byte[1024];
        FileInputStream fis = new FileInputStream(inFile);
        while ((len = fis.read(buffer)) > 0){
            out.write(buffer, 0, len);
            out.flush();
        }
        out.closeEntry();
        fis.close();
    }

    public static void main(String[] args) throws IOException {
        doCompress("/Users/laobo/Documents/电子书", "/Users/laobo/test.zip");
    }

}
