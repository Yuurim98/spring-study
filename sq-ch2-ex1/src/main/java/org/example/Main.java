package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        
        var context = new AnnotationConfigApplicationContext(); // 스프링 컨텍스트 인스턴스 생성
        
        Parrot p = new Parrot();
    }
}