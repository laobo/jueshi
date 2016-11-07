package com.java.io;

import java.io.*;

/**
 * Created by duanxiangchao on 2016/7/29.
 */
public class DataStreamTest {

    public static void main(String[] str){
        try {
            FileOutputStream fos = new FileOutputStream("F:\\test\\dataStream.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeBoolean(true);
            dos.writeByte((byte)123);
            dos.writeChar('J');
            dos.writeDouble(3.1416926);
            dos.writeFloat(2.7182f);
            dos.writeInt(1234567890);
            dos.writeLong(352346234523L);
            dos.writeShort((short)112233);
            dos.close();

            FileInputStream fis = new FileInputStream("F:\\test\\dataStream.txt");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readBoolean());
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            System.out.println(dis.readFloat());
            System.out.println(dis.readInt());
            System.out.println(dis.readLong());
            System.out.println(dis.readShort());
            dis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
