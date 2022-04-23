package org.example.spring.beanfactory;

public class Client {

    private Service service;
    private String message;

    public Client(){}

    public Client(Service service, String message){
        this.service = service;
        this.message = message;
    }

    public void setService(Service service){
        this.service = service;
    }

    public void foo(){
        System.out.println("Message " + message);

        service.service();
    }

}
