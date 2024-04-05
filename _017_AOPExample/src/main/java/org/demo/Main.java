package org.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices = context.getBean(VehicleServices.class);
        Song song = context.getBean(Song.class);
        String s= vehicleServices.playMusic(song);
        System.out.println(s);
    }
}