package org.example;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class); // 스프링 컨텍스트 인스턴스 생성

        // 빈 타입이 동일하기 때문에 예외가 발생함
        // Parrot p = context.getBean(Parrot.class); // 스프링 컨텍스트에서 Parrot 타입의 빈 참조 조회
        Parrot p = context.getBean("Miki", Parrot.class);
        System.out.println(p.getName());
    }
}