package org.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p = context.getBean(Person.class);
        Vehicle v = context.getBean(Vehicle.class);
        System.out.println(p.getName() + " " + p.getVehicle().getName());



    }
}