package org.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
//        for(Object o:context.getBeanDefinitionNames()){
//            System.out.println(o.toString()); // Print all beans
//        }
        System.out.println("Person name from Spring Context: "+person.getName());
        System.out.println("Vehicle name from Spring Context: "+vehicle.getName());
        System.out.println("Vehicle that person own is:"+person.getVehicle().getName());
    }
}