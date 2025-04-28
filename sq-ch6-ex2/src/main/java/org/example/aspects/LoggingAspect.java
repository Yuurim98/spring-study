package org.example.aspects;

import java.util.logging.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Logging Aspect: 메서드 호출");
        Object returnedValue = joinPoint.proceed(); // 메서드 호출
        logger.info("Logging Aspect: 메서드 실행 및 반환 " + returnedValue);
        return returnedValue;
    }

}
