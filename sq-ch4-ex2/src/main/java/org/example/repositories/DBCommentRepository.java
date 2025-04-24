package org.example.repositories;

import org.example.model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("댓글 저장 : " + comment.getText());
    }
}
