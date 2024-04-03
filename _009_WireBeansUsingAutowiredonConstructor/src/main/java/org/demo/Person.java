package org.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name="Özkan";
    private final Vehicle vehicle; // We can finally make vehicle final

    @Autowired
    public Person(Vehicle vehicle){
        this.vehicle = vehicle;
    }
//    public Person(Vehicle vehicle,int x){ // If we add this constructor too, @autowired will be needed
//        this.vehicle = vehicle;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(String name){

    }
}
