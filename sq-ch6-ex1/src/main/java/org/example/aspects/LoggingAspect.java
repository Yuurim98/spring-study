package org.example.aspects;

import java.util.Arrays;
import java.util.logging.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* org.example.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName(); // 메서드 이름
        Object[] arguments = joinPoint.getArgs(); // 매개변수 이름
        logger.info("메서드명 " + methodName + "매개변수 " + Arrays.asList(arguments));
        Object returnByMethod = joinPoint.proceed(); // 메서드 호출
        logger.info("메서드 반환 " + returnByMethod);

        returnByMethod += " 반환 값 수정";
        return returnByMethod;
    }

}
