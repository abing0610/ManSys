package com.inga.utils.aop;

import com.inga.utils.log.PlatformLogger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

/**
 * Aspect类型的spring aop
 * Date:15/7/14
 * Time:11:18
 * Author Mr.Object
 */
@Service
@Aspect
public class LogAspect {

    @Pointcut("execution(* com.inga.service..*.*(..))")
    public void log(){

    }

    @Before("log()")
    public void beforeLog(){
        PlatformLogger.message("开始执行...");
    }

    @AfterReturning("log()")
    public void afterLog(){
        PlatformLogger.message("执行结束...");
    }

    @Around("log()")
    public Object aroundLog(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        //获取参数
       // Object[] args = joinPoint.getArgs();

        Object result=joinPoint.proceed();

        long end = System.currentTimeMillis();
        PlatformLogger.message(  joinPoint.getSignature().getDeclaringTypeName() +
                "." + joinPoint.getSignature().getName()+"执行耗时..."+(end-start)+"ms");
        return result;
    }


}
