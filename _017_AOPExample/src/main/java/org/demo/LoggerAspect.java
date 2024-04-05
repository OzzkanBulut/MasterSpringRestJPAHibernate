package org.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Aspect
@Order(2)
public class LoggerAspect {
    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* org.demo.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        // Before the invoke
        logger.info(joinPoint.getSignature().toString() + " method execution start");
        Instant start = Instant.now();
        // Invokation of actual method
        Object o = joinPoint.proceed();

        //After the invoke
        Instant finished = Instant.now();
        logger.info("Time spent for this method: " + Duration.between(start, finished).toMillis());
        logger.info(joinPoint.getSignature().toString() + " method execution end");
        return o;
    }
    @AfterThrowing(value = "execution(* org.demo.*.*(..)))", throwing = "ex")
    public void logException(JoinPoint joinPoint,Exception ex){
        logger.log(Level.SEVERE,joinPoint.getSignature().getName()+" An exception thrown with" +
                "the help of @AfterThrowing which happened due to: "+ex);

    }
    @AfterReturning(value = "execution(* org.demo.*.*(..)))", returning = "retVal")
    public void logReturn(JoinPoint joinPoint,Object retVal){
        logger.log(Level.INFO,joinPoint.getSignature().getName()+" returned the "+retVal.getClass()+
                " value succesfully");

    }
}
