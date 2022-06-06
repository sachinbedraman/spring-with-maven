package org.example.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExampleClassUser {

    @Autowired
    private ExampleClass exampleClass;

    public void doSomething(){
        exampleClass.exampleMethod();
    }

}
