package com.greenfox.postman.Module;

import org.springframework.stereotype.Component;

@Component
public class ErrorHand {

  private String error;

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
