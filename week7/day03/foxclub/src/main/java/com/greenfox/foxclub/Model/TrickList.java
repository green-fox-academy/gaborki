package com.greenfox.foxclub.Model;

import java.util.ArrayList;
import java.util.Arrays;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Component
@Getter
@Setter
public class TrickList {

  private ArrayList<Trick> trickList;
  private ArrayList<String> trickToLearn = new ArrayList<>(
      Arrays.asList("Write HTML", "Code in Java", "Run fast", "Eat Rabbit", "Spin on head"));

  public TrickList() {
    this.trickList = new ArrayList<>();
  }

  public void fillList() {
    for (String t : trickToLearn) {
      this.trickList.add(new Trick(t));
    }
  }

}
