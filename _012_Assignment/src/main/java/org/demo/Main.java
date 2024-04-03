package org.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person p = context.getBean(Person.class);
        Vehicle v = context.getBean(Vehicle.class);
        VehicleServices vS = context.getBean(VehicleServices.class);

//        System.out.println(p.getName()+"\n"+
//                p.getVehicle().getName()+"\n"+
//                v.getName()+"\n"+
//                v.getVehicleServices().getName()+"\n "+
//                vS.getName()+"\n"+
//                vS.play()+"\n"+
//                vS.rotate());

        String[] persons = context.getBeanNamesForType(Person.class);
        Person pee = context.getBean(Person.class);

        String[] vehicles = context.getBeanNamesForType(Vehicle.class);
        Vehicle vee = context.getBean(Vehicle.class);
        String[] speakers = context.getBeanNamesForType(SpeakerType.class);

        for (String s : speakers) {
            System.out.println(s);
        }
        System.out.println(vee.getVehicleServices().play());
        System.out.println(vee.getVehicleServices().rotate());


    }
}