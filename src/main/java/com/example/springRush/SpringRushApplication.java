package com.example.springRush;

import com.example.springRush.config.ProjectConfig;
import com.example.springRush.model.Parrot;
import com.example.springRush.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class SpringRushApplication {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Person person =
				context.getBean(Person.class);
		Parrot parrot =
				context.getBean(Parrot.class);
		System.out.println(
				"Person's name: " + person.getName());
		System.out.println(
				"Parrot's name: " + parrot.getName());
		System.out.println(
				"Person's parrot: " + person.getParrot());
	}

}
