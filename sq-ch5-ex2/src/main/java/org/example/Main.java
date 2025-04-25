package org.example;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
       var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
       // CommentService 빈 사용 X -> CommentService 빈 생성 콘솔 출력
    }
}