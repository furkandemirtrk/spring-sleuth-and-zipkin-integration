package com.demirturk.sleuth.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class Loggers {

    @Around("@annotation(com.demirturk.sleuth.aspect.annotations.Logger)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info(joinPoint.getSignature() + "   :  start ");
        Object proceed = joinPoint.proceed();
        log.info(joinPoint.getSignature() + "   :  end");
        return proceed;
    }
}
