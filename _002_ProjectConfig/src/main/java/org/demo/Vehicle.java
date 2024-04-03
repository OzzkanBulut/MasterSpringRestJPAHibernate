package org.demo;

import org.springframework.stereotype.Component;



@Component

public class Vehicle {


    private String name;


    public void urMom() {
        this.name = "Honda";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello Vehicle");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
