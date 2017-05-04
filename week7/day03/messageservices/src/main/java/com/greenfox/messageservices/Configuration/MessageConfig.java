package com.greenfox.messageservices.Configuration;

import com.greenfox.messageservices.Service.EmailService;
import com.greenfox.messageservices.Service.MessageService;
import com.greenfox.messageservices.Service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class MessageConfig {

  @Bean
  public MessageService getTwitterService() {
    return new TwitterService();
  }

  @Bean
  @Primary
  public MessageService getEmailService(){
    return new EmailService();
  }
}
