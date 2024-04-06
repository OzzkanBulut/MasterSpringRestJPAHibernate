package org.demo;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Bike bike = context.getBean(Bike.class);
//        System.out.println("Primary bike bean: "+bike.getName() );
//
//        Bike bike1 = context.getBean("amazing",Bike.class);
//        System.out.println("Other bike bean: "+ bike1.getName());
//
//        Vehicle vehicle1 = context.getBean(Vehicle.class);
//        System.out.println("Default vehicle bean:"+ vehicle1.getName());
//        // While we can create 2 beans of bike, we can not create more than one vehicle bean.
//        // Because we created bike bean with @bean annotation and vehicle bean with @component annotation
//        Vehicle testVehicle = null;
//        Truck testTruck = null;
//
//        Supplier<Truck> truckSupplier = () ->{
//            Truck truck = new Truck();
//            truck.setName("Test Truck");
//            return truck;
//        };
//        Supplier<Ship> shipSupplier = () ->{
//            Ship ship= new Ship();
//            ship.setName("Test Ship");
//            return ship;
//        };
//
//        Random randomNum = new Random();
//        int random = randomNum.nextInt(100);
//        System.out.println("Random number: "+random);
//        if(random%2==0){
//            context.registerBean("testTruck", Truck.class,truckSupplier);
//            System.out.println("Test Truck Created");
//        }else{
//            context.registerBean("testShip", Ship.class,shipSupplier);
//            System.out.println("Test Ship Created");
//        }
//
//        try{
//            context.getBean("testTruck", Truck.class);
//        }catch(NoSuchBeanDefinitionException e){
//            System.out.println("No beans found testTruck!");
//        }
//
//        try{
//            context.getBean("testShip", Ship.class);
//        }catch(NoSuchBeanDefinitionException e){
//            System.out.println("No beans found testShip!");
//        }
//
//
//        context.close();

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices = context.getBean(VehicleServices.class);
//        System.out.println(vehicleServices.moveVehicle());
        vehicleServices.isBefore();






    }
}