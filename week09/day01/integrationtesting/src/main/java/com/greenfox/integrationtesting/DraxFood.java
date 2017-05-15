package com.greenfox.integrationtesting;


public class DraxFood {

  private String nameOfFood;
  private int calories;
  private int amount = 1;

  public DraxFood(String nameOfFood, int calories) {
    this.nameOfFood = nameOfFood;
    this.calories = calories;
  }

  public void changeAmountAndCalories(int calories) {
    this.setAmount(this.getAmount() + 1);
    this.setCalories(this.getCalories() + calories);
  }

  public String getNameOfFood() {
    return nameOfFood;
  }

  public void setNameOfFood(String nameOfFood) {
    this.nameOfFood = nameOfFood;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }
}


