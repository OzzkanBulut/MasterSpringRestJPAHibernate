package org.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean("vehicle1",Vehicle.class);
        Vehicle veh2 = context.getBean("vehicle1",Vehicle.class);
        Vehicle veh3 = context.getBean("vehicle2",Vehicle.class);
        System.out.println("HashCode of veh: "+ veh.hashCode());
        System.out.println("HashCode of veh2: "+ veh2.hashCode());
        System.out.println("HashCode of veh3: "+ veh3.hashCode());
        if(veh.hashCode()==veh2.hashCode()){
            System.out.println("Vehicle1 bean is a singleton scoped bean!");
        }

    }
}