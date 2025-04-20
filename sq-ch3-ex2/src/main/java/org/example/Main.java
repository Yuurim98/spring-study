package org.example;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // ProjectConfig 를 기반으로 스프링 컨텍스트 인스턴스 생성
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // context 에서 빈 참조를 얻음
        Person person = context.getBean(Person.class);

        System.out.println("Person name : " + person.getName());
        System.out.println("Person parrot : " + person.getParrot());

    }
}
