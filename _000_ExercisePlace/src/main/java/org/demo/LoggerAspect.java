package org.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggerAspect {
    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("@annotation(LogAspect)")
    public Object moveVehicle(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Before method "+joinPoint.toString()+" execution");
        Instant start = Instant.now();
        Object o= joinPoint.proceed();
        logger.info(o.toString());
        logger.info("After method "+joinPoint.toString()+" execution");
        Instant finish  = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        logger.info("Time elapsed: "+timeElapsed);
        return o;


    }
}
