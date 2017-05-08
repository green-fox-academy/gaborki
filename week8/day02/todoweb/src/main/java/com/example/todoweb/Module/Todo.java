package com.example.todoweb.Module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Gabor on 08/05/2017.
 */
@Entity
@Getter
@Setter
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int ID;

  private String title;
  private boolean isUrgent = false;
  private boolean isDone = false;

  public Todo(){
  }

  public Todo(String name){
    this.title = name;
  }
}
