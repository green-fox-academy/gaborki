package com.greenfox.foxclub.Model;

import java.util.ArrayList;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Fox {

  Name name;
  ArrayList<Tricks> tricks;
  Food food;
  Drink drink;

  public void setName(Name name) {
    this.name = name;
  }

  public void setTricks(ArrayList<Tricks> tricks) {
    this.tricks = tricks;
  }

  public void setFood(Food food) {
    this.food = food;
  }

  public void setDrink(Drink drink) {
    this.drink = drink;
  }
}
