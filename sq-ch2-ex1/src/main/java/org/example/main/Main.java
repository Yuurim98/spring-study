package org.example.main;

import java.util.function.Supplier;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class); // 스프링 컨텍스트 인스턴스 생성

        Parrot2 x = new Parrot2(); // 스프링 컨텍스트에 추가하고 싶은 인스턴스 생성
        x.setName("Kiki");

        Supplier<Parrot2> parrot2Supplier = () -> x;

        context.registerBean("parrot1", Parrot2.class, parrot2Supplier); // 해당 인스턴스를 컨텍스트에 추가
        Parrot2 p = context.getBean(Parrot2.class);
        System.out.println(p);
        System.out.println(p.getName());
    }
}