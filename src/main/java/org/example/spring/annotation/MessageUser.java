package org.example.spring.annotation;

import org.example.spring.annotation.bean.MessageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageUser {

    @Qualifier("complexMessage")
    @Autowired
    private MessageBean messageBean;

    @Autowired
    private MessageBean anotherMessageBean;

    public void use(){
        messageBean.printMessage();

        anotherMessageBean.printMessage();
    }

}
