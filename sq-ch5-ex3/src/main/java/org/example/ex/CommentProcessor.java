package org.example.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    private Comment comment;

    @Autowired
    private CommentRepository commentRepository;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void processComment(Comment comment) {
        // comment 변경
    }

    public void validateComment(Comment comment) {
        // comment 검증
    }
}
