package org.example.repositories;

import org.example.model.Comment;

public class DBCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("댓글 저장 : " + comment.getText());
    }
}
