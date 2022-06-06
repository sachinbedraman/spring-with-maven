package org.example.spring.annotation;

import org.example.spring.annotation.bean.MessageBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ExampleConfiguration {


    @Bean
    public MessageBean simpleMessage(){
        return new MessageBean("-----  SIMPLE MESSAGE -----");
    }

    @Primary
    @Bean
    public MessageBean complexMessage(){
        return new MessageBean("-----  COMPLEX MESSAGE -----");
    }

}
