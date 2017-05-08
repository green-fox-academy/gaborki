package com.greenfox.foxclub.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Gabor on 04/05/2017.
 */
@Configuration
public class ModelAndViewFactory {

  @Bean
  public ModelAndView getModelAndView(){
    return new ModelAndView();
  }

}
