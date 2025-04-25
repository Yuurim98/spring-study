package org.example.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private ApplicationContext context;

    public void sendComment(Comment comment) {
        CommentProcessor processor = context.getBean(CommentProcessor.class);
        processor.setComment(comment);
        processor.processComment(comment);
        processor.validateComment(comment);
        comment = processor.getComment(); // 수정된 인스턴스 가져와 사용
        System.out.println(processor);
        // 추가 작업
    }
}
