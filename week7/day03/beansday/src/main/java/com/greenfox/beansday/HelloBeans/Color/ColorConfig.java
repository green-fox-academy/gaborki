package com.greenfox.beansday.HelloBeans.Color;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Gabor on 04/05/2017.
 */
@Configuration
public class ColorConfig {

  @Bean
  public Red red(){
    return new Red();
    }
  }

