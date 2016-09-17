package _2016.com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by duanxiangchao on 2016/7/29.
 */
public class BufferedReaderWriter {

    public static void main(String[] str){
        testBufferedReader();
    }

    private static void testBufferedReader(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\test\\aaa.txt"));
            String s;
            while ((s = bufferedReader.readLine()) != null){
                System.out.println(s);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
