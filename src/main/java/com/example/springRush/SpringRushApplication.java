package com.example.springRush;

import com.example.springRush.config.ProjectConfig;
import com.example.springRush.model.Parrot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

//@SpringBootApplication
public class SpringRushApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringRushApplication.class, args);

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//		Parrot p = context.getBean("parrot2", Parrot.class);
//		Parrot p = context.getBean(Parrot.class);
//		System.out.println(p);
//		System.out.println(p.getName());

		Parrot x = new Parrot();
		x.setName("Kiki");
		Supplier<Parrot> parrotSupplier = () -> x;
		context.registerBean("parrot1",
				Parrot.class, parrotSupplier);

		Parrot p = context.getBean(Parrot.class);
		System.out.println(p.getName());
//		String s = context.getBean(String.class);
//		System.out.println(s);
//		Integer n = context.getBean(Integer.class);
//		System.out.println(n);
	}

}
