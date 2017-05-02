package com.greenfoxacademy.springstart.Controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Gabor on 02/05/2017.
 */

@RestController
public class HelloRESTController {

  AtomicLong counter = new AtomicLong(1);

  @ResponseBody
  @RequestMapping("/greeting")
  public Greeting greetings(@RequestParam("name") String name){
    Greeting greet = new Greeting(counter.getAndIncrement(), "Hello " + name + "!");
    return greet;
  }
}
