package com.example.todoweb.Module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

/**
 * Created by Gabor on 08/05/2017.
 */
@Component
@Getter
@Setter
@Table(name = "tables")
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int ID;
  private String title;
  private boolean isUrgent = false;
  private boolean isDone = false;

  public Todo(){
  }
}
