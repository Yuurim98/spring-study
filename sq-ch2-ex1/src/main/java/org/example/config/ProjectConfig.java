package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링 구성 클래스 정의
@ComponentScan(basePackages = "org.example.main")
public class ProjectConfig {


}
