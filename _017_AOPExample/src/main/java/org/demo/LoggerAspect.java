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
}
