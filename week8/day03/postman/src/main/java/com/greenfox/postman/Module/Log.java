package com.greenfox.postman.Module;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Log {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int ID;
  private String createdAt;
  private String endpoint;
  private String data;

  public Log(String endpoint, Object object) {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
    ObjectMapper objectMapper = new ObjectMapper();
    this.createdAt = now.format(formatter);
    this.endpoint = endpoint;
    try {
      this.data = objectMapper.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }

    
  }
}
