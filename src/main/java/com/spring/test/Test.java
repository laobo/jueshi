package com.spring.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by duanxiangchao on 2016/6/15.
 */
public class Test {

    public static void main(String[] str){

        //创建IOC文件测抽象资源
        ClassPathResource resource = new ClassPathResource("spring/spring-beans.xml");
        //创建BeanFactory,这里使用DefaultListableBeanFactory
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        //创建BeanDefinition的读取器
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        //从配置好的资源位置读入配置信息
        reader.loadBeanDefinitions(resource);

    }

}
