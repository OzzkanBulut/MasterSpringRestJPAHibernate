package org.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ProjectConfig {
@Bean
    public Vehicle vehicle1(){
    Vehicle veh = new Vehicle();
    veh.setName("Toyota");
    return veh;
}

    @Bean
    public Vehicle vehicle2(){
        Vehicle veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }
}
