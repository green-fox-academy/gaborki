package com.greenfox.postman.Module;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Component;

@Component
public class SithTextCreator {

  private String text;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ArrayList<String> splitAndSithText() {
//    ArrayList<String> sentences = new ArrayList<>(Arrays.asList(text.split(".")));
      ArrayList<String> sithList = new ArrayList<>();
//    for (String sentence : sentences) {
      ArrayList<String> words = new ArrayList<>(Arrays.asList(text.split(" ")));
      if (words.size() % 2 == 0) {
        for (int i = 0; i < words.size() - 1; i += 2) {
          sithList.add(words.get(i + 1).toLowerCase());
          sithList.add(words.get(i).toLowerCase());
        }
      } else {
        for (int i = 0; i < words.size() - 2; i += 2) {
          sithList.add(words.get(i + 1).toLowerCase());
          sithList.add(words.get(i).toLowerCase());
        }
//        sithList.add(words.get(words.size() - 1));
      }
    return sithList;
  }

  public String randomWordCreator() {
    ArrayList<String> random = new ArrayList<>(
        Arrays.asList(" Arrrgh.", " Errrm.", " Uhhmm.", " Fuckkk!", " Shiiiit..."));
    String randomWords = new String();
    int numberOfwords = (int) (Math.random() * 3) + 1;
    for (int i = 0; i < numberOfwords; i++) {
      randomWords += random.get((int) (Math.random() * (random.size() - 1)));
    }
    return randomWords;
  }

  public String convertToString(ArrayList<String> text) {
    String res = new String();
    for (String word : text) {
        res += word + " ";
    }
    if (res.length()>0) {
      res = res.substring(0, 1).toUpperCase() + res.substring(1, res.length() - 1) + "."
          + randomWordCreator();
    }
    return res;
  }
}
