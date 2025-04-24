package org.example.main;

import org.example.configuration.ProjectConfiguration;
import org.example.model.Comment;
import org.example.proxies.EmailCommentNotificationProxy;
import org.example.repositories.DBCommentRepository;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("길동이");
        comment.setText("안녕하세요");

        var commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);
    }
}