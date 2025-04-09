package org.example.main;

import org.springframework.stereotype.Component;

@Component // 스테레오타입 어노테이션
public class Parrot {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
