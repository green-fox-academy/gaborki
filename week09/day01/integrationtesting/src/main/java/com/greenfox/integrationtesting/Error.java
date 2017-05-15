package com.greenfox.integrationtesting;


import org.springframework.stereotype.Component;

@Component
public class Error {

  private String error;

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
