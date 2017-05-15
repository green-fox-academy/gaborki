package com.greenfox.integrationtesting;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class Drax {

  private List<DraxFood> foodList;

  public Drax() {
    this.foodList = new ArrayList<>();
  }

  public List<DraxFood> getFoodList() {
    return foodList;
  }

  public void setFoodList(List<DraxFood> foodList) {
    this.foodList = foodList;
  }

  public void getIndexOfItemAndIncrease(DraxFood food) {
    for (int i = 0; i < foodList.size(); i++) {
      DraxFood item = foodList.get(i);
      if (item.getNameOfFood().equals(food.getNameOfFood()) && (item.getCalories() / item.getAmount() == food.getCalories()/food.getAmount())){
        this.foodList.get(i).addToAmountAndCalories(i, food.getAmount(), food.getCalories());
      }
    }
  }

  public boolean isListContainsItem(DraxFood food) {
    for (int i = 0; i < foodList.size(); i++) {
      DraxFood item = foodList.get(i);
      if (item.getNameOfFood().equals(food.getNameOfFood()) && (item.getCalories() / item.getAmount() == food.getCalories()/food.getAmount())){
          return true;
        }
      }
    return false;
  }

  public void addToFoodList(DraxFood food){
    if (!isListContainsItem(food)) {
      getFoodList().add(food);
    } else {
      getIndexOfItemAndIncrease(food);
    }
  }

  public void removeItem(String name, int amount){
    for (int i = 0; i < foodList.size(); i++) {
      if (foodList.get(i).getNameOfFood().equals(name)){
        this.foodList.get(i).setAmount(foodList.get(i).getAmount() - amount);
        this.foodList.get(i).setCalories(foodList.get(i).getCalories() - amount*(foodList.get(i).getCalories()/(foodList.get(i).getAmount()+1)));
        if (foodList.get(i).getAmount() == 0){
          foodList.remove(i);
        }
      }
    }
  }
}
