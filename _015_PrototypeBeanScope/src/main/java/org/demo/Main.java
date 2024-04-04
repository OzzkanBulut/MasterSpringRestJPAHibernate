package org.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle v1 = context.getBean(Vehicle.class);
        v1.setName("Toyoa");

        Vehicle v2 = context.getBean(Vehicle.class);
        v2.setName("Audi");
        /*
        If bean scope is prototype, there will be 2 vehicle instances in the context.And they can
        have different names.But, if the scope is singleton, then there can be only one instance in
        the context.Therefore, it can have only one name.And because we set the name audi at the end,
        Both v1 and v2 objects have the name audi.*/
        System.out.println(v1.getName()+" "+v2.getName());
    }
}