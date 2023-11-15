package com.example.springRush.services;

import com.example.springRush.model.Comment;
import com.example.springRush.model.CommentProcessor;
import com.example.springRush.proxies.CommentNotificationProxy;
import com.example.springRush.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    private ApplicationContext context;
    public void sendComment(Comment c) {
        CommentProcessor p =
                context.getBean(CommentProcessor.class);
        p.setComment(c);
        p.processComment(c);
        p.validateComment(c);
        c = p.getComment();
// сделать что-нибудь еще
    }
}