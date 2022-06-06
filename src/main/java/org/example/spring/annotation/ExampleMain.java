package org.example.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        ExampleClass exampleClass = applicationContext.getBean(ExampleClass.class);
        exampleClass.exampleMethod();

        ExampleClassUser exampleClassUser = applicationContext.getBean(ExampleClassUser.class);
        exampleClassUser.doSomething();

    }

}
