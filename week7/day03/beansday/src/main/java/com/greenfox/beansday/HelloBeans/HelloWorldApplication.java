package com.greenfox.beansday.HelloBeans;

import com.greenfox.beansday.HelloBeans.Color.ColorConfig;
import com.greenfox.beansday.HelloBeans.Color.Red;
import com.greenfox.beansday.HelloBeans.HelloBeans.HelloWorld;
import com.greenfox.beansday.HelloBeans.HelloBeans.HelloWorldConfig;
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

		ApplicationContext colorFactory = new AnnotationConfigApplicationContext(ColorConfig.class);
		Red red = colorFactory.getBean(Red.class);
		red.printColor();
	}
}
