package org.demo;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name="Özkan";
    private final Vehicle vehicle;

    public Person(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
