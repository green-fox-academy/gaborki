package com.greenfox.integrationtesting;

/**
 * Created by Gabor on 15/05/2017.
 */
public class YonduError {

  private String error;

  public YonduError(String message){
    this.error = message;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
