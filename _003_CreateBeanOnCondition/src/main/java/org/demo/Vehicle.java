package org.demo;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void hello(){
        System.out.println("Bean is created: ");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Bean is destroyed");
    }

}
