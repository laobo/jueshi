package _2016.com.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

/**
 * Created by duanxiangchao on 2016/7/29.
 */
public class FileTest {


    public static void main(String [] str){

//        fileTest();
        fileDirectory();

    }

    /**
     * 简单的file测试方法
     */
    private static void fileTest() {
        System.out.println("================================");
        System.out.println("        简单的file测试方法       ");
        File file = new File("F:\\test\\aaa.text");
        if(!file.exists()){
            System.out.println("File is not exist!");
            try {
                file.createNewFile();
                System.out.println("File create successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File f1 = new File("F:\\test\\testfile");
        if(f1.mkdir()){
            System.out.println("Directory created successfully!");
        }
    }

    /**
     * 浏览当前文件下的所有文件和目录
     */
    private static void fileDirectory(){
        System.out.println("================================");
        System.out.println("  浏览单前文件下的所有文件和目录  ");
        File file = new File("");
        String path = file.getAbsolutePath();
        System.out.println("path:" + path);
        File f = new File(path);
        if(f.isDirectory()){
            File[] files = f.listFiles();
            for(File _file: files){
                if(_file.isDirectory()){
                    System.out.println(" dir:" + _file.getName());
                }else {
                    System.out.println("file:" + _file.getName());
                }
            }
        }
    }

}

