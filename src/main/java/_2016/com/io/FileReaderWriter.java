package _2016.com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by duanxiangchao on 2016/7/29.
 */
public class FileReaderWriter {

    public static void main(String[] str){
//        testFileReader();
//        testFileWriter();
        copy();
    }

    private static void testFileReader() {
        try {
            FileReader fileReader = new FileReader("F:\\test\\reader.txt");
            char[] chars = new char[1024];
            int len;
            while ((len = fileReader.read(chars)) != -1){
                System.out.println(new String(chars, 0, len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void testFileWriter(){
        try {
            FileWriter fileWriter = new FileWriter("F:\\test\\writer.txt");
            fileWriter.write("一住行窝几十年，蓬头长日走如颠！");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy(){
        try {
            FileReader reader = new FileReader("F:\\test\\reader.txt");
            FileWriter writer = new FileWriter("F:\\test\\writer1.txt");
            char[] buffer = new char[128];
            int charRead;
            while ((charRead = reader.read(buffer)) != -1){
                writer.write(buffer, 0, charRead);
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
