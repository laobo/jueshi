package com.xml.xmlDemo;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by duanxiangchao on 16/10/26.
 */
public class DocumentTest {

    private XMLOutputter out = null;

    @Before
    public void init(){
        out = new XMLOutputter();
    }

    @After
    public void destory(){
        if(out != null){
            out = null;
        }
        System.gc();
    }

    @Test
    public static void main(String[] arg){

        SAXBuilder builder = new SAXBuilder();
        DocumentTest test = new DocumentTest();
        Document doc = null;
        try {
            doc = builder.build(DocumentTest.class.getResourceAsStream("disk.xml"));
            Element root = doc.getRootElement();
            test.print(0, root.getChildren());
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * 输出 doc 的文档信息
     * @param doc
     */
    private void print(Document doc){
        out.setFormat(Format.getCompactFormat().setEncoding("UTF-8"));
        System.out.println(out.outputString(doc));
    }

    private void fail(Object obj){
        if(obj != null){
            System.out.println(obj);
        }
    }

    @Test
    public void createDoc(){

        Document doc = null;

        //1.创建一个Document文档，添加一个元素root
        //添加的元素默认是根元素
        doc = new Document(new Element("root"));
//        print(doc);

        //2.创建一个Document文档，添加一个元素root，设置root元素的节点文本
        doc = new Document(new Element("root").setText("2.this is a root el"));
//        print(doc);

        //3.创建一个Document文档，添加元素root，设置root节点文本和属性
        Element roots = new Element("roots");
        roots.setText("这是roots元素");
        roots.setAttribute("id", "110");

        // 向roots末尾添加元素
        roots.addContent(new Element("root").setText("这是root元素!"));
        roots.addContent("继续添加值");
        // document只允许添加一个content就是根节点
        doc = new Document();
        doc.addContent(roots);
        // 可以通过setRootElement重新设置根元素
//        doc.setRootElement(new Element("root").setText("这是root元素!"));

        fail("method 4\n" + out.outputString(doc));

    }

    /**
     创建一遍xml文档
     <?xml version="1.0" encoding="UTF-8"?>
     <car vin="123fhg5869705iop90">
     <!--Description of a car-->
     <make>Toyota</make>
     <model>Celica</model>
     <year>1997</year>
     <color>green</color>
     <license state="CA">1ABC234</license>
     </car>
     */
    @Test
    public void createXMLDoc(){

        Document doc = null;
        Element car = new Element("car");
        car.setAttribute("vin", "123fhg5869705iop90");
        doc = new Document(car);
        car.addContent(new Element("make").setText("Toyota"));
        car.addContent(new Element("model").setText("Celica"));
        car.addContent(new Element("year").setText("1997"));
        car.addContent(new Element("color").setText("green"));
        car.addContent(new Element("license").setText("1ABC234").setAttribute("state", "CA"));
//        doc.addContent(car);
        print(doc);

    }

    /**
     <?xml version="1.0" encoding="UTF-8"?>
     <HD>
     <disk name="C">
     <capacity>8G</capacity>
     <directories>200</directories>
     <files>1580</files>
     </disk>
     <disk name="D">
     <capacity>10G</capacity>
     <directories>500</directories>
     <files>3000</files>
     </disk>
     <disk2 name="E">
     <capacity>11G</capacity>
     <directories>50</directories>
     <files size="200" modifyDate="2011-08-3">
     <file>Java book</file>
     <file>Spring.txt</file>
     <file>strtus.doc</file>
     </files>
     </disk2>
     <files size="220">500</files>
     </HD>
     */
    @Test
    public void readXmlContent(){

        SAXBuilder builder = new SAXBuilder();
        try {
            Document doc = builder.build(DocumentTest.class.getResourceAsStream("disk.xml"));
            Element root = doc.getRootElement();
            //获取所有的子元素
            List<Element> list = root.getChildren();
            for(Element el: list){
                String name = el.getAttributeValue("name");
                String capacity = el.getChildText("capacity");
                String directories = el.getChildText("directories");
                String files = el.getChildText("files");
                System.out.println("-----磁盘信息-----");
                System.out.println("分区盘符：" + name);
                System.out.println("分区容量：" + capacity);
                System.out.println(" 目录数 ：" + directories);
                System.out.println(" 文件数 ：" + files);
            }
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 递归显示文档节点信息
     * @param i
     * @param list
     */
    private void print(int i, List<Element> list){

        i++;
        for(Element el: list){
            List<Element> children = el.getChildren();
            if(children.size() > 0){
                fail(format(i) + el.getName() + "" + getAttrInfo(el));
                print(i, el.getChildren());
            }else{
                fail(format(i) + el.getName() + ":" + el.getText() + "  " + getAttrInfo(el));
            }
        }

    }

    /**
     * 返回固定格式 “--”
     * @param i
     * @return
     */
    private String format(int i){
        String temp = "";
        if(i > 0){
            temp += "--";
            i--;
            temp += format(i);
        }
        return temp;
    }

    /**
     * 显示当前节点所有Element的属性信息
     * @param el
     * @return
     */
    private String getAttrInfo(Element el){
        List<Attribute> attrs = el.getAttributes();
        return getAttrInfo(attrs);
    }

    /**
     * 获取属性列表，返回String
     * @param attrs
     * @return
     */
    private String getAttrInfo(List<Attribute> attrs){

        StringBuilder info = new StringBuilder();
        for(Attribute attr: attrs){
            info.append(attr.getName() + "=" + attr.getValue() + ",");
        }
        if(info.length() > 0){
            return info.substring(0, info.length() - 1);
        }
        return "";

    }


}
