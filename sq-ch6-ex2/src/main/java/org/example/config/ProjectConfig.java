package org.example.config;

import org.example.aspects.LoggingAspect;
import org.example.aspects.SecurityAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.services")
@EnableAspectJAutoProxy //애플리케이션에 AOP 활성화
public class ProjectConfig {

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

    @Bean
    public SecurityAspect securityAspect() {
        return new SecurityAspect();
    }
}
