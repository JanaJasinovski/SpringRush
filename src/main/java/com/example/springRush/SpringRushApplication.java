package com.example.springRush;

import com.example.springRush.configuration.ProjectConfig;
import com.example.springRush.model.Comment;
import com.example.springRush.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

//@SpringBootApplication
public class SpringRushApplication {
	private static Logger logger = Logger.getLogger(SpringRushApplication.class.getName());

	public static void main(String[] args) {
//		SpringApplication.run(SpringRushApplication.class, args);

		var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var service = c.getBean(CommentService.class);
		Comment comment = new Comment();
		comment.setText("Demo comment");
		comment.setAuthor("Natasha");
		String value = service.publishComment(comment);
		logger.info(value);
	}

}
