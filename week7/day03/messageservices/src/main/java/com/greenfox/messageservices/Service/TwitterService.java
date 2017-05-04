package com.greenfox.messageservices.Service;

import org.springframework.stereotype.Component;

@Component
public class TwitterService implements MessageService {


  @Override
  public void sendMessage(String message, String address) {
    System.out.println("Twitter message sent to @greenfoxacademy: " + message);
  }
}
