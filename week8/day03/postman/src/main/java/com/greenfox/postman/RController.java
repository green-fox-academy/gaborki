package com.greenfox.postman;

import com.greenfox.postman.Module.*;
import com.greenfox.postman.Repository.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
  @Autowired
  DoUntil doUntil;
  @Autowired
  LogRepo logRepo;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorHand ErrHandler(MissingServletRequestParameterException e) {
    errors.setError("Please provide a " + e.getParameterName() + "!");
    return errors;
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public ErrorHand ErrHandler2(HttpMessageNotReadableException e) {
    errors.setError("Please provide a number!");
    return errors;
  }

  @GetMapping("/doubling")
  public Doubling doubling(@RequestParam() int input) {
    dublo.setReceived(input);
    dublo.setResult(input * 2);
    return dublo;
  }

  @GetMapping("/greeter")
  public Greeter greet(@RequestParam() String name, @RequestParam String title) {
    greeter.setWelcome_message("Oh, hi there " + name + ", my dear " + title + "!");
    return greeter;
  }

  @GetMapping("/appenda/{appendable}")
  public Appenda appenda(@PathVariable String appendable) {
    appenda.setAppended(appendable + "a");
    return appenda;
  }

  @PostMapping("/dountil/{obj}")
  public DoUntil doItUntil(@PathVariable String obj, @RequestBody Until until) {
    int result = 0;
    if (obj.equals("sum")) {
      for (int i = 0; i <= until.getUntil(); i++) {
        result += i;
      }
    } else if (obj.equals("factor")) {
      result = 1;
      for (int i = 1; i <= until.getUntil(); i++) {
        result *= i;
      }
    }
    doUntil.setResult(result);
    return doUntil;
  }

  @PostMapping("/array")
  public ArrayHandler handleIt(@RequestBody ArrayHandlerInfo obj) {
    ArrayHandler arrayHandler = new ArrayHandler(obj.getWhat(), obj.getNumbers());
    return arrayHandler;
  }
}
