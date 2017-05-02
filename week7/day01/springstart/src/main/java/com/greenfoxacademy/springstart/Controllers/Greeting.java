package com.greenfoxacademy.springstart.Controllers;

import java.util.concurrent.atomic.AtomicLong;
import lombok.AllArgsConstructor;

/**
 * Created by Gabor on 02/05/2017.
 */
@AllArgsConstructor
public class Greeting {

  private long ID;
  private String content;

  public long getID() {
    return ID;
  }

  public String getContent() {
    return content;
  }
}
