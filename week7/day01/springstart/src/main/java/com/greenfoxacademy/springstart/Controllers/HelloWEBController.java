package com.greenfoxacademy.springstart.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Gabor on 02/05/2017.
 */

@RestController
public class HelloWEBController {

  @RequestMapping("/web/greeting")
  @ResponseBody
  public Model greeting(Model model) {
    model.addAttribute("name", " World");
    return model;
  }
}
