package org.demo.example.config;

import org.demo.example.beans.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
Spring @Configuration annotation is a part of the spring coore framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application*/
@Configuration
public class ProjectConfig {

    /*
    @Bean annotation, lets Spring know that it needs to call this
    this method when it initializes its context and adds the returned
    value to the context.
    */
    @Bean
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }
    @Bean
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }
    @Primary
    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

    /*
    The method names usually follow verbs notation. But for
    methods which we will use to create beans, can use nouns
    as names. This will be a good practice as the method names
    will become bean names as well in the context.
    */

    @Bean
    String hello(){
        return "Hello World";
    }

    @Bean
    Integer number(){
        return 16;
    }
    @Bean
    Integer number1(){
        return 3;
    }


}
