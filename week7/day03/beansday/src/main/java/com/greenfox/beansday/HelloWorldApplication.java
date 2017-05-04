package com.greenfox.beansday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);

		ApplicationContext factory = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld printhello = factory.getBean(HelloWorld.class);
		printhello.setMessage("helloooooo!");
		printhello.getMessage();
	}
}
