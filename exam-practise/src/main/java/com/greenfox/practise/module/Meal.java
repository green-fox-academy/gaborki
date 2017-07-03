package com.greenfox.practise.module;

import java.lang.String;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Meal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long ID;

  private String date;
  private String type;
  private String description;
  private int calories;

  public Meal() {
  }

  public Meal(String date, String type, String description, int calories) {
    this.date = date;
    this.type = type;
    this.description = description;
    this.calories = calories;
  }

  public Meal(long id, String date, String type, String description, int calories) {
    this.ID = id;
    this.date = date;
    this.type = type;
    this.description = description;
    this.calories = calories;
  }

  public long getID() {
    return ID;
  }

  public void setID(long ID) {
    this.ID = ID;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
