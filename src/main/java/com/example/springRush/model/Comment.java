package com.example.springRush.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Comment {
    private String text;
    private String author;
}
