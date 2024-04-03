package org.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Bean
    // Spring is smart to understand this vehicle is also a bean and starts looking for it in this class
    public Person person(Vehicle vehicle){
        Person person = new Person();
        person.setName("Özkan");
        person.setVehicle(vehicle);
        return person;
    }
}
