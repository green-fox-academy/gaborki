package com.greenfox.practise.repository;

import com.greenfox.practise.module.Meal;
import org.springframework.data.repository.CrudRepository;


public interface MealRepo extends CrudRepository<Meal,Long> {

}
