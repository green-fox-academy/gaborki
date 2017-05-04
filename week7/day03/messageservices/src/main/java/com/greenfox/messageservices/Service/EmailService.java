package com.greenfox.messageservices.Service;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {

  @Override
  public void sendMessage(String message, String address) {
    System.out.println("Email sent to office@greenfox.com: " + message);
  }
}
