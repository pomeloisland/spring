package com.pomeloisland.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三:使用注解方式实现AOP
@Aspect  //标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.pomeloisland.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("======方法执行前======");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理的切入点
    @Around("execution(* com.pomeloisland.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("======环绕前======");

        //执行方法
        Object proceed = joinPoint.proceed();

        System.out.println("======环绕后======");
    }
}
