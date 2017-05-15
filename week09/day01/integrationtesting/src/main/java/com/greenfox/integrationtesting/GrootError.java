package com.greenfox.integrationtesting;

/**
 * Created by Gabor on 15/05/2017.
 */
public class GrootError implements Error {

  private String error;

  public GrootError(String message){
    this.error = message;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
