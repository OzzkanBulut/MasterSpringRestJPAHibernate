package org.demo;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        Random randomNumber = new Random();
        int random = randomNumber.nextInt(100);
        System.out.println(random);
        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () ->volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("audi");
            return audi;
        };

        if(random%2==0){
            context.registerBean("volkswagen",Vehicle.class,volkswagenSupplier);
        }else{
            context.registerBean("audi",Vehicle.class,audiSupplier);
        }
        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;
        try{
            volksVehicle = context.getBean("volkswagen",Vehicle.class);
        }catch (NoSuchBeanDefinitionException e){
            System.out.println("Error while creating a volkswagen bean");
        }

        try{
            audiVehicle = context.getBean("audi",Vehicle.class);
        }catch (NoSuchBeanDefinitionException e){
            System.out.println("Error while creating a audi bean");
        }

        if(volksVehicle!=null){
            System.out.println("Vehicle name from Spring context : "+ volksVehicle.getName());
        }else{
            System.out.println("Vehicle name from Spring context:"+audiVehicle.getName());
        }


    }
}