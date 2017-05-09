package com.greenfox.foxclub.Model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Trick {

  private String name;
  private boolean isLearned;

  public Trick(){
    this.name = "";
    this.isLearned = false;
  }

  public Trick(String name) {
    this.name = name;
    this.isLearned = false;
  }

  @Override
  public String toString(){
    return this.name;
  }
}
