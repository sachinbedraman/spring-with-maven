package org.example.spring.beanfactory.shapes;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DrawingMain {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("beans.xml");

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(resource);

        Drawing drawing =  (Drawing) beanFactory.getBean("drawing");
        drawing.drawShape();

    }
}
