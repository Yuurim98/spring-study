package org.example;

import org.example.config.ProjectConfig;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
       var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("CommentService 참조 전");
        var commentService = context.getBean(CommentService.class);
        System.out.println("CommentService 참조 후");

//        CommentService 참조 전
//        CommentService 빈 생성
//        CommentService 참조 후

    }
}