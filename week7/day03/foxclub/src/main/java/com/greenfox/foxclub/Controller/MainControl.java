package com.greenfox.foxclub.Controller;

import com.greenfox.foxclub.Model.ModelAndViewFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Gabor on 04/05/2017.
 */

@Controller
public class MainControl {

  @Autowired
  ModelAndView m;

  @RequestMapping("/")
  public ModelAndView index(){
    m.setViewName("index");
    return m;

  }

}
