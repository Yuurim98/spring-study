package org.example.proxies;

import org.example.model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // 기본 빈 지정
public class CommentPushNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("댓글 알림으로 전송 : " + comment.getText());
    }
}
