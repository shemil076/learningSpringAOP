package com.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.spring.aop.springaop..*.*(..))")
    public void dataLayerExecution(){}

    @Pointcut("execution(* com.spring.aop.springaop.Business.*.*(..))")
    public void businessDataLayerExecution(){}

    @Pointcut("execution(* com.spring.aop.springaop.data.*.*(..))")
    public void dataDataLayerExecution(){}

    @Pointcut("@annotation(com.spring.aop.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation(){}
}
