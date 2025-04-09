package org.example;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class); // 스프링 컨텍스트 인스턴스 생성
        
        Parrot p = context.getBean(Parrot.class); // 스프링 컨텍스트에서 Parrot 타입의 빈 참조 조회
        System.out.println(p.getName());
    }
}