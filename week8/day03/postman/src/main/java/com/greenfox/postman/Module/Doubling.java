package com.greenfox.postman.Module;


import org.springframework.stereotype.Component;

@Component
public class Doubling {
  private int received;
  private int result;

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
