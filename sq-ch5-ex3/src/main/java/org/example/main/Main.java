package org.example.main;

import org.example.config.ProjectConfig;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service1 = context.getBean("commentService", CommentService.class);
        var service2 = context.getBean("commentService", CommentService.class);

        boolean result = service1 == service2;
        System.out.println(result); // false

    }

}