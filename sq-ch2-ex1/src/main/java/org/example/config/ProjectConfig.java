package org.example.config;

import org.example.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링 구성 클래스 정의
public class ProjectConfig {

    @Bean(name = "Koko")
    public Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean(name = "Miki")
    public Parrot parrot2() {
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean(name = "Riki")
    public Parrot parrot3() {
        var p = new Parrot();
        p.setName("Riki");
        return p;
    }

}
