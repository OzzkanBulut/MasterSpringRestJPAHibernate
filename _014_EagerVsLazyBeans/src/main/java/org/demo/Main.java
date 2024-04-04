package org.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before creating bike bean");
        Bike b = context.getBean(Bike.class); // Bike bean is created here!
        System.out.println("After creating bike bean");
    }
}