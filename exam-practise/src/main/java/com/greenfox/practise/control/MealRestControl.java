package com.greenfox.practise.control;

import com.greenfox.practise.module.Meal;
import com.greenfox.practise.module.Stat;
import com.greenfox.practise.module.Status;
import com.greenfox.practise.repository.MealRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealRestControl {

  @Autowired
  MealRepo mealRepo;

  @GetMapping("/getmeals")
  public List<Meal> getMeals() {
    List<Meal> mealList = mealRepo.findAll();
    return mealList;
  }

  @GetMapping("/getstats")
  public Stat getStats(){;
    int totalCalories = 0;
    for (Meal m : mealRepo.findAll()) {
      totalCalories += m.getCalories();
    }
    Stat stats = new Stat(mealRepo.count(), totalCalories);
    return stats;
  }

  @PostMapping("/meal")
  public ResponseEntity<?> addMeal(@RequestBody Meal meal){
    Meal mealToAdd = new Meal(meal.getDate(),meal.getType(), meal.getDescription(), meal.getCalories());
    mealRepo.save(mealToAdd);
    return new ResponseEntity(new Status("ok"), HttpStatus.OK);
  }

  @PutMapping ("/meal")
  public ResponseEntity<?> updateMeal(@RequestBody Meal meal){
    mealRepo.save(new Meal(meal.getID(), meal.getDate(),meal.getType(), meal.getDescription(), meal.getCalories()));
    return new ResponseEntity(new Status("ok"), HttpStatus.OK);
  }

  @DeleteMapping("/meal")
  public ResponseEntity<?> deleteMeal(@RequestBody Meal meal){
    mealRepo.delete(meal.getID());
    return new ResponseEntity<Object>(new Status("ok"), HttpStatus.OK);
  }

}
