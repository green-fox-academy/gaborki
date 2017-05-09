package com.greenfox.foxclub.Controller;

import com.greenfox.foxclub.Model.Fox;
import com.greenfox.foxclub.Model.Trick;
import com.greenfox.foxclub.Model.TrickList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Gabor on 04/05/2017.
 */

@Controller
public class MainControl {

  @Autowired
  Fox fox;
  @Autowired
  Trick trick;
  @Autowired
  TrickList Lista;

  @RequestMapping("/")
  public ModelAndView index(){
    ModelAndView m = new ModelAndView();
    m.addObject(fox);
    m.addObject(Lista);
    Lista.fillList();
    for (Trick t : Lista.getTrickList()){
      System.out.println(t.toString());
    }
    System.out.println();
    m.setViewName("index");
    return m;
  }

  @RequestMapping("/nutritionStore")
  public ModelAndView nutritionStore(){
    ModelAndView m = new ModelAndView();
    m.setViewName("nutritionStore");
    m.addObject(fox);
    return m;
  }

  @RequestMapping("/tricks")
  public ModelAndView trick(){
    ModelAndView m = new ModelAndView();
    m.setViewName("tricks");
    m.addObject(fox);
    m.addObject(Lista);
    return m;
  }

  @RequestMapping("/learnTrick")
  public String learnTrick(Trick trick){
    fox.learnTricks(trick);
      return "redirect:/";
  }

  @RequestMapping("/addNutri")
  public String addNutrition(String foodToAdd, String drinkToAdd){
    fox.setDrink(drinkToAdd);
    fox.setFood(foodToAdd);
    return "redirect:/";
  }
}
