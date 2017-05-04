package com.greenfox.foxclub.Model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Gabor on 04/05/2017.
 */
@Component
public class ModelAndViewFactory {

  @Bean
  public ModelAndView getModelAndView(){
    return new ModelAndView();
  }

}
