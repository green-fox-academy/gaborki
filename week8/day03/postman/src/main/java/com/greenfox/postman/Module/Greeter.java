package com.greenfox.postman.Module;


import org.springframework.stereotype.Component;

@Component
public class Greeter {

private String welcome_message;

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
