package com.greenfox.postman;

import com.greenfox.postman.Module.Appenda;
import com.greenfox.postman.Module.Doubling;
import com.greenfox.postman.Module.ErrorHand;
import com.greenfox.postman.Module.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController {

  @Autowired
  Doubling dublo;
  @Autowired
  Greeter greeter;
  @Autowired
  ErrorHand errors;
  @Autowired
  Appenda appenda;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorHand ErrHandler(MissingServletRequestParameterException e){
      errors.setError("Please provide a " + e.getParameterName() + "!");
    return errors;
  }

  @GetMapping("/doubling")
  public Doubling doubling(@RequestParam() int input){
    dublo.setReceived(input);
    dublo.setResult(input*2);
    return dublo;
  }

  @GetMapping("/greeter")
  public Greeter greet(@RequestParam() String name, @RequestParam String title){
    greeter.setWelcome_message("Oh, hi there " + name + ", my dear " + title + "!");
    return greeter;
  }

  @GetMapping("/appenda/{appendable}")
  public Appenda appenda(@PathVariable String appendable){
    appenda.setAppended(appendable + "a");
    return appenda;

  }

}
