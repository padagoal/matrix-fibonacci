package com.r2.fibonaccimatrix.annotation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Component
@Aspect
public class ApiLogAspect {

    private static final Logger logger = LogManager.getLogger(ApiLogAspect.class);

    @Pointcut("@annotation(com.r2.fibonaccimatrix.annotation.ApiLog)")
    public void logPointcut(){
    }


    @Around("logPointcut()")
    public Object logAllMethodCallsAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("BEGIN Method - {}",joinPoint.getSignature().getName());
        LocalDateTime initRequest = LocalDateTime.now();
        Object response = joinPoint.proceed();
        logger.info("END Method - {} - Total Time Execution: {} miliseconds",joinPoint.getSignature().getName(),
                ChronoUnit.MILLIS.between(initRequest, LocalDateTime.now()));

        return response;
    }
}
