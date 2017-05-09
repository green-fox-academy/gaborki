package com.greenfox.todoweb2.Module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long ID;

  private String title;
  private boolean isUrgent = false;
  private boolean isDone = false;

  public Todo(){
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public boolean isDone() {
    return isDone;
  }

  public Todo(String name){
    this.title = name;
  }
}
