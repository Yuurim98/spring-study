package org.example.services;

import java.util.logging.Logger;
import org.example.aspects.ToLog;
import org.example.model.Comment;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("댓글: " + comment.getText());
        return "성공";
    }

    @ToLog
    public void deleteComment(Comment comment) {
     logger.info("삭제: " + comment.getText());
    }

    public void editComment(Comment comment) {
        logger.info("수정:" + comment.getText());
    }
}
