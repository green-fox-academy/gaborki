package com.greenfox.todoweb2;

import com.greenfox.todoweb2.Module.Todo;
import com.greenfox.todoweb2.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Todoweb2Application implements CommandLineRunner {

	@Autowired
	TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(Todoweb2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("Drink my tea"));
		todoRepository.save(new Todo("Eat Lunch"));
		todoRepository.save(new Todo("Organise dinner for Thursday"));
		todoRepository.save(new Todo("Run tomorrow morning"));
	}
}

