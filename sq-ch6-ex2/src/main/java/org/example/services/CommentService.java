package org.example.services;

import java.util.logging.Logger;
import org.example.aspects.ToLog;
import org.example.model.Comment;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment) {
        logger.info("댓글: " + comment.getText());
        return "성공";
    }
}