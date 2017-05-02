package com.greenfoxacademy.springstart.Controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloWEBController {

  AtomicLong count = new AtomicLong(1);

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam ("yourName") String yourName) {
    model.addAttribute("name", yourName);
    model.addAttribute("countIt", count.getAndIncrement());
    return "greeting";
  }
}
