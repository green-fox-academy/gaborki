package com.greenfox.foxclub.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Component
@Getter
@Setter
public class Fox {

  private String name;
  private String food;
  private String drink;
  private ArrayList<Trick> learnedList;

  public Fox() {
    this.name = "Foxi";
    this.food = "nothing";
    this.drink = "nothing";
    this.learnedList = new ArrayList<>();
  }

  public void learnTricks(Trick trick) {
    learnedList.add(trick);
  }

  public boolean isTrickLearned(Trick trick){
    return learnedList.contains(trick);
  }
}
