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

  @Autowired Doubling dublo;
  @Autowired Greeter greeter;
  @Autowired ErrorHand errors;
  @Autowired Appenda appenda;
  @Autowired DoUntil doUntil;
  @Autowired LogRepo logRepo;
  @Autowired
  SithText sithText;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorHand ErrHandler(MissingServletRequestParameterException e) {
    if (e.getParameterName().equals("input")){
      errors.setError("Please provide an " + e.getParameterName() + "!");
    }else {
      errors.setError("Please provide a " + e.getParameterName() + "!");
    }
    logRepo.save(new Log("/error", errors));

    return errors;
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public ErrorHand ErrHandler2(HttpMessageNotReadableException e) {
    errors.setError("Please provide a number!");
    logRepo.save(new Log("/error", errors));
    return errors;
  }

  @GetMapping("/doubling")
  public Doubling doubling(@RequestParam() int input) {
    dublo.setReceived(input);
    dublo.setResult(input * 2);
    logRepo.save(new Log("/doubling", dublo));
    return dublo;
  }

  @GetMapping("/greeter")
  public Greeter greet(@RequestParam() String name, @RequestParam String title) {
    greeter.setWelcome_message("Oh, hi there " + name + ", my dear " + title + "!");
    logRepo.save(new Log("/greeter", greeter));
    return greeter;
  }

  @GetMapping("/appenda/{appendable}")
  public Appenda appenda(@PathVariable String appendable) {
    appenda.setAppended(appendable + "a");
    logRepo.save(new Log("/appenda/" + appendable, appenda));
    return appenda;
  }

  @PostMapping("/dountil/{obj}")
  public DoUntil doItUntil(@PathVariable String obj, @RequestBody Until until) {
    int result = 0;
    if (obj.equals("sum")) {
      for (int i = 1; i <= until.getUntil(); i++) {
        result += i;
      }
    } else if (obj.equals("factor")) {
      result = 1;
      for (int i = 1; i <= until.getUntil(); i++) {
        result *= i;
      }
    }
    doUntil.setResult(result);
    logRepo.save(new Log("/dountil/" + obj, doUntil));
    return doUntil;
  }

  @PostMapping("/array")
  public ArrayHandler handleIt(@RequestBody ArrayHandlerInfo obj) {
    ArrayHandler arrayHandler = new ArrayHandler(obj.getWhat(), obj.getNumbers());
    logRepo.save(new Log("/array", arrayHandler));
    return arrayHandler;
  }

  @PostMapping("/sith")
  public SithText sith(@RequestBody SithTextCreator text) {
    sithText.setSith_text(text.convertToString(text.splitAndSithText()));
    return sithText;
  }
}
