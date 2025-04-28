package org.example.config;

import org.example.aspects.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.services")
@EnableAspectJAutoProxy //애플리케이션에 AOP 활성화
public class ProjectConfig {

    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }
}
