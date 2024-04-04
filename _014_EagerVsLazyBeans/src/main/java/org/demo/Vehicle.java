package org.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {
    private String name;

    @PostConstruct
    public void created(){
        System.out.println("Vehicle bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
