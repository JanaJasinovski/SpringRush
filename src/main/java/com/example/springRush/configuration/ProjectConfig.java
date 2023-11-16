package com.example.springRush.configuration;

import com.example.springRush.aspects.LoggingAspect;
import com.example.springRush.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.example.springRush.services")
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public CommentService commentService() {
        return new CommentService();
    }

    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }
}
