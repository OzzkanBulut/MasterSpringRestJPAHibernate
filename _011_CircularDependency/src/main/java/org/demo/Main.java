package org.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p = context.getBean(Person.class);
        Vehicle v = context.getBean(Vehicle.class);/*
        Because we made both Person and Vehicle beans dependent on each other,Spring will throw a
        UnsatisfiedDependencyException.
        Because both beans are waiting for the other one to complete.
        */

        System.out.println(p.getName()+" "+v.getName());
    }
}