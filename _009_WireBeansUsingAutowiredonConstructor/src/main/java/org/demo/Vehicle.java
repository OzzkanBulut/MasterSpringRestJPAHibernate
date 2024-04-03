package org.demo;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name="Ferrari";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
