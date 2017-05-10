package com.greenfox.postman.Module;

import org.springframework.stereotype.Component;

@Component
public class Appenda {

  String appended;

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
