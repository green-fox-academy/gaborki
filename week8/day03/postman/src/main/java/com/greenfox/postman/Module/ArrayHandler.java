package com.greenfox.postman.Module;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

public class ArrayHandler {

  private Object result;

  public ArrayHandler(String command, int[] numbers) {
    int endResult = 0;
    if (command.equals("sum")) {
      for (int i = 0; i < numbers.length; i++) {
        endResult += numbers[i];
      }
      result = endResult;
    } else if (command.equals("multiply")) {
      endResult = 1;
      for (int i = 0; i < numbers.length; i++) {
        endResult *= numbers[i];
      }
    } else if (command.equals("double")) {
      List<Integer> doubleList = new ArrayList<>();
      for (int i = 0; i < numbers.length; i++) {
        doubleList.add(numbers[i] * 2);
      }
      result = doubleList;
    }
  }

  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }
}
