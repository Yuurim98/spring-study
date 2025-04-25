package org.example.services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy // 빈을 처음 참조할 때 생성
public class CommentService {

    public CommentService() {
        System.out.println("CommentService 빈 생성");
    }
}
