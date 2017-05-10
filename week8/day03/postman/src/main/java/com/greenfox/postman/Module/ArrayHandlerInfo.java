package com.greenfox.postman.Module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArrayHandlerInfo {

  private String what;
  private int[] numbers;

  public int length(){
   return numbers.length;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public int get(int index){
    return numbers[index];
  }
}
