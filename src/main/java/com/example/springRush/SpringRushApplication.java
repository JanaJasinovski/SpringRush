package com.example.springRush;

import com.example.springRush.configurattion.ProjectConfiguration;
import com.example.springRush.model.Comment;
import com.example.springRush.proxies.EmailCommentNotificationProxy;
import com.example.springRush.repositories.DBCommentRepository;
import com.example.springRush.services.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringRushApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringRushApplication.class, args);
		var context =
				new AnnotationConfigApplicationContext(
						ProjectConfiguration.class);
		var comment = new Comment();
		comment.setAuthor("Laurentiu");
		comment.setText("Demo comment");
		var commentService = context.getBean(CommentService.class);
		commentService.publishComment(comment);
	}

}
