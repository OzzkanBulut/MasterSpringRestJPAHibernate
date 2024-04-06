package org.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class BeforeAspect {
    private Logger logger = Logger.getLogger(BeforeAspect.class.getName());
    @Before("@annotation(BeforeAspectI)")
    public void beforeFunction(JoinPoint joinPoint) throws Throwable{
        logger.info("Before the execution of "+joinPoint.toString());
    }

}

