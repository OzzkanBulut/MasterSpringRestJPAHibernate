package org.demo.example.main;

import org.demo.example.beans.Vehicle;
import org.demo.example.config.ProjectConfig;
import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.beans.beancontext.BeanContext;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle from the non-spring context is:"+ vehicle.getName());
        /*
        As you recall, Application context is the IoC container.
        AnnotationConfigApplicationContext is the implementation of
        ApplicationContext interface.context is the ioc container for the project.
        But, you have to tell what are the configurations for the container.What pojo's
        will become beans and what not.So, we are giving it the ProjectConfig.class*/
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // We get the vehicle bean from the ioc container.
        Vehicle vehicle1 = context.getBean(Vehicle.class);
        System.out.println("Default Vehicle from the spring context is:"+ vehicle1.getName()+"\nBecause we made ferrari primary");

        String hello = context.getBean(String.class);
//        System.out.println(hello);

        Integer number = context.getBean("number",Integer.class); // Get the bean with the name "number"
//        System.out.println(number);

        Integer number1 = context.getBean("number1",Integer.class); // Get the bean  with the name"number"
//        System.out.println(number1);



    }
}