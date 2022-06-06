package org.example.spring.annotation.bean;

public class MessageBean {

    private String message;

    public MessageBean(String message){
        this.message = message;
    }

    public void printMessage(){
        System.out.println("MESSAGE === " + this.message);
    }
}
