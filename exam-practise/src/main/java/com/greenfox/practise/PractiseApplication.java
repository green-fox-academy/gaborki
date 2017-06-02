package com.greenfox.practise;

import com.greenfox.practise.module.TypeOfMeal;
import com.greenfox.practise.repository.TypeOfMealRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PractiseApplication implements CommandLineRunner{

	@Autowired
	TypeOfMealRepo typeOfMealRepo;

	public static void main(String[] args) {
		SpringApplication.run(PractiseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		typeOfMealRepo.save(new TypeOfMeal("Breakfast"));
		typeOfMealRepo.save(new TypeOfMeal("Elevenses"));
		typeOfMealRepo.save(new TypeOfMeal("Lunch"));
		typeOfMealRepo.save(new TypeOfMeal("Snack"));
		typeOfMealRepo.save(new TypeOfMeal("Dinner"));
		typeOfMealRepo.save(new TypeOfMeal("Midnight Dinner"));
	}
}
