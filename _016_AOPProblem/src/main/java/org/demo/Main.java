package org.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices = context.getBean(VehicleServices.class);
        Song eminem = new Song();
        eminem.setSongName("eminem");
        System.out.println(vehicleServices.moveVehicle(true));
        System.out.println(vehicleServices.applyBreak(true));
        System.out.println(vehicleServices.playMusic(false,eminem));

    }
}