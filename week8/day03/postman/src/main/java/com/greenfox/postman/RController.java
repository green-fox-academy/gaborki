package com.greenfox.postman;

import com.greenfox.postman.Module.Doubling;
import com.greenfox.postman.Module.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController {

  @Autowired
  Doubling dublo;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public Doubling exHandler(){
    dublo.setError("Please provide an input!");
    return dublo;
  }

  @GetMapping("/doubling")
  public Doubling doubling(@RequestParam() int input){
    dublo.setReceived(input);
    dublo.setResult(input*2);
    return dublo;
  }

  @GetMapping("/greeter")
  public Greeter greet

  }

}
