package com.greenfox.messageservices.Configuration;

import com.greenfox.messageservices.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageProceeder {

  @Autowired
  private MessageService service;

  public void processMessage(String message, String address){
    this.service.sendMessage(message, address);
  }
}
