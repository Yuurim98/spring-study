package org.example.main;

import org.example.config.ProjectConfig;
import org.example.services.CommentService;
import org.example.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext((ProjectConfig.class));
        
        var commentService = context.getBean(CommentService.class);
        var userService = context.getBean(UserService.class);

        boolean result = commentService.getCommentRepository() == userService.getCommentRepository();

        System.out.println(result); // true
    }
}
