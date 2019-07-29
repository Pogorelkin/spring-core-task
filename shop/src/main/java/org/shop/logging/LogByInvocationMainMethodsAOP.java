package org.shop.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LogByInvocationMainMethodsAOP {

    public static final Logger logger = LoggerFactory.getLogger(LogByInvocationMainMethodsAOP.class);

    @Pointcut("execution(public * *(..))")
    public void anyPublicMethods() {
    }

    @Pointcut("within(org.shop.repository.*)")
    public void inRepository() {
    }

    @Pointcut("anyPublicMethods() && inRepository()")
    public void publicMethods() {
    }

    @Before("publicMethods()")
    public void beforeAdvice(JoinPoint joinPoint) {
        logger.info("Before exec method " + joinPoint.getSignature().getName());
    }

    @After("publicMethods()")
    public void afterAdvice(JoinPoint joinPoint) {
        logger.info("After exec method " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "publicMethods()", returning = "returnedValue")
    public void afterReturningAdvice(JoinPoint joinPoint, Object returnedValue) {
        logger.info("After execution of " + joinPoint.getSignature().toShortString());
        logger.info("returned " + returnedValue);
    }

    @AfterThrowing(pointcut = "publicMethods()", throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        logger.info("After execution of " + joinPoint.getSignature().toShortString());
        logger.info("threw exception " + ex + ex.getMessage());
    }
}
