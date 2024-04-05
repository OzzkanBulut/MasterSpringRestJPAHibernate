package org.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class StarterCheckAspect {
    private Logger logger = Logger.getLogger(StarterCheckAspect.class.getName());
    @Before("execution(* org.demo.*.*(..)) && args(vehicleStarted,..)")
    public void checkVehicleStarted(JoinPoint joinPoint,boolean vehicleStarted) throws Throwable{
        if(!vehicleStarted){
            System.out.println("Vehicle is not started!");
        }

    }
}
