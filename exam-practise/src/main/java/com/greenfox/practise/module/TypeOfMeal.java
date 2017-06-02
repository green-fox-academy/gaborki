package com.greenfox.practise.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeOfMeal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String mealType;

  public TypeOfMeal() {
  }

  public TypeOfMeal(String mealType) {
    this.mealType = mealType;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getMealType() {
    return mealType;
  }

  public void setMealType(String mealType) {
    this.mealType = mealType;
  }
}
