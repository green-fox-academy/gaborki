package com.greenfox.integrationtesting;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @Autowired
  Groot groot;
  @Autowired
  Error error;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public Error noMessage(MissingServletRequestParameterException e){
    error.setError("I am Groot");
    return error;
  }

  @GetMapping("/groot")
  public Groot grootMessage(@RequestParam String message){
    groot.setReceived(message);
    groot.setTranslated("I am Groot");
    return groot;
  }
}
