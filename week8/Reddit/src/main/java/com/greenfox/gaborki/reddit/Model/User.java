package com.greenfox.gaborki.reddit.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

  @Id
  String userName;
  @GeneratedValue(strategy = GenerationType.AUTO)
  long userID;

  public User() {
  }

  public User(String name){
    this.userName = name;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
