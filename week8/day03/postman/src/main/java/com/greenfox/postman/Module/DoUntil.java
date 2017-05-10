package com.greenfox.postman.Module;

import org.springframework.stereotype.Component;

@Component
public class DoUntil {

  private int result;

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
