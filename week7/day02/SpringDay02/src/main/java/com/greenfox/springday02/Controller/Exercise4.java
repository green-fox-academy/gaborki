package com.greenfox.springday02.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exercise4 {

  @RequestMapping("/empty")
  public String ex4(Model model){
    String task = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", task);
    return "exercise4";
  }

}
