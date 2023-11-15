package com.example.springRush.configurattion;

import com.example.springRush.proxies.CommentNotificationProxy;
import com.example.springRush.proxies.EmailCommentNotificationProxy;
import com.example.springRush.repositories.CommentRepository;
import com.example.springRush.repositories.DBCommentRepository;
import com.example.springRush.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(
//        basePackages = {"com.example.springRush.proxies", "com.example.springRush.services", "com.example.springRush.repositories"}
//)
public class ProjectConfiguration {
    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }
    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }
    @Bean
    public CommentService commentService(
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy) {
        return new CommentService(commentRepository,
                commentNotificationProxy);
    }

}