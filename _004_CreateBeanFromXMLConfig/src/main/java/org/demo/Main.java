package org.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle v = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is: "+v.getName());
    }
}