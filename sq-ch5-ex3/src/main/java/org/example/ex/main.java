package org.example.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(CommentService.class);

        service.sendComment(new Comment());
        service.sendComment(new Comment());
//        org.example.ex.CommentProcessor@65fb9ffc
//        org.example.ex.CommentProcessor@65fb9ffc
    }
}

