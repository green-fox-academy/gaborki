package com.greenfox.integrationtesting;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class Drax {

  List<DraxFood> foodList;

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
      if (foodList.get(i).getNameOfFood().equals(food.getNameOfFood())){
        int index = i;
        increaseAmount(index, food.getCalories());
      }
    }
  }

  public boolean isListContaindItem(DraxFood food){
    for (DraxFood item : foodList){
      if (item.getNameOfFood().equals(food.getNameOfFood())){
        return true;
      }
    }
    return false;
  }

  public void increaseAmount(int indexOfitem, int calories){
    this.foodList.get(indexOfitem).changeAmountAndCalories(calories);
  }
}
