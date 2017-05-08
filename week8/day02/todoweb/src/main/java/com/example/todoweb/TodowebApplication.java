package com.example.todoweb;

import com.example.todoweb.Module.Todo;
import com.example.todoweb.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodowebApplication implements CommandLineRunner{

  @Autowired
  private TodoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(TodowebApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
	  repository.save(new Todo("I have to learn shit loads"));
	  repository.save(new Todo("Dont overrate sleeping"));
	  repository.save(new Todo("Drink water"));

  }
}
