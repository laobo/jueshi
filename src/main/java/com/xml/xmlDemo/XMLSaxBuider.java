package com.xml.xmlDemo;

//import com.sun.xml.internal.stream.writers.XMLOutputSource;
import org.jdom.*;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.*;
import java.util.List;


/**
 * Created by duanxiangchao on 16/10/26.
 */
public class XMLSaxBuider {

    public static void main(String[] arg){

        read();
//        write();
//        createXml();

    }

    private static void read(){

        try {
            boolean validate = false;
            SAXBuilder builder = new SAXBuilder();
            InputStream inputStream = XMLSaxBuider.class.getResourceAsStream("test.xml");
            Document doc = builder.build(inputStream);
            Element element = doc.getRootElement();
            readNode(element, "");
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void readNode(Element root, String prefix){

        if(root == null)
            return;
        //获取属性集合
        List<Attribute> attrs = root.getAttributes();
        if(attrs != null && attrs.size() > 0){
            System.out.println(prefix);
            for(Attribute attribute: attrs){
                System.out.print(attribute.getName() + ":" + attribute.getValue() + "  ");
            }
        }
        List<Element> nodes = root.getChildren();
        prefix = "\t";
        for(Element e: nodes){
            readNode(e, prefix);
        }

    }

    private static void write(){

        try {
            boolean validate = false;
            SAXBuilder builder = new SAXBuilder(validate);
            InputStream in = XMLSaxBuider.class.getResourceAsStream("test.xml");
            Document document = builder.build(in);
            Element root = document.getRootElement();
            root.setAttribute("name", "老伯");

            //删除
            boolean isRemoved = root.removeChildren("college");
            System.out.println(isRemoved);
            //新增
            Element newCollege = new Element("college");
            newCollege.setAttribute("name", "绝世");
            Element newClass = new Element("class");
            newClass.setAttribute("class", "MyClass");

            newCollege.addContent(newClass);
            root.addContent(newCollege);

            XMLOutputter out = new XMLOutputter();
            File file = new File("src/jdom-modify.xml");
            if(file.exists()){
                file.delete();
            }

            file.createNewFile();

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            out.output( document, fileOutputStream);



        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createXml(){
        Document doc = new Document();
        Namespace ns = Namespace.getNamespace("http://www.bromon.org");
        Namespace ns1 = Namespace.getNamespace("other", "http://www.w3c.org");
        Element root = new Element("根元素", ns);
        root.addNamespaceDeclaration(ns1);
        doc.setRootElement(root);

        Format format = Format.getPrettyFormat();
        format.setEncoding("UTF-8");// 设置xml文件的字符为UTF-8，解决中文问题
        XMLOutputter xmlout = new XMLOutputter(format);
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        try {
            xmlout.output(doc, bo);
            System.out.println(bo.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
