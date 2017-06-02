package com.greenfox.practise.module;


import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Meal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long ID;

  private LocalDateTime date;
  private String typeOfmeal;
  private String description;
  private int calories;

  public Meal() {
  }

  public Meal(LocalDateTime date, String typeOfmeal, String description, int calories) {
    this.date = date;
    this.typeOfmeal = typeOfmeal;
    this.description = description;
    this.calories = calories;
  }

  public long getID() {
    return ID;
  }

  public void setID(long ID) {
    this.ID = ID;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public String getTypeOfmeal() {
    return typeOfmeal;
  }

  public void setTypeOfmeal(String typeOfmeal) {
    this.typeOfmeal = typeOfmeal;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }
}
