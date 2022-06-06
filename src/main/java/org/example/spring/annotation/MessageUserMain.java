package org.example.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageUserMain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        MessageUser messageUser = context.getBean(MessageUser.class);

        messageUser.use();
    }
}
