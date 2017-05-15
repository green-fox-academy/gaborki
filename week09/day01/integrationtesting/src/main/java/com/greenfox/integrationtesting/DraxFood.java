package com.greenfox.integrationtesting;

public class DraxFood {

  private String nameOfFood;
  private int calories;
  private int amount;

  public DraxFood(String nameOfFood, int amount, int calories) {
    this.nameOfFood = nameOfFood;
    this.amount = amount;
    this.calories = calories * amount;
  }

  public void addToAmountAndCalories(int index, int amount, int calories) {
    if (this.getCalories() != 0){
      this.setCalories(this.getCalories() + (this.getCalories()/this.getAmount())*amount);
      this.setAmount(this.getAmount() + amount);
    } else {
      this.setCalories(amount * calories);
    }
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
