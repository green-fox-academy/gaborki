package com.greenfox.practise.module;

import org.springframework.stereotype.Component;

@Component
public class Stat {

  private long numberOfMeals;
  private int totalcalories;

  public Stat() {
  }

  public Stat(long numberOfMeals, int totalcalories) {
    this.numberOfMeals = numberOfMeals;
    this.totalcalories = totalcalories;
  }

  public long getNumberOfMeals() {
    return numberOfMeals;
  }

  public void setNumberOfMeals(long numberOfMeals) {
    this.numberOfMeals = numberOfMeals;
  }

  public int getTotalcalories() {
    return totalcalories;
  }

  public void setTotalcalories(int totalcalories) {
    this.totalcalories = totalcalories;
  }
}
