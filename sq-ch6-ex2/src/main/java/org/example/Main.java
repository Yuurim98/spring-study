package org.example;

import org.example.config.ProjectConfig;
import org.example.model.Comment;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("댓글");
        comment.setAuthor("홍길동");

        service.publishComment(comment);
    }
}