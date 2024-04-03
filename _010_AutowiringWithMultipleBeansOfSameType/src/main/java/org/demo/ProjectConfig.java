package org.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ProjectConfig {

    @Bean
    public Vehicle vehicle1(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Ferrari");
        return vehicle;
    }
    @Bean
    public Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

    @Bean
    public Vehicle vehicle3(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Doğan");
        return vehicle;
    }

}
