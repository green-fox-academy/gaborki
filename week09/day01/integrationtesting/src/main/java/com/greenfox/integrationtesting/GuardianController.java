package com.greenfox.integrationtesting;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public Error GrootErrorMessage(MissingServletRequestParameterException e) {
    if (e.getParameterName().equals("message")) {
      return new GrootError("I am Groot");
    } else {
      return new YonduError("Incorrect parameters given");
    }
  }

  @GetMapping("/groot")
  public Groot grootMessage(@RequestParam String message){
    return new Groot(message);
  }

  @GetMapping("/yondu")
  public Yondu calculateSpeed(@RequestParam float distance, @RequestParam float time){
    return new Yondu(distance, time);
  }
}
