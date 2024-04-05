package org.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggerAspect {
    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());
    @Around("@annotation(org.demo.LogAspect)")
    public Object logWithAnnotation(ProceedingJoinPoint proceedingJoinPoint) throws  Throwable{
        logger.info(proceedingJoinPoint.toString()+" method execution start");
        Instant start = Instant.now();
        Object o =proceedingJoinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        logger.info("Time elapsed for method "+proceedingJoinPoint.toString()+": "+timeElapsed);
        return o;
    }
}
