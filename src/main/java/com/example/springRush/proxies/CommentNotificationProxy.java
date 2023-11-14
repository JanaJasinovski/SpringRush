package com.example.springRush.proxies;

import com.example.springRush.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
