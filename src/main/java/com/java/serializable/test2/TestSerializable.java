package com.java.serializable.test2;

import java.io.*;

/**
 * Created by duanxiangchao on 2016/1/6.
 */
public class TestSerializable {

    public static void main(String[] arg) throws IOException, ClassNotFoundException {
        SerializablePerson();
        DeserializablePerson();
    }

    private static void SerializablePerson() throws IOException {
        Person person = new Person();
        person.setName("段祥超");
        person.setAge(27);
        person.setSex("男");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("E:/person.txt")));
        objectOutputStream.writeObject(person);
        System.out.println("Person序列化成功！");
        objectOutputStream.close();
    }

    private static void DeserializablePerson() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("E:/person.txt")));
        Person person = (Person)objectInputStream.readObject();
        System.out.println("Person反序列化成功！");
        System.out.println("姓名：" + person.getName());
        System.out.println("性别：" + person.getSex());
        System.out.println("年龄：" + person.getAge());
    }

}

