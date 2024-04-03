package org.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p = context.getBean(Person.class);
        System.out.println(p.getName() +" "+p.getVehicle().getName());

        p.setName("Ali");
        // This should not work.Beans must be unchangeable!
        System.out.println(p.getName() +" "+p.getVehicle().getName());
    }
}