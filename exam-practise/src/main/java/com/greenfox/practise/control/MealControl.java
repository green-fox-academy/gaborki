package com.greenfox.practise.control;

import com.greenfox.practise.module.Meal;
import com.greenfox.practise.repository.MealRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MealControl {

  @Autowired
  MealRepo mealRepo;

  @GetMapping("/")
  public String index(){
    return "index";
  }

  @GetMapping("addOrEdit")
  public String addOrEditPage(){
    return "addOrEdit";
  }

  @GetMapping("addOrEdit/addMeal")
  public String addMeal(@RequestParam("meal") Meal meal){
    mealRepo.save(meal);
    return "redirect/";
  }

  @GetMapping("addOrEdit/editMeal")
  public String editMeal(){
    return "edit";
  }

  @GetMapping("/delete")
  public String delete(@RequestParam("id") long id){
    mealRepo.delete(id);
    return "redirect:/";
  }


}
