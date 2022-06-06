package org.example.spring.annotation;

import org.example.spring.annotation.bean.MessageBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageBeanMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        MessageBean messageBean = context.getBean(MessageBean.class);
        messageBean.printMessage();
    }
}
