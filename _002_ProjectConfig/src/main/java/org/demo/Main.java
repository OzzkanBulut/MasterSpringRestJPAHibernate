package org.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class); // Will create a null object. Developer has no control over it
        veh.setName("hee");
        veh.printHello();
        System.out.println(veh);
    }
}